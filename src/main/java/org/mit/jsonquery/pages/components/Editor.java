package org.mit.jsonquery.pages.components;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vaadin.flow.component.textfield.TextArea;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Editor extends TextArea {
    ObjectMapper mapper;

    public Editor(String title) {
        mapper = new ObjectMapper();
        setWidth("50%");
        setPlaceholder(title);
        getStyle().set("background-color", "rgba(0, 0, 0, 0.87)");
        addValueChangeListener(event -> beautify(event.getValue()));
    }

    private void beautify(String value) {
        if(getValue()!=null && !getValue().isEmpty()){
            try {
                String pretty = mapper.writerWithDefaultPrettyPrinter()
                                 .writeValueAsString(mapper.readTree(value));
                setValue(pretty);
            } catch (JsonProcessingException e) {
                log.warn("we can't serialise the string {} to json",getValue());
            }
        }
    }
}
