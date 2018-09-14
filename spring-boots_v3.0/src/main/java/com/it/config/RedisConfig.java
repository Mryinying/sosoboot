package com.it.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.data.redis.cache.DefaultRedisCachePrefix;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

import redis.clients.jedis.JedisPoolConfig;

@Configuration
@EnableAutoConfiguration
@EnableCaching
public class RedisConfig {

	private final static Logger logger = LoggerFactory.getLogger(RedisConfig.class);

	// 获取springboot配置文件的值 (get的时候获取)
	@Value("${spring.redis.hostName}")
	private String host;

	@Value("${spring.redis.password}")
	private String password;

	// @Bean
	// public static PropertySourcesPlaceholderConfigurer
	// propertySourcesPlaceholderConfigurer() {
	// return new PropertySourcesPlaceholderConfigurer();
	// }

	@Bean
	@ConfigurationProperties(prefix = "spring.redis")
	public JedisPoolConfig getRedisConfig() {
		JedisPoolConfig config = new JedisPoolConfig();
		return config;
	}

	@Bean
	@ConfigurationProperties(prefix = "spring.redis")
	public JedisConnectionFactory getConnectionFactory() {
		JedisConnectionFactory factory = new JedisConnectionFactory();
		JedisPoolConfig config = getRedisConfig();
		factory.setPoolConfig(config);
		logger.info("JedisConnectionFactory bean init success.");
		return factory;
	}

//	@Bean
//	public RedisTemplate<?, ?> getRedisTemplate() {
//		JedisConnectionFactory factory = getConnectionFactory();
//		logger.info(this.host + "," + factory.getHostName() + "," + factory.getDatabase());
//		logger.info(this.password + "," + factory.getPassword());
//		logger.info(factory.getPoolConfig().getMaxIdle() + "");
//		RedisTemplate<?, ?> template = new StringRedisTemplate(factory);
//		return template;
//	}

	/**
	 * 定义 StringRedisTemplate ，指定序列化和反序列化的处理类
	 * 
	 * @param factory
	 * @return
	 */
	@Bean
	public RedisTemplate<?, ?> getRedisTemplate() {
		JedisConnectionFactory factory = getConnectionFactory();
		StringRedisTemplate template = new StringRedisTemplate(factory);
		//JacksonJsonRedisSerializer和GenericJackson2JsonRedisSerializer，两者都能系列化成json，但是后者会在json中加入@class属性，类的全路径包名，方便反系列化。
		//前者如果存放了List则在反系列化的时候如果没指定TypeReference则会报错java.util.LinkedHashMap cannot be cast to 。
		//这里推荐将所有Template的key都采用String的序列化方式，而value的序列化方式可以采用不同的序列化方式。
		//因为序列化策略的不同，即使是同一个key用不同的Template去序列化，结果是不同的。所以根据key去删除数据的时候就出现了删除失败的问题。
		//手动指定RedisTemplate的key的序列化策略 使key的序列化策略相同
		Jackson2JsonRedisSerializer<Object> jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<>(
				Object.class);
		ObjectMapper om = new ObjectMapper();
		om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
		om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
		jackson2JsonRedisSerializer.setObjectMapper(om);
		// 序列化 值时使用此序列化方法
		template.setValueSerializer(jackson2JsonRedisSerializer);
		template.setKeySerializer(new StringRedisSerializer());
		template.afterPropertiesSet();
		return template;
	}
	/**
	 * 0.修改RedisConfig配置类，加入注解@EnableCaching，同时设置CacheManager缓存管理类，
	 *   这里使用RedisCacheManager，其他的管理类还有：SimpleCacheManager、ConcurrentMapCacheManager等，
	 *   默认提供的在类org.springframework.cache.support下，可自行查阅。
	 * 1.改造UserController控制层，引入@Cacheable等注解。
	 * @param redisTemplate
	 * @return
	 */
    @Bean
    public CacheManager cacheManager(RedisTemplate<?, ?> redisTemplate) {
        RedisCacheManager rcm = new RedisCacheManager(redisTemplate);
        //使用前缀
        rcm.setUsePrefix(true);
        //缓存分割符 默认为 ":"
        rcm.setCachePrefix(new DefaultRedisCachePrefix(":"));
        //设置缓存过期时间
        rcm.setDefaultExpiration(60*60);//秒
        return rcm;
    }
}