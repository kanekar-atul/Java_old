package com.setter.based.dependency.injection.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.setter.based.dependency.injection.TextEditor;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		TextEditor te = (TextEditor) context.getBean("textEditorSetter");
		te.spellCheck();
	}
}