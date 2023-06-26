package com.smg.apitest.model.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WarningDTO {
	@JsonProperty("search")
	private SearchWarningDTO searchWarning;
}
