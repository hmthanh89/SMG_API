package com.smg.apitest.model.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ErrorDetailDTO {

	@JsonProperty("code")
	private String code;

	@JsonProperty("info")
	private String info;

	@JsonProperty("docref")
	private String docRef;

}
