package com.smg.apitest.config.rest;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
public class WikiRestConfig {

	@Bean
	@ConfigurationProperties(prefix = "rest.wiki")
	WikiRestProperties wikiRestProperties() {
		return new WikiRestProperties();
	};

	@Bean
	public RestTemplate wikiRestTemplate(RestTemplateBuilder builder) {
		WikiRestProperties properties = wikiRestProperties();
		List<HttpMessageConverter<?>> messageConverters = List.of(new MappingJackson2HttpMessageConverter());
		return builder.rootUri(properties.getHostName()).messageConverters(messageConverters).build();
	}

}
