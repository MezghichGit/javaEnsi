package ensi_seance2.app;

import java.util.ArrayList;

public class LesCollections {

	public static void main(String[] args) {
		// Collection d'objets String
		/*ArrayList<String> names = new ArrayList<>();
		System.out.println(names);
		System.out.println(names.toString());
		System.out.println(names.isEmpty());
		System.out.println(names.size());
		names.add("amine");
		names.add("skander");
		names.add("asma");
		System.out.println(names);*/
		
		// Collection d'objets Animal
		/*
		ArrayList<Animal> animals = new ArrayList<>();
		animals.add(new Animal("rocky",2));
		Animal a = new Animal("aa",1);
		animals.add(a);
		System.out.println(animals);
		animals.remove(0);
		System.out.println(animals);*/
		
		ArrayList<Integer> moys = new ArrayList<>();
		moys.add(12);
		moys.add(10);
		moys.add(15);
		System.out.println(moys);

	}

}
