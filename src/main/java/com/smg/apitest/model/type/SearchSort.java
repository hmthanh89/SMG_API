package com.smg.apitest.model.type;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SearchSort {
	CREATE_TIMESTAMP_ASC,
	CREATE_TIMESTAMP_DESC,
	INCOMING_LINKS_ASC,
	INCOMING_LINKS_DESC,
	JUST_MATCH,
	LAST_EDIT_ASC,
	LAST_EDIT_DESC,
	NONE,
	RANDOM,
	RELEVANCE,
	USER_RANDOM;

	@JsonValue
	@Override
	public String toString() {
		return name().toLowerCase();
	}
}
