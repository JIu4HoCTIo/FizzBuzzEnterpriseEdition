package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service
public class ApplicationContextHolder implements ApplicationContextAware {

	private static ApplicationContext applicationContext;

	private ApplicationContextHolder() {
		super();
	}

	/**
	 * @param applicationContext
	 * @throws BeansException
     */
	public void setApplicationContext(final ApplicationContext applicationContext) throws BeansException {
		ApplicationContextHolder.applicationContext = applicationContext;
	}

	/**
	 * @return
     */
	public static ApplicationContext getApplicationContext() {
		return ApplicationContextHolder.applicationContext;
	}

}
