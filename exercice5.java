package partie2;

import java.util.Scanner;

public class exercice5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Entrer un entiers: ");
		 int N = scanner.nextInt();
		 int[] T = new int[N];
		 int i;
		 
		 for ( i = 0; i < N; i++) {
			 System.out.print("donne l'élément " +i+ ": ");
			 T[i] = scanner.nextInt();
		 }
		 System.out.println("Les élément du tableau T:");
		 for (i = 0; i < N; i++) {
			 System.out.print(T[i] + " ");
		 
		 }
	}

}
