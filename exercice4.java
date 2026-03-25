package partie1;

import java.util.Scanner;

public class exercice4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
		
		 
		 System.out.println("Entrer un entiers: ");
		 int N = scanner.nextInt();
		 int S = 0;
		 int i = 0;
		 while(i<N) {
			 S=S+i;
			 i++;
		 }
     System.out.print("La somme est : " +S);
	}

}
