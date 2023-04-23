package divisivel_por_3_e_por_7_IF;

import java.util.Scanner;

public class Divisivel_por_3_e_por_7_IF {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número para saber se ele é divisível por 3 e por 7");
		int numero = input.nextInt();
		
		if (numero %3 == 0 && numero %7 == 0) {
			System.out.println(numero + " ,este número é divisível por 3 e por 7.");
		} else {
			System.out.println(numero + " ,este número NÃO é divisível por 3 e por 7.");
		}
	}

}
