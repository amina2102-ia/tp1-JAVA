package partie3;

public class exercice10 {

	public static void main(String[] args) {
		int[][] M = {{1, 5, 9}, {2, 6, 8}};
		int[][] T = new int[M[0].length][M.length];
		int S = 0;
		System.out.println("Le transposée de la matrice M :");
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				T[j][i] = M[i][j];
			}
		}
		for (int i = 0; i < M[0].length; i++) {
			for (int j = 0; j < M.length; j++) {
				System.out.print(T[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
