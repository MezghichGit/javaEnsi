package ensi_seance2.polymorphisme;

public class Animal {

	static int nb; // attribut statique
	String espece;  //attribut d'instance
	public void info()  // m?thode d'instance
	{
		System.out.println("Un animal");
	}
	
	public static void manger() {  // m?thode de classe
		
	}
	public Animal() {
		nb++;
	}
	
	public Animal(String espece) {
		nb++;
		this.espece = espece;
	}
}
