package ensi.app;

import java.util.Scanner;

import ensi.utilitaire.*;

public class Principale {

	public static void main(String[] args) {
		/*System.out.println("Bonjour Java");
		Personne p = new Personne();
		p.nom="Amine";
		p.email="amine.mezghich@gmail.com";*/
		
		//Etudiant e = new Etudiant();
		//e.info();
		//Chercheur c = new Chercheur();
		/*
		Animal a1 = new Animal();
		Animal a2 = new Animal("Chat",3,4.5);
		String res = a1.toString();
		System.out.println(res);
		System.out.println(a2.toString());*/
		Scanner s = new Scanner(System.in);
		System.out.println("Donner un nom : ");
		String nom = s.nextLine();
		
		System.out.println("Donner votre age : ");
		int age = s.nextInt();
		
		System.out.println("Vous �tes : " + nom +" vous avez : "+age);

	}

}
