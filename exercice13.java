package partie4;

import java.util.Scanner;

public class exercice13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Donner une chaine :");
		String s = scanner.nextLine();
		String ivrs = "";
		
		for (int i = s.length()-1; i >= 0; i--) {
			ivrs += s.charAt(i);
		}
		System.out.print("L'inverse est:  " +ivrs);

	}

}
