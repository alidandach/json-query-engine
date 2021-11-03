package org.mit.jsonquery;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.PWA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.vaadin.artur.helpers.LaunchUtil;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.component.dependency.NpmPackage;


@SpringBootApplication
@Theme(value = "jsonqueryengine")
@NpmPackage(value = "line-awesome", version = "1.3.0")
@PWA(name = "JSON Query Engine", shortName = "JSON Query Engine", offlineResources = {"images/logo.png"})
public class Application extends SpringBootServletInitializer implements AppShellConfigurator{
	public static void main(String[] args) {
		LaunchUtil.launchBrowserInDevelopmentMode(SpringApplication.run(Application.class, args));
	}
}
