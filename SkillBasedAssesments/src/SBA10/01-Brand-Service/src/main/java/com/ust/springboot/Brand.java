package com.ust.springboot;

public class Brand {
	private Keyboard keyboardbrand;

	public Keyboard getKeyboardbrand() {
		return keyboardbrand;
	}

	public void setKeyboardbrand(Keyboard keyboardbrand) {
		this.keyboardbrand = keyboardbrand;
	}

	public Brand(Keyboard keyboardbrand) {
		super();
		this.keyboardbrand = keyboardbrand;
	}

}
