package exercicio;

import java.util.Scanner;

public class Temperatura {

	static double corvesaoCelsiusFahrenheit(double C) {
		return 9 * C / 5 + 32;

	}

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um numero em Celsius:");
		double celsius = leitor.nextInt();
		System.out.println("O numero convertido em Fahrenheit eh:");
		System.out.println(corvesaoCelsiusFahrenheit(celsius));

	}

}
