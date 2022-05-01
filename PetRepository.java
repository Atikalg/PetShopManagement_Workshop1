package com.bl.petShop;

import java.util.ArrayList;
import java.util.List;

public class PetRepository {
	private List petList = new ArrayList();
	
	public List getpetList() {
		return petList;
	}

	public void add(Pet pet) {
		petList.add(pet);
	}

	public void remove(Pet pet) {
		petList.remove(pet);
	}
}
	//capacity = current capacity * 3/2 + i
