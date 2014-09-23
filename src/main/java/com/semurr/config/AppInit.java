package com.semurr.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import com.sun.xml.ws.transport.http.servlet.WSSpringServlet;

public class AppInit implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext)
			throws ServletException {
		
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(WsConfig.class);
		context.setServletContext(servletContext);

		// listener
		servletContext.addListener(new ContextLoaderListener(context));

		// setup servlet
		Dynamic servlet = servletContext.addServlet("WSSpringServlet",
				new WSSpringServlet());
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);

	}

}
