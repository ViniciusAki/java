package exercicio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class JokenPo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int jogador;

		System.out.println("Pedra = 1 ");
		System.out.println("Papel = 2  ");
		System.out.println("Tesoura = 3");
		System.out.println("Escolha entre 1, 2 e 3 , sendo : ");
		jogador = teclado.nextInt();
		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu pedra");
			break;
		case 2:
			System.out.println("Jogador escolheu papel ");
			break;
		case 3:
			System.out.println("Jogador escolheu tesousa");
			break;
		}

		int computador = (int) (Math.random() * 6 + 1);

		switch (computador) {
		case 1:
			System.out.println("Computador escolheu pedra");
			break;
		case 2:
			System.out.println(" Computador escolheu papel ");
			break;
		case 3:
			System.out.println(" Computador escolheu tesousa");
			break;
		}

		int pc;
		pc = (computador);

		if (pc > 2) {
			System.out.print("Computador ganhou");
		} else if (pc >= 3) {
			System.out.println("Jogador 1 ganhou");
		} else if (pc >= 1) {
			System.out.print("Empate");

		}

	}
}
