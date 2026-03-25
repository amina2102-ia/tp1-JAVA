package partie4;

import java.util.Scanner;

public class exercice12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Donner une chaine :");
		String x = scanner.nextLine();
		
		int nbv = 0;
		
		for(int i = 0; i < x.length(); i++) {
			char c = x.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y' ||
				c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Y') {
			nbv++;
		}

	}
	System.out.print("Le nombre de voyelle est : " +nbv);
	
	}

}
