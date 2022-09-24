package listaexercicios;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int idade;
		int aux = 0;
		
		for(int i=0; i<10; i++) {
			System.out.println("Insira a sua idade: ");
			idade = s.nextInt();
			if(idade > 18) {
				aux++;
			}
		}
		System.out.println("Existem " + aux + " pessoas com mais de 18 anos");

	}

}
