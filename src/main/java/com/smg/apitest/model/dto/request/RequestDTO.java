package com.smg.apitest.model.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.smg.apitest.model.type.SearchSort;
import com.smg.apitest.model.type.SearchWhat;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RequestDTO {
	private final String format = "json";
	private final String action = "query";
	private final String list = "search";

	@JsonProperty("formatversion")
	private final Integer formatVersion = 2;

	@JsonProperty("srqiprofile")
	private final String searchProfile = "engine_autoselect";

	@JsonProperty("srsearch")
	private String searchString;

	@JsonProperty("srlimit")
	private Integer searchLimit;

	@JsonProperty("sroffset")
	private Integer searchOffset;

	@JsonProperty("srwhat")
	private SearchWhat searchWhat;

	@JsonProperty("srsort")
	private SearchSort searchSortBy;

}
