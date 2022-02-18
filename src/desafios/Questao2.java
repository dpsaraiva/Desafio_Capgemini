package desafios;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {

		// Variaveis de controle.
		String senha;
		String especiais = "!@#$%^&*()-+";
		int digito = 0;
		int maiuscula = 0;
		int minuscula = 0;
		int caracterEspecial = 0;
		int total = 0;
		int tamanho = 0;
		int falta = 0;

		// Setando a senha a ser verificada.
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua senha: ");
		senha = sc.next();
		sc.close();

		// Verificacao se os caracteres sao digitos, maiusculos ou minusculos.
		for (char caracter : senha.toCharArray()) {
			if (Character.isDigit(caracter))
				digito = 1;
			if (Character.isLowerCase(caracter))
				minuscula = 1;
			if (Character.isUpperCase(caracter))
				maiuscula = 1;
		}

		// Verificacao se existe caracteres especiais.
		for (char simbolo : especiais.toCharArray()) {
			if (senha.indexOf(simbolo) != -1)
				caracterEspecial = 1;
		}

		// Analise se todos os pre-requisitos de senha forte foram preenchidos.
		// Caso o total for igual a 4, todos os requisitos foram atendidos.
		total = digito + maiuscula + minuscula + caracterEspecial;

		// Verificacao se o tamanho da senha e satisfatoria
		// em conjunto com os demais requisitos.
		if (total < 4)
			falta = 4 - total;
		if (senha.length() < 6)
			tamanho = 6 - senha.length();
		if (falta < tamanho)
			falta = tamanho;

		// Informacao de quantos caracteres falta para senha ser forte.
		System.out.println(falta);
	}
}
