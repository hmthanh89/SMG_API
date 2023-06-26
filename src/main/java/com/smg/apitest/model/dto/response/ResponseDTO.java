package com.smg.apitest.model.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ResponseDTO {

	@JsonProperty("batchcomplete")
	private Boolean batchComplete;

	@JsonProperty("warnings")
	private WarningDTO warningDTO;

	@JsonProperty("continue")
	private ContinueDTO continueDTO;

	@JsonProperty("query")
	private QueryDTO queryDTO;

}
