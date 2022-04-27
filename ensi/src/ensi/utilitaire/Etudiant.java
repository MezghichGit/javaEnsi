package ensi.utilitaire;

import ensi.app.Personne;

public class Etudiant extends Personne{

	private String nom="B";
	String prenom;
	
	public void info()
	{
		System.out.println(this.email);
		System.out.println(this.moy);
		System.out.println(this.nom);
		System.out.println(super.nom);
		System.out.println(this.prenom);
	}
}
