package partie1;

import java.util.Scanner;

public class exercice2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
		
		 
		 System.out.println("Entrer trois entiers: ");
		 int a = scanner.nextInt();
		 int b = scanner.nextInt();
		 int c = scanner.nextInt();
		 int max = a;
		 
		 if(a<b && c<b){
			 max = b;
		 }else if(a<c && b<c) {
			 max = c;
		 }
		 System.out.print("le plus grande nombre est: " +max);
		 
		 scanner.close();
		    

	}

}
