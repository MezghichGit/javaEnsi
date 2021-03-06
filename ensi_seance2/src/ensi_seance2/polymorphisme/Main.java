package ensi_seance2.polymorphisme;

import java.util.ArrayList;

public class Main {
	public static void infoAnimal(Animal a) {  // m?thode Polymorphe
		a.info();
	}

	public static void main(String[] args) {
		
		Main.infoAnimal(new Poisson());
		//C s = new C();
		//s.c();
	
		
		// Voiture v = new Voiture();

		// VoitureCourse vc = new VoitureCourse();

		// cars est une structure polymorphe
		/*
		 * ArrayList<Voiture> cars = new ArrayList<>(); cars.add(new VoitureCourse());
		 * cars.add(new VoitureCitadine());
		 */

		Animal tab[] = new Animal[3]; // tab : est une structure polymorphe
		tab[0] = new Poisson();
		tab[1] = new Chien();
		tab[2] = new Oiseau();
		for (Animal a : tab) {
			a.info();
		}
	}

}
