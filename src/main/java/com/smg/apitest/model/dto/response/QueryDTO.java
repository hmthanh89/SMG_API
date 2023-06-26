package com.smg.apitest.model.dto.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class QueryDTO {

	@JsonProperty("searchinfo")
	private SearchInfoDTO searchInfoDTO;

	@JsonProperty("search")
	private List<SearchResultDTO> searchResultDTO;
}
