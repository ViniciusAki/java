package exercicio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Gasolina {

	public static void main(String[] args) {

		// variáveis

		double gasolina, alcool;

		// objetos

		Scanner teclado = new Scanner(System.in);

		// Entrada
		System.out.println("Álcool x Gasolina");

		System.out.println("Digite o valor da álcool");
		alcool = teclado.nextDouble();

		System.out.println("Digite o valor da gasolina");
		gasolina = teclado.nextDouble();

		// processamento + sáida

		if (alcool > 0.7 * gasolina) {
			System.out.print("ABASTEÇA COM ÁLCOOL");
		} else {
			System.out.println("ABASTEÇA COM GASOLINA");
		}

		teclado.close();

	}
}
