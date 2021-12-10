package br.com.generation.exerciciowhile;

import java.util.Scanner;

public class ChecarIdade {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int idade = 0, count = 0 ,count1 = 0;
		
		
		while (idade != -99) {
			System.out.println("Digite sua idade: ");
			idade = in.nextInt();
			
			if(idade >= 1 && idade <= 21) {
				count++;
			}
			else if(idade > 50){
				count1++;
			}
		
		}
		System.out.println("O número de pessoas que tem menos que 21 é "+ count);
		System.out.println("O número de pessoas que tem mais do que 50 é "+ count1);
		
		in.close();

	}

}
