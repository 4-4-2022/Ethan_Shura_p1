package com.revature;

import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JaxWsConfiguration {

	@Bean
	public ServletRegistrationBean<CXFServlet> cxfServlet() {
		return new ServletRegistrationBean<CXFServlet>(new CXFServlet(), "/checkin/*");
	}
	@Bean(name = "cxf")
	public SpringBus springBus() {
		return new SpringBus();
	}
	
}
