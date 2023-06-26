package com.smg.apitest.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.smg.apitest.config.rest.WikiRestClient;
import com.smg.apitest.model.dto.request.RequestDTO;
import com.smg.apitest.model.type.SearchSort;
import com.smg.apitest.model.type.SearchWhat;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class TestSupport {

	@Autowired
	protected WikiRestClient wikiRestClient;

	@Autowired
	protected ObjectMapper objectMapper;

	protected RequestDTO.RequestDTOBuilder getDefaultBuilder() {
		return RequestDTO.builder()
			.searchString("Software engineer")
			.searchLimit(3)
			.searchOffset(0)
			.searchWhat(SearchWhat.TEXT)
			.searchSortBy(SearchSort.RELEVANCE);
	}

}
