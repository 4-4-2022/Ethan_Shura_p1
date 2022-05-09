package com.revature;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;

import com.revature.service.CheckInService;

@Configuration
public class ClientConfiguration {

	@Bean
	public JaxWsPortProxyFactoryBean proxy() {
		JaxWsPortProxyFactoryBean proxyFactory = new JaxWsPortProxyFactoryBean();
		
		try {
			proxyFactory.setWsdlDocumentUrl(new URL("http://localhost:8081/soap-service/checkinservice?wsdl"));
			proxyFactory.setServiceInterface(CheckInService.class);
			proxyFactory.setServiceName("CheckInServiceImplService");
			proxyFactory.setPortName("CheckInServiceImplPort");
			proxyFactory.setNamespaceUri("http://service.revature.com/");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return proxyFactory;
	}
	
}
