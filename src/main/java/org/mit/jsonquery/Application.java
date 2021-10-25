package org.mit.jsonquery;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@Theme(variant = Lumo.DARK)
@PWA(name = "JSON Query Engine", shortName = "JQE", offlineResources = {"images/logo.png"})
public class Application extends SpringBootServletInitializer implements AppShellConfigurator {
	public static void main(String[] args) {
		//LaunchUtil.launchBrowserInDevelopmentMode(SpringApplication.run(Application.class, args));
		SpringApplication.run(Application.class, args);
	}
}
