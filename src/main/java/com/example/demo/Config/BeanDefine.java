package com.example.demo.Config;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanDefine{
 @Bean
 Mapper mapper() {
	 return new DozerBeanMapper();
 }
	
}