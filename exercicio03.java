package listaexercicios;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num;
		
		int numpar = 0;
		int numimp = 0;
		int soma;
		
		for(int i=0; i<12; i++) {
			System.out.println("Informe o número: ");
			num = s.nextInt();
			
			if(num%2 != 0) {
				numimp++;
			}
			if(num%2 == 0) {
				numpar++;
			}
		}
		
		soma = numpar+numimp;
		
		System.out.println("Foram informados " + numimp + " números impares");
		System.out.println("Foram informados " + numpar + " números pares");
		System.out.println("A soma deles é " + soma);

	}

}
