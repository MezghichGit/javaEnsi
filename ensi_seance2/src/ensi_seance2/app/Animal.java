package ensi_seance2.app;

public class Animal {
	
	String nom;
	int age;
	public Animal(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}
	
	public Animal() {
		
	}

	@Override
	public String toString() {
		return "Animal [nom=" + nom + ", age=" + age + "]";
	}

	

}
