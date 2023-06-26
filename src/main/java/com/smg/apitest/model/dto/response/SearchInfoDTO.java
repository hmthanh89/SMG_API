package com.smg.apitest.model.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SearchInfoDTO {

	@JsonProperty("totalhits")
	private Integer totalHits;

	@JsonProperty("suggestion")
	private String suggestion;

	@JsonProperty("suggestionsnippet")
	private String suggestionSnippet;
}
