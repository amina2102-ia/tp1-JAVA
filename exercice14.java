package partie4;

import java.util.Scanner;

public class exercice14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Donner un mot :  ");
		String n = scanner.nextLine();
		boolean Pldr = true;
		
		for (int i=0; i<n.length()/2; i++) {
			if (n.charAt(i) != n.charAt(n.length()-1-i)) {
				Pldr = false;
				break;
			}
		}
		if (Pldr) {
			System.out.print(n + " est un palindrome.");
		} else {
			System.out.print(n + " n'est pas un palindrome.");
		}

	}

}
