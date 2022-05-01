package com.bl.petShop;

import com.bl.petShop.Pet.Colour;

public class Duck extends Pet implements Swimable, Flyable {

	public Duck() {
		name = "Duck";
		color = Colour.WHITE;
	}
	
	@Override
	public void fly() {
		System.out.println("Duck can fly");
	}
	@Override
	public void swim() {
		System.out.println("Duck swims");
	}
}
