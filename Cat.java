package com.bl.petShop;

public class Cat extends Pet implements Swimable {
	
	@Override
	public void swim() {
		System.out.println("cat can swim");
	}
	
	public Cat() {
		name = "cat";
		color = Colour.BLACK_WHITE;
	}
	}
