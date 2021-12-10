package br.com.generation.exerciciowhile;

import java.util.Scanner;

public class CaracteristicasPsicologicas {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 0, idade = 0, sexo = 0, temperamento = 0; 
		int countIdadeMenor = 0 ,countIdadeMaior = 0;
		int countMasculino = 0, countFeminino = 0, countOutro = 0 ;
		int countAgressivo = 0, countCalmo = 0, countNervoso = 0, countOutroCalmo = 0, countAdultoNervoso = 0, countJovemCalmos = 0;
		
		
		
		
		
		System.out.println("*---------------------*:");
		System.out.println("Bem vindo a Psicologa Generation:");
		System.out.println("*---------------------*:");
		
		
		
		
		while (n != 150) {
			System.out.println("Digite sua idade: ");
			idade = in.nextInt();
			System.out.println("*---------------------*:");
			
			System.out.println("Selecione o seu sexo:");
			System.out.println("\n1: Masculino ");
			System.out.println("\n2: Feminino ");
			System.out.println("\n3: Outros ");
			sexo = in.nextInt();
			
			System.out.println("*---------------------*:");
			
			System.out.println("Selecione seu temperamento atual:");
			System.out.println("\n1: Calmo ");
			System.out.println("\n2: Nervoso ");
			System.out.println("\n3: Agressivo ");
			temperamento = in.nextInt();
			
			System.out.println("*---------------------*:");
			
			if(idade >= 1 && idade <= 18) {
				countIdadeMenor++;
			}
			if(idade >= 40){
				countIdadeMaior++;
			}
			
			if(sexo == 1) {
				countMasculino++;
			}
			if(sexo == 2){
				countFeminino++;
			}
			if(sexo == 3){
				countOutro++;
			}
			
			if(temperamento == 1) {
				countCalmo++;
			}
			if(temperamento == 1 && sexo == 3){
				countOutroCalmo++;
			}
			if(temperamento == 2 && sexo == 2){
				countNervoso++;
			}
			if(temperamento == 3 && sexo == 1){
				countAgressivo++;
			}
			if(temperamento == 2 && sexo == 1 && idade >= 40) {
				countAdultoNervoso++;
			}
			if(temperamento == 1 && sexo == 1 &&  idade <= 18 ) {
				countJovemCalmos++;
			}
			n++;
		
		}
		System.out.println("O número de pessoas que são calmas são "+ countCalmo);
		System.out.println("O número de Mulheres que estão nervosas são de: "+ countNervoso);
		System.out.println("O número de Homens que são agressivos são de: "+ countAgressivo);
		System.out.println("O número de outros Calmos são de:  "+ countOutroCalmo);
		System.out.println("O número de pessoas com mais de 40 nervosas são de:  "+ countAdultoNervoso);
		System.out.println("O número de pessoas com menos de 18 anos que são calmas são de:  "+ countJovemCalmos);
		
		in.close();

	}

}
