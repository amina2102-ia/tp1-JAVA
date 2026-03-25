package partie1;

import java.util.Scanner;

public class exercice3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		  
		 
		 System.out.println("Entrer un entiers: ");
		 int a = scanner.nextInt();
		 System.out.println("Table de multiplication de " + a + " :");
		 
		 for(int i = 1; i <= 10; i++) {
			 System.out.println(a +" x " + i + " = " + (a * i));
		 }
		 
		 scanner.close();

	}

}
