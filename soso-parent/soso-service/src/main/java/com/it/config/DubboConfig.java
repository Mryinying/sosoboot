package com.it.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Hebaceous
 */
@Configuration
@ConditionalOnProperty(prefix = "dubbo", name = "enabled", matchIfMissing = true)
@ImportResource({"classpath:dubbo-provider.xml"})
public class DubboConfig {
}
