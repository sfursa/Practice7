package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog(12, "Ostin");
        Dog dog2 = new Dog(4, "Rex");
        Dog dog3 = new Dog(1, "Ostin");
        Dog dog5 = new Dog(1, "Dik");

        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(dog3.toString());
        System.out.println();

        System.out.println(dog1.equals(dog2));
        System.out.println(dog1.equals(dog3));
        System.out.println();

        System.out.println(dog1.hashCode());
        System.out.println(dog2.hashCode());
        System.out.println(dog3.hashCode());
        System.out.println();

		// Коллекция HashMap
		System.out.println("---------------------------------------- Коллукция HashMap");
        Map<Integer, Dog> DogMap = new HashMap<>();

        DogMap.put(1, dog1);
        DogMap.put(2, dog2);
        DogMap.put(3, dog3);
        DogMap.put(4, dog5);

        for (Map.Entry<Integer, Dog> dog4 : DogMap.entrySet()) {
			System.out.println("Ключ: " + dog4.getKey()+ "." + dog4.getValue());
		}
		System.out.println(DogMap.get(2));
		System.out.println();

        // Коллекция HashSet
		System.out.println("---------------------------------------- Коллукция HashSet");
		Set<Dog>DogSet = new HashSet<>();

		DogSet.add(dog1);
		DogSet.add(dog2);
		DogSet.add(dog3);
		DogSet.add(dog5);

		for(Dog d : DogSet){
			System.out.println(d);
		}
		System.out.println("Созданных объектов: " + DogSet.size());
		System.out.println();

		// Коллекция ArrayList
		System.out.println("---------------------------------------- Коллукция ArrayList");
		List<Dog>DogList = new ArrayList<>();
		DogList.add(dog1);
		DogList.add(dog2);
		DogList.add(dog3);
		DogList.add(dog5);

		for (Dog d : DogList) {
			System.out.println(d);
		}
    }
}
