package com.andrew.rydzak.web.models;

public class Number {
	
	private int number;
	
	public Number() {
		this.number = this.setNumber();
	}
	
	private int setNumber() {
		int num = (int) (Math.floor(Math.random() * 10) + 1);
		return num;
	}
	
	public int getNumber() {
		return this.number;
	}

}
