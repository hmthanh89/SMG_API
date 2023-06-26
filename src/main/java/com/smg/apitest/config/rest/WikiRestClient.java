package com.smg.apitest.config.rest;

import java.util.Map;
import java.util.Objects;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smg.apitest.model.dto.request.RequestDTO;
import com.smg.apitest.model.dto.response.ErrorDTO;
import com.smg.apitest.model.dto.response.ResponseDTO;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@Component
public class WikiRestClient {

	private final RestTemplate restTemplate;
	private final ObjectMapper objectMapper;

	public Object makeRequest(RequestDTO requestDTO) {
		Map<String, String> paramsMap = objectMapper.convertValue(requestDTO, new TypeReference<>() {});
		return makeRequest(paramsMap);
	}

	public Object makeRequest(Map<String, String> paramsMap) {
		log.info("Request with params: {}", paramsMap);

		UriComponentsBuilder componentsBuilder = UriComponentsBuilder.newInstance().path("/w/api.php");
		for (Map.Entry<String, String> entry : paramsMap.entrySet()) {
			componentsBuilder = componentsBuilder.queryParam(entry.getKey(), entry.getValue());
		}
		UriComponents components = componentsBuilder.build();
		String uriString = components.toUriString();
		log.info("Request to URI: {}", uriString);

		ResponseEntity<Map<String, Object>> responseEntity =
			restTemplate.exchange(
				uriString,
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<>() {});
		log.info("Response: {}", responseEntity.getBody());

		Map<String, Object> response = responseEntity.getBody();
		if (Objects.requireNonNull(response).containsKey("error")) {
			return objectMapper.convertValue(response, ErrorDTO.class);
		} else {
			return objectMapper.convertValue(response, ResponseDTO.class);
		}
	}
}
