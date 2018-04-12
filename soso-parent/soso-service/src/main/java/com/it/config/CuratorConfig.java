package com.it.config;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.RetryForever;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hebaceous
 */
@Configuration
public class CuratorConfig {

    @Value("${dubbo.zookeeper}")
    private String zookeeperAddress;

    @Bean
    CuratorFramework curatorFramework() throws InterruptedException {
        CuratorFramework curatorFramework = CuratorFrameworkFactory.newClient(zookeeperAddress, new RetryForever(3000));
        curatorFramework.start();
        curatorFramework.blockUntilConnected();
        return curatorFramework;
    }

}
