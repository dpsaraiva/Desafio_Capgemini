package desafios;

import java.util.Arrays;
import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {

		// Variaveis de Controle.
		String nome;
		String palavra1;
		String palavra2;
		int cont = 0;
		int saida = 0;

		// Setando a palavra a ser verificada.
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a palavra a ser vefiricada: ");
		nome = sc.next();
		sc.close();

		// Processo de separacao dos anagramas pares.
		while (cont < nome.length()) {

			cont++;
			for (int i = 0; i < nome.length() - cont; i++) {

				palavra1 = nome.substring(i, i + cont);

				for (int j = i + 1; j < nome.length() - cont + 1; j++) {
					palavra2 = nome.substring(j, j + cont);

					// Chamada do metodo que verifica se os pares sao anagramas.
					if (saoAnagramas(palavra1, palavra2)) {

						// Contador de pares de anagramas encontrados.
						saida += 1;
					}
				}
			}
		}
		// Total de anagramas encontrados
		System.out.println(saida);
	}

	// Metodo responsavel por comparar as duas substrings. Retorna true se forem
	// anagramas.
	private static boolean saoAnagramas(String s1, String s2) {

		// Conversao de String para cadeia do tipo char.
		char[] p1 = new char[s1.length()];
		for (int i = 0; i < s1.length(); i++)
			p1[i] = s1.toLowerCase().charAt(i);

		char[] p2 = new char[s2.length()];
		for (int i = 0; i < s2.length(); i++)
			p2[i] = s2.toLowerCase().charAt(i);

		// ordenacao alfabetica da cadeia de char.
		Arrays.sort(p1);
		Arrays.sort(p2);

		// Conversao e char para tipo String para posterior comparacao.
		String l1 = new String(p1);
		String l2 = new String(p2);

		// Comparacao das duas Strings. Se anagramas, retorna verdadeiro.
		if (l1.equals(l2)) {
			return true;
		}

		return false;
	}

}
