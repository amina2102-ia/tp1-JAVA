package partie2;

import java.util.Scanner;

public class exercice7 {

	public static void main(String[] args) {
		
			int[] T= {12, 22, 10, 1, -3, 15, 100};
			int i;
			int max = T[0];
			for (i = 1; i < T.length; i++) {
				if (T[i] > max) {
					max = T[i];
				}
			}
			 System.out.print("Le maximum de Tableau est:  " +max);

	}

}
