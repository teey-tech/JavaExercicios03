package br.com.generation.exerciciofor;

import java.util.Scanner;

public class ParesInpares {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner leia = new Scanner(System.in);
		int  n, count = 0, count2 = 0;
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("informe os numeros: ");
			n = leia.nextInt();
			
			if((n % 2) == 0) {
				count++;
			}else {
				count2++;
			}
			Thread.sleep(500);
		}
		System.out.println("O total de numero pares é : " + count);
		System.out.println("O total de numeros impares é: " + count2);
	}

}
