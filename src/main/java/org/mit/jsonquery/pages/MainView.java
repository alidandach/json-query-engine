package org.mit.jsonquery.pages;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.mit.jsonquery.pages.components.Editor;

@Route
public class MainView extends VerticalLayout {

    public MainView() {
        TextField query = new TextField("put your query");
        query.setWidth("35%");

        Editor input = new Editor("input your json");
        Editor output = new Editor("the output will appear here");


        HorizontalLayout horizontalLayout = new HorizontalLayout();
        horizontalLayout.add(input, output);
        horizontalLayout.setWidth("100%");
        horizontalLayout.setHeight("550px");


        setHeight("100%");
        add(query, horizontalLayout);
    }
}
