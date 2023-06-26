package com.smg.apitest.model.dto.response;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SearchResultDTO {

	@JsonProperty("ns")
	private Integer namespaceId;

	@JsonProperty("title")
	private String title;

	@JsonProperty("size")
	private Integer size;

	@JsonProperty("wordcount")
	private Integer wordCount;

	@JsonProperty("snippet")
	private String snippet;

	@JsonProperty("timestamp")
	private LocalDateTime timestamp;
}
