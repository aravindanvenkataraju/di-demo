package com.aravindan.springframework.didemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import com.aravindan.springframework.didemo.DiDemoDataSource;
import com.aravindan.springframework.didemo.DiDemoJmsBroker;
@Configuration
//
//@PropertySources({
//	@PropertySource("classpath:datasource.properties"),
//	@PropertySource("classpath:jms.properties")
//})
public class DiDemoPropertyConfig {
	
	@Autowired
	Environment env;
	
	@Value("${com.aravindan.springframework.username}")
	String user;
	
	@Value("${com.aravindan.springframework.password}")
	String password;
	
	@Value("${com.aravindan.springframework.dburl}")
	String url;
	
	@Value("${didemo.jms.username}")
	String jmsUser;
	
	@Value("${didemo.jms.password}")
	String jmsPassword;
	
	@Value("${didemo.jms.jmsurl}")
	String jmsUrl;
	
//	public static PropertySourcesPlaceholderConfigurer properties() {
//		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
//		return propertySourcesPlaceholderConfigurer;
//	}
	
	@Bean
	DiDemoDataSource diDemoDataSource() {
		DiDemoDataSource diDemoDataSource = new DiDemoDataSource();
		diDemoDataSource.setUser(env.getProperty("DIDEMO_USERNAME"));
		diDemoDataSource.setPassword(password);
		diDemoDataSource.setUrl(url);
		return diDemoDataSource;
		
	}
	
	@Bean
	DiDemoJmsBroker diDemoJmsBroker() {
		DiDemoJmsBroker diDemoJmsBroker = new DiDemoJmsBroker();
		diDemoJmsBroker.setUser(jmsUser);
		diDemoJmsBroker.setPassword(jmsPassword);
		diDemoJmsBroker.setUrl(jmsUrl);
		return diDemoJmsBroker;
		
	}

}
