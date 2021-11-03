package org.mit.jsonquery.pages.views;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.mit.jsonquery.pages.MainLayout;

@PageTitle("About")
@Route(value = "about", layout = MainLayout.class)
public class AboutView extends VerticalLayout {

	public AboutView() {
		setSpacing(false);

		Image img = new Image("images/empty-plant.png", "placeholder plant");
		img.setWidth("200px");
		add(img);

		add(new H2("This place intentionally left empty"));

		setSizeFull();
		setJustifyContentMode(JustifyContentMode.CENTER);
		setDefaultHorizontalComponentAlignment(Alignment.CENTER);
		getStyle().set("text-align", "center");
	}

}
