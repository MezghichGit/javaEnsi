package ensi_seance2.app;

public class Main {

	public static void main(String[] args) {
		// Les types primitifs
		// boolean res = false;
		/*
		 * byte x = 10; System.out.println(Byte.MAX_VALUE);
		 * System.out.println(Byte.MIN_VALUE);
		 * 
		 * System.out.println(Integer.MAX_VALUE); System.out.println(Integer.MIN_VALUE);
		 */

		// Les tableaux en Java
		// M?thode 1
		/*
		 * int [] tab = {10,20,14}; System.out.println(tab.length);
		 * System.out.println(tab[0]); System.out.println(tab[1]);
		 * System.out.println(tab[2]);
		 */

		// M?thode 2
		/*
		 * int tab[] = new int[3]; System.out.println(tab.length); tab[0]=20;
		 * System.out.println(tab[0]);
		 * 
		 * boolean res[] = new boolean[3]; System.out.println(res);
		 */

		String names[] = { "Asma", "Skander", "Ahmed Chenaoui", "Yassine", "Aziz", "Akrem" };
		System.out.println(names);
		/*
		 * for(int i=0; i<names.length;i++) { //System.out.println(names[i]);
		 * System.out.print(names[i]+"\t"); }
		 */

		// la boucle foreach
		/*
		 * for(String s : names) System.out.println(s);
		 */

		// Les tableaux multi-dimensions

		int tab[][] = new int[3][];
		tab[0] = new int[4];
		tab[1] = new int[3];
		tab[2] = new int[5];

		tab[0][0] = 10;
		tab[0][1] = 11;
		tab[0][2] = 12;
		tab[0][3] = 13;

		tab[1][0] = 20;
		tab[1][1] = 21;
		tab[1][2] = 22;

		tab[2][0] = 30;
		tab[2][1] = 31;
		tab[2][2] = 32;
		tab[2][3] = 33;
		tab[2][4] = 34;
		/*
		for (int[] t : tab) {
			for (int e : t) {
				System.out.print(e + "\t");
			}
			System.out.println();
		}*/
		
		for(int i=0; i<tab.length; i++)
		{
			for(int j = 0; j<tab[i].length;j++)
			{
				System.out.print(tab[i][j] + "\t");
			}
			System.out.println();
		}
		
		int tab2[][] = {{10,12},{3,4,148,6}};

	}

}
