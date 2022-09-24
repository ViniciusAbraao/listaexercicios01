package listaexercicios;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int idade;
		int soma = 0;
		
		for(int i=1; i<=5; i++) {
			System.out.println("Insira a sua idade: ");
			idade = s.nextInt();
			soma += idade;
		}
		System.out.println("A soma das idades é: " + soma);

	}

}
