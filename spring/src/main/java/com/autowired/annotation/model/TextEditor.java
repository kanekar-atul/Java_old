package com.autowired.annotation.model;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	private spellCheckerAutowired spellChecker;

	@Autowired
	public void setSpellChecker(spellCheckerAutowired spellChecker) {
		this.spellChecker = spellChecker;
	}

	public spellCheckerAutowired getSpellChecker() {
		return spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}



class spellCheckerAutowired {
	   public spellCheckerAutowired(){
	      System.out.println("Inside SpellChecker constructor." );
	   }

	   public void checkSpelling(){
	      System.out.println("Inside checkSpelling." );
	   }
	   
	}