package ensi.app;

public class Animal {
	@Override
	public String toString() {
		return "Animal [espece=" + espece + ", age=" + age + ", poids=" + poids + "]";
	}

	String espece;
	int age;
	double poids;
	public Animal(String espece, int age, double poids) {
		System.out.println("Constructeurs avec param�tres");
		this.espece = espece;
		this.age = age;
		this.poids = poids;
	}
	
	/*
	@Override
	public String toString() {
		return "Animal [espece=" + espece + ", age=" + age + ", poids=" + poids + "]";
	}*/

	public Animal() {
		System.out.println("Constructeurs par d�faut");
	}
}
