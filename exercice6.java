package partie2;

import java.util.Scanner;

public class exercice6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
		 int[] T = {12, 2, 23, 11, 8, 14, 1, 3, 33, -6};
	     int i;
	     int p = 0;
	     
	     System.out.println("Entrer l'entier: ");
		 int N = scanner.nextInt();
		 for (i = 0; i < 10; i++) {
			 if (T[i] == N) {
				p = i;
				break;
			 }
		 }
		 if (p != 0) {
			 System.out.print("La position de " +N+ " est: " +i);
		 }else {
			 System.out.print("Le nombre non présent dans ce tableau.");
		 }

	}

}
