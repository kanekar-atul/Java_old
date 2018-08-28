package com.constructor.based.dependency.injection;

public class TextEditor {
	   private SpellChecker spellChecker;

	   public TextEditor(SpellChecker spellChecker) {
	      System.out.println("Inside TextEditor constructor." );
	      this.spellChecker = spellChecker;
	   }
	   public void spellCheck() {
	      spellChecker.checkSpelling();
	   }
	}


  class SpellChecker {
	   public SpellChecker(){
	      System.out.println("Inside SpellChecker constructor." );
	   }
	   public void checkSpelling() {
	      System.out.println("Inside checkSpelling." );
	   }
	}