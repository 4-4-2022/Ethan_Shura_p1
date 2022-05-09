package com.revature.utility;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component("Logging")
public class Logging {

	private static final Logger logs = LoggerFactory.getLogger(Logging.class);
	
	@Pointcut("within(com.revature.controller.*)")
	public void logControllers() {
	}
	
	@Before("logControllers()")
	public void logBefore(JoinPoint join) {
		logs.info("Controller " + join.getSignature().getName() + " was called.");
	}
	
	@After("logControllers()")
	public void logAfter(JoinPoint join) {
		logs.info("After: " + join.getSignature().getName());
	}
	
	@AfterReturning(value="logControllers()", returning="returnedObjects")
	public void logReturn(JoinPoint join, Object returnedObjects) {
		logs.info(join.getSignature().getName() + "returned:" + returnedObjects);
	}
}
