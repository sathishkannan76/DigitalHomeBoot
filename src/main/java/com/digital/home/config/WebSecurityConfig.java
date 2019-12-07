package com.digital.home.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SuppressWarnings("deprecation")
@Configuration
public class WebSecurityConfig extends WebMvcConfigurerAdapter {
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("http://localhost:4200").allowedOrigins("http://localhost:4200")
				.allowedHeaders("Access-Control-Allow-Origin", "*")
				.allowedHeaders("Access-Control-Allow-Headers",
						"Content-Type, Origin, Authorization, Accept, Client-Security-Token, Accept-Encoding, X-Auth-Token, Encoding, X-Auth-Token, content-type")
				.maxAge(20000).allowCredentials(false).allowedMethods("POST");
	}
	
	@Bean
    public WebMvcConfigurer corsConfigurer() {
    	System.out.println("Inside cords check");
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**");
            }
        };
    }
}
