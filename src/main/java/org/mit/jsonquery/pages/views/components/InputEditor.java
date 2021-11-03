package org.mit.jsonquery.pages.views.components;

import com.jayway.jsonpath.JsonPath;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InputEditor extends Editor{
	public InputEditor() {
		setPlaceholder("{\n" + "  \"input\": \"put your json here\"\n" + "}");
		addValueChangeListener(event -> {
			if(getValue()!=null && !getValue().isEmpty())
				beautify(event.getValue());
		});
	}

	public String calculate(String query) {
		if (query != null && !query.isEmpty())
			return JsonPath.parse(getValue()).read(query).toString();
		return "";
	}
}
