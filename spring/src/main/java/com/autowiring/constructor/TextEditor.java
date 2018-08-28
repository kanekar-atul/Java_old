package com.autowiring.constructor;

public class TextEditor {
	private SpellCheckerConstructor SpellCheckerConstructor;
	private String name;

	public TextEditor(SpellCheckerConstructor spellChecker, String name) {
		this.SpellCheckerConstructor = spellChecker;
		this.name = name;
	}

	public SpellCheckerConstructor getSpellChecker() {
		return SpellCheckerConstructor;
	}

	public String getName() {
		return name;
	}

	public void spellCheck() {
		SpellCheckerConstructor.checkSpelling();
	}
}

  class SpellCheckerConstructor {
	public SpellCheckerConstructor() {
		System.out.println("Inside SpellChecker constructor.");
	}

	public void checkSpelling() {
		System.out.println("Inside checkSpelling.");
	}
}