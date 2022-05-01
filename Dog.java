package com.bl.petShop;

import com.bl.petShop.Pet.Colour;

public class Dog extends Pet implements Swimable {
	
	public Dog() {
		name = "Dog";
		color = Colour.BLACK;
	}
	@Override
	public void swim() {
		System.out.println("Dog can swim");
	}
}
