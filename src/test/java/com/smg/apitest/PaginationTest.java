package com.smg.apitest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.smg.apitest.model.dto.request.RequestDTO;
import com.smg.apitest.model.dto.response.ResponseDTO;
import com.smg.apitest.utils.TestSupport;

public class PaginationTest extends TestSupport {

	@Test
	void pageSizeTest() {
		Integer pageSize = 3;
		RequestDTO requestDTO = getDefaultBuilder().searchLimit(pageSize).build();
		Object responseObj = wikiRestClient.makeRequest(requestDTO);

		Assertions.assertInstanceOf(ResponseDTO.class, responseObj);
		ResponseDTO responseDTO = (ResponseDTO) responseObj;
		Assertions.assertEquals(pageSize, responseDTO.getQueryDTO().getSearchResultDTO().size());
		Assertions.assertNull(responseDTO.getWarningDTO());
	}

}
