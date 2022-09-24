package listaexercicios;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		float soma;
		float sub;
		float div;
		float multi;
		
		System.out.println("Quer fazer qual operação: ");
		System.out.println("1 - Soma / 2 - Subtração / 3 - Divisão / 4 - Multiplicação");
		int opcao = s.nextInt();
		
		System.out.println("Informe o primeiro valor: ");
		float v1 = s.nextFloat();
		
		System.out.println("Informe o segundo valor: ");
		float v2 = s.nextFloat();
		

		switch(opcao) {
			case 1:
				soma = v1+v2;
				System.out.println("O resultado é: " + soma);
			break;
			
			case 2:
				sub = v1-v2;
				System.out.println("O resultado é: " + sub);
			break;
			
			case 3:
				div = v1/v2;
				System.out.println("O resultado é: " + div);
			break;
			
			case 4:
				multi = v1*v2;
				System.out.println("O resultado é: " + multi);
			break;
			
			default:
				System.out.println("Operação Inválida");
			break;
			
		}

	}

}
