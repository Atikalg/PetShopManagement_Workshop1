package com.bl.petShop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PetShopMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Pet Shop");
		
//		Cat cat = new Cat();
//		cat.id = "C001";
//		cat.price = 1200;
//		Dog dog = new Dog();
//		dog.id = "D001";
//		dog.price = 1300;
//		Duck duck = new Duck();
//		duck.id = "du01";
//		duck.price = 1400;
//		Mouse mouse = new Mouse();
//		mouse.id = "M001";
//		mouse.price = 1500;
//		Parrot parrot = new Parrot();
//		parrot.id = "P001";
//		parrot.price = 1600;
//		Pigeon pigeon = new Pigeon();
//		pigeon.id = "P002";
//		pigeon.price = 1700;
//		
//		PetRepository petRepository = new PetRepository();
//		
//		petRepository.add(cat);
//		petRepository.add(dog);
//		petRepository.add(duck);
//		petRepository.add(mouse);
//		petRepository.add(parrot);
//		petRepository.add(pigeon);
//		
//		UserInterface userInterface = new UserInterface();
//		userInterface.printAllPets(petRepository.getpetList());
//		
//		petRepository.remove(cat);
//		petRepository.remove(dog);
//		petRepository.remove(duck);
//		petRepository.remove(mouse);
//		petRepository.remove(parrot);
//		petRepository.remove(pigeon);
//		
//		System.out.println("After removal");
//		userInterface.printAllPets(petRepository.getpetList());
		
//		 List<String> list1  = new ArrayList<>();
//		 List<Integer> list2  = new ArrayList<>();
//		 Set<String> set1 = new HashSet<String>();
		 TreeSet<String> set1 = new TreeSet<String>();
		 set1.add("atik");
		 set1.add("sadanand");
		 set1.add("mayoor");
		 set1.add("atik");
		 set1.add("amod");
		 //set1.add(null);
		// list2.add(null);
//		 list1.add("atik");
//		 list1.add("mayoor");
		 
		 System.out.println(set1);
//		 list1.clear();
//		 list1.add("atik");
//		 list1.add("mayoor");
//		 System.out.println(list1);
//		 list1.add("mayoor");
//		 list1.add(2,"sadanand");
//		 
//		 System.out.println(list1);
//		 list1.set(3, "amod");
//		 System.out.println(list1);
//		 list1.remove(1);
//		 System.out.println(list1);
//		 list1.remove("atik");
		// System.out.println(list2);
		
}
}