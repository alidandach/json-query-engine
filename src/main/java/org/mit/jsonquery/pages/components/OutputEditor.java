package org.mit.jsonquery.pages.components;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OutputEditor extends Editor{
	public OutputEditor() {
		setPlaceholder("{\n" + "  \"output\": \"the output will appear here\"\n" + "}");
	}

	@Override
	public void setValue(String value) {
		beautify(value);
	}
}
