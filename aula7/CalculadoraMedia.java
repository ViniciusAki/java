package exercicio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraMedia {

	public static void main(String[] args) {
		//variáveis
String nome;
	
	double nota1, nota2, media;
	
	//objetos
	
	Scanner teclado = new  Scanner (System.in);
	DecimalFormat formatador = new DecimalFormat("#0.00");
	//Entrada
	System.out.print("Digite o seu nome: ");
	nome = teclado.nextLine();
	System.out.print("Digite a nota1:");
	nota1 = teclado.nextDouble();
	System.out.print("Digite a nota2:");
	nota2 = teclado.nextDouble();
	//processamento
	media = (nota1 + nota2) / 2;
	
	//saida 
	System.out.print("======================");
	System.out.print("== Calculo da média ==");
	System.out.print("======================");
	System.out.print("");
	System.out.print("Nome: "  + nome);
	System.out.print("Média: "  + formatador.format (media));
	
	//estrutura de controle condicional
	if(media <5 ) {
		System.out.print("REPROVADO" );
	} else {

	}

	System.out.print("APROVADO" );
	teclado.close();
	}

	
	
}
