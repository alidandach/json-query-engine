package org.mit.jsonquery.pages.views.components;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vaadin.flow.component.textfield.TextArea;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Editor extends TextArea {
    ObjectMapper mapper;

    public Editor() {
        mapper = new ObjectMapper();
        setWidth("50%");
        getStyle().set("color", "white");
        getStyle().set("border-radius", "10px");
        getStyle().set("font-family", "Consolas");
        getStyle().set("background-color", "rgba(0, 0, 0, 0.87)");
    }

    protected void beautify(String value) {
        try {
            String pretty = mapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(mapper.readTree(value));
            super.setValue(pretty);
        } catch (JsonProcessingException e) {
            log.warn("we can't serialise the string {} to json", getValue());
        }
    }
}
