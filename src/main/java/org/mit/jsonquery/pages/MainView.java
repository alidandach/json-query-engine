package org.mit.jsonquery.pages;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.mit.jsonquery.pages.components.InputEditor;
import org.mit.jsonquery.pages.components.OutputEditor;

@Route
public class MainView extends VerticalLayout {

    public MainView() {
        InputEditor input = new InputEditor();
        OutputEditor output = new OutputEditor();

        HorizontalLayout horizontalLayoutForEditors = new HorizontalLayout();
        horizontalLayoutForEditors.add(input, output);
        horizontalLayoutForEditors.setWidth("100%");
        horizontalLayoutForEditors.setHeight("550px");

        TextField query = new TextField();
        query.setPlaceholder("$['tool']['jsonpath']['creator']['location'][*]");
        query.setWidth("35%");
        Button calculate = new Button("Calculate");
        calculate.addClickListener(i->output.setValue(input.calculate(query.getValue().trim())));
        HorizontalLayout horizontalLayoutForQueryArea = new HorizontalLayout();
        horizontalLayoutForQueryArea.setWidth("100%");
        horizontalLayoutForQueryArea.setJustifyContentMode(JustifyContentMode.CENTER);
        horizontalLayoutForQueryArea.add(calculate, query);

        setHeight("100%");
        add(horizontalLayoutForQueryArea, horizontalLayoutForEditors);
    }
}
