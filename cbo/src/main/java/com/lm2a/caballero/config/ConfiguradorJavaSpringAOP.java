package com.lm2a.caballero.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.lm2a.caballero.Juglar;


@Configuration
@ComponentScan("com.lm2a.caballero")
@EnableAspectJAutoProxy
public class ConfiguradorJavaSpringAOP {
	
	@Bean
	public Juglar juglar() {
		return new Juglar(System.out);
	}
}
