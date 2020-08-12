package exercicio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
	
		
		
		//varíaveis
		double peso,altura,imc;
		
		
	//objetos	
		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		//entrada
		
		System.out.println("Cálculo do IMC");
		System.out.println("Digite o seu peso em kilogramas:");
		
		peso = teclado.nextDouble();
        System.out.println("Digite a sua altura em metros:");
		altura = teclado.nextDouble();
		
		//processamento
		
		imc = peso / (altura * altura);
		//saída
		 System.out.println("IMC:" + formatador.format(imc));
		
		teclado.close();
		
		
		
	
		
		
		
	}

}
