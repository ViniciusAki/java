package exercicio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PDV {

	public static void main(String[] args) {

		// variáveis
		// objetos

		Scanner teclado = new Scanner(System.in);
		double troco, total, desconto, totalDesconto, valorPago;

		DecimalFormat formatador = new DecimalFormat("#0.00");

		// entrada
		System.out.println("PDV");
		System.out.println("Valor total");
		total = teclado.nextDouble();
		System.out.println("Desconto (%)");
		desconto = teclado.nextDouble();
		// processamento
		totalDesconto = total - (desconto * total) / 100;
//saida	

		System.out.println("Total com desconto: R$" + totalDesconto);
		System.out.println("Valor pago com dinheiro:");
		valorPago = teclado.nextDouble();
		troco = valorPago - totalDesconto;
		System.out.println("Troco: R$:" + troco);
		teclado.close();

	}

}
