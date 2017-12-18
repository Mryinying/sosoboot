package com.it;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * 
 * @author Mryinying
 *
 */
@SpringBootApplication
public class Application{
	//第一种使用第三方json解析框架
	//重写
	// extends WebMvcConfigurerAdapter
//	@Override
//	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//		//定义一个convert消息转换对象
//		super.configureMessageConverters(converters);
//		//添加fastjson的配置信息 是否需要格式化json数据 
//		FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
//		FastJsonConfig config = new FastJsonConfig();
//		config.setSerializerFeatures(SerializerFeature.PrettyFormat);
//		converter.setFastJsonConfig(config);
//		converters.add(converter);
//	}
	/**
	 * 第二种使用第三方json解析框架
	 * 用@bean注入FastJsonHttpMessageConverter
	 * @return
	 */
	@Bean
	public HttpMessageConverters fastJsonHttpMessageConverters(){
		FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
		FastJsonConfig config = new FastJsonConfig();
		config.setSerializerFeatures(SerializerFeature.PrettyFormat);
		converter.setFastJsonConfig(config);
		HttpMessageConverter<?> converter2 = converter;
		return new HttpMessageConverters(converter2);
	}
    public static void main( String[] args )
    {
        SpringApplication.run(Application.class, args);
    }
}
