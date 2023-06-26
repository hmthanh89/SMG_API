package com.smg.apitest.model.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchWarningDTO {
	@JsonProperty("warnings")
	private String warningString;
}
