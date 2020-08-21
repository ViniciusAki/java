package exercicio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValorHora {

	public static void main(String[] args) {

		// variáveis
		double remuneracao, custo, hora;
		int cargaHoraria;

		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");

		// entrada

		System.out.println("Calculo do valor da hora de serviço");
		System.out.println("Remuneção mensal pretentida");

		remuneracao = teclado.nextDouble();
		System.out.println("Custo operacional: ");

		custo = teclado.nextDouble();
		System.out.println("Carga horária  mensal de trabalho: ");

		cargaHoraria = teclado.nextInt();

		hora = (remuneracao + (0.3 * remuneracao) + custo + (0.2 * remuneracao)) / cargaHoraria;
		teclado.close();
		// saida

		System.out.println("valor da hora: " + formatador.format(hora));

	}

}
