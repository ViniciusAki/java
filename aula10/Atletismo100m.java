package exercicio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atletismo100m {

	public static void main(String[] args) {

		// variáveis
		String nome;
		double tempo, segundo;

		// objetos

		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");

		// Entrada

		System.out.println("Avaliar seu tempo no 100 m rasos para maiores de 18 anos");
		System.out.print("Digite o seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Digite seu tempo no 100m rasos:");
		tempo = teclado.nextDouble();

		// estrutura de controle condicional
		if (tempo < 13) {
			System.out.print("Rapido");
		} else if (tempo >= 13.1 && tempo <= 17.99) {
			System.out.println("Médio");

		} else if (tempo >= 18) {
			System.out.print("Lento");

		}

		teclado.close();

	}

}
