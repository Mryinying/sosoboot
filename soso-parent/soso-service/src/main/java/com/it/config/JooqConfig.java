package com.it.config;

import org.jooq.conf.Settings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JooqConfig {

    @Bean
    Settings settings() {
        return new Settings().withRenderSchema(false);
    }
    
}
