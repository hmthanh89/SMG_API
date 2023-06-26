package com.smg.apitest.model.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ErrorDTO {

	@JsonProperty("error")
	private ErrorDetailDTO errorDetail;

	@JsonProperty("warnings")
	private WarningDTO warningDTO;

	@JsonProperty("servedby")
	private String servedBy;

}
