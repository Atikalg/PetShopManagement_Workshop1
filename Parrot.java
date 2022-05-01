package com.bl.petShop;

import com.bl.petShop.Pet.Colour;

public class Parrot extends Pet implements Flyable{
	public Parrot() {
		name = "Parrot";
		color = Colour.GREEN;
	}
	@Override
	public void fly() {
		System.out.println("Parrot can fly");
	}
}
