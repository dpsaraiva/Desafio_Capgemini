package desafios;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {

		// Variavel de entrada.
		int n;

		// Setando a quantidade de degraus.
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos degraus tem a sua escada? ");
		n = sc.nextInt();
		sc.close();
		String[] degraus = new String[n];

		// Laco para impressao dos degraus.
		for (int i = n; i > 0; i--) {

			degraus[i - 1] = "*";
			for (int j = 0; j < n; j++) {

				// Verificacao se posicao no array e nula.
				// Caso sim, impresso 'espaço em branco'.
				if (degraus[j] != null)
					System.out.print(degraus[j]);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
