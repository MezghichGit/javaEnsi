package ensi_seance2.polymorphisme;

public class Test {

	public static void main(String[] args) {
		System.out.println(Animal.nb);
		Animal a1 =  new Animal();
		Animal a2 =  new Animal();
		System.out.println(Animal.nb);
		System.out.println(a1.espece);
		Animal a3 = new Animal("Chat");
		System.out.println(a3.espece);

	}

}
