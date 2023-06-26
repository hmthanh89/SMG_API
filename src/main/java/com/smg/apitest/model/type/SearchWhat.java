package com.smg.apitest.model.type;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SearchWhat {
	NEARMATCH,
	TEXT,
	TITLE;

	@JsonValue
	@Override
	public String toString() {
		return name().toLowerCase();
	}

}
