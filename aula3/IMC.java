package exercicio;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);	
	
	System.out.println("Digite o seu peso");
	double peso = leitor.nextDouble();
	System.out.println("Digite o seu altura");
	double altura = leitor.nextDouble();
	double imc;
	imc = peso / (altura * altura);	
	System.out.println("IMC eh:" + imc);
	
	
	
	
	
	
	
	
	
	
	}

}
