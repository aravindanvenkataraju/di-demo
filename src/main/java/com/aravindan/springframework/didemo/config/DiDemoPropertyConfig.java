package com.aravindan.springframework.didemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.aravindan.springframework.didemo.DiDemoDataSource;
@Configuration
@PropertySource("classpath:datasource.properties")
public class DiDemoPropertyConfig {
	@Value("${com.aravindan.springframework.username}")
	String user;
	
	@Value("${com.aravindan.springframework.password}")
	String password;
	
	@Value("${com.aravindan.springframework.dburl}")
	String url;
	
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer;
	}
	
	@Bean
	DiDemoDataSource diDemoDataSource() {
		DiDemoDataSource diDemoDataSource = new DiDemoDataSource();
		diDemoDataSource.setUser(user);
		diDemoDataSource.setPassword(password);
		diDemoDataSource.setUrl(url);
		return diDemoDataSource;
		
	}

}
