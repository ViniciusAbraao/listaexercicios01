package listaexercicios;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Quantos produtos serão computados?");
		int total = s.nextInt();
		
		float soma = 0;
		float preco;
		
		for(int i=0; i<total; i++) {
			System.out.println("Informe o preço: ");
			preco = s.nextFloat();
			soma += preco;
		}
		
		System.out.println("O total da conta é: " + soma);

	}

}
