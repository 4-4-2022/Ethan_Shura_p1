package com.revature;

import javax.xml.ws.Endpoint;

import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.revature.service.CheckInServiceImpl;

@Configuration
public class JaxWsConfiguration {
	@Bean
	public ServletRegistrationBean<CXFServlet> cxfServlet() {
		return new ServletRegistrationBean<CXFServlet>(new CXFServlet(), "/soap-service/*");
	}
	@Bean(name = "cxf")
	public SpringBus springBus() {
		return new SpringBus();
	}
	@Bean
	public CheckInServiceImpl checkInServImpl() {
		return new CheckInServiceImpl();
	}
	@Bean
	public Endpoint endpoint() {
		EndpointImpl endpoint = new EndpointImpl(springBus(), checkInServImpl());
        endpoint.publish("/checkinservice");
        return endpoint;
	}
}
