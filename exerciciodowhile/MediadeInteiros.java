package br.com.generation.exerciciodowhile;

import java.util.Scanner;

public class MediadeInteiros {
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    int numero, soma=0, cont=0;
	    double media;
	
	    do {
	        System.out.println("escreva o numero, para sair digite 0: ");
	        numero=entrada.nextInt();
	        if(numero%3==0 && numero!=0) {
	            cont++;
	            soma=numero+soma;
	        }
	    }while(numero!=0);
	   if(cont != 0) {
		   media=soma/cont;
		   System.out.println("a média é: "+media);
		   entrada.close();
	   }else {
		   System.out.println("Nenhum numero divisivel por 3 foi digitado");
	   }
	    
	  
	}
}
