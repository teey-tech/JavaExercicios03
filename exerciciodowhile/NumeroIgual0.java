package br.com.generation.exerciciodowhile;

import java.util.Scanner;

public class NumeroIgual0 {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, soma=0;

        do {
            System.out.println("digite o numero: ");
            numero=entrada.nextInt();
            soma=soma+numero;
        }while(numero!=0);
        System.out.println("a soma dos numeros inseridos é: "+soma);
        entrada.close();
    }

}
