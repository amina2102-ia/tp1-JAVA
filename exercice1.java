package partie1;

import java.util.Scanner;

public class exercice1 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		
		 
		 System.out.print("Entrer un entier: ");
		 int n = scanner.nextInt();
		 
		 if(n<0){
			 System.out.println("Negatif");
		 }else if(n==0) {
			 System.out.println("Nul");
		 }else {
			 System.out.println("Positif");
		 }
		 
		 scanner.close();
		    
			 
		 

	}

}
