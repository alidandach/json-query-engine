package org.mit.jsonquery.pages.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.mit.jsonquery.pages.MainView;
import org.mit.jsonquery.pages.views.components.InputEditor;
import org.mit.jsonquery.pages.views.components.OutputEditor;

@PageTitle("Editor")
@Route(value = "editor", layout = MainView.class)
public class EditorView extends VerticalLayout {
	public EditorView() {
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
		calculate.addClickListener(i -> output.setValue(input.calculate(query.getValue().trim())));
		HorizontalLayout horizontalLayoutForQueryArea = new HorizontalLayout();
		horizontalLayoutForQueryArea.setWidth("100%");
		horizontalLayoutForQueryArea.setJustifyContentMode(JustifyContentMode.CENTER);
		horizontalLayoutForQueryArea.add(calculate, query);

		setHeight("100%");
		add(horizontalLayoutForQueryArea, horizontalLayoutForEditors);
	}
}
