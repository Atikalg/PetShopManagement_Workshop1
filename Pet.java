package com.bl.petShop;

public class Pet {
	
	enum Colour {
	RED, BROWN, BLACK, WHITE, GREEN, BLACK_WHITE
	}
	
	String id;
	String name;
	Colour color;
	int price;
	
	public void eat() {
		System.out.println(getClass().getSimpleName() + "eats");
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + "]";
	}
}
