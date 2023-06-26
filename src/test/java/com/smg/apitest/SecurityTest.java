package com.smg.apitest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.smg.apitest.model.dto.request.RequestDTO;
import com.smg.apitest.model.dto.response.ResponseDTO;
import com.smg.apitest.utils.TestSupport;

public class SecurityTest extends TestSupport {

	@ParameterizedTest
	@ValueSource(strings = {
		"\"",
		"'",
		"\\",
		"1' UNION SELECT 1,concat(user,':',password) FROM users;--",
	})
	void searchWithSqlInjectionText(String searchString) {
		RequestDTO requestDTO = getDefaultBuilder().searchString(searchString).build();
		Object responseObj = wikiRestClient.makeRequest(requestDTO);
		Assertions.assertInstanceOf(ResponseDTO.class, responseObj);
	}
}
