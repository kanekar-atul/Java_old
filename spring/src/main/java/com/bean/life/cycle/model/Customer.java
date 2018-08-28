package com.bean.life.cycle.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class Customer implements BeanFactoryAware,BeanFactoryPostProcessor {

	private int id;

	private String name;

	public Customer() {
		super();
		System.out.println("This is from Customer constructor");
	}

	public int getId() {
		System.out.println("This is from Customer getId() ");
		return id;
	}

	public void setId(int id) {
		System.out.println("This is from Customer setId() ");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void init() {
		System.out.println("This is from init()");
	}

	public void destroy() {
		System.out.println("This is from destroy()");
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("This is from setBeanFactory()");
	}

	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("This is from postProcessBeanFactory()");
	}
}
