package exercicio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {

		// varíaveis
		double peso, altura, imc;

		// objetos

		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		// entrada

		System.out.println("Cálculo do IMC");
		System.out.println("Digite o seu peso em kilogramas:");

		peso = teclado.nextDouble();
		System.out.println("Digite a sua altura em metros:");
		altura = teclado.nextDouble();

		// processamento

		imc = peso / (altura * altura);
		// saída
		System.out.println("IMC:" + formatador.format(imc));

		// estrutura de controle condicional
		if (imc < 16.99) {
			System.out.print("Muito abaixo do peso");
		} else if (imc >= 16.99 && imc < 18.5) {
			System.out.println("Abaixo do peso");
		} else if (imc >= 18.5 && imc < 24.99) {
			System.out.print("Peso normal");

		} else if (imc >= 25 && imc < 29.99) {
			System.out.print("Acima do peso");

		} else if (imc >= 30 && imc < 34.99) {
			System.out.print("Obesidade I");

		} else if (imc >= 35 && imc < 39.99) {
			System.out.print("Obesidade II (severa)");

		} else if (imc >= 40) {
			System.out.print("	Obesidade III (mórbida)");

		}

		teclado.close();

	}

}
