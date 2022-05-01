package com.bl.petShop;

import com.bl.petShop.Pet.Colour;

public class Pigeon extends Pet implements Flyable {
	public Pigeon() {
		name = "Pigeon";
		color = Colour.WHITE;
	}
	
	public void fly() {
		System.out.println("Pigeon can fly");
	}
}
