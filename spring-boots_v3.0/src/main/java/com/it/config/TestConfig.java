package com.it.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
//@EnableConfigurationProperties(value= {Config.class})
@ConfigurationProperties(prefix="config")
@Data
public class TestConfig {
	
	String code;
	
	String name;
	
	List<String> hobby;
}
