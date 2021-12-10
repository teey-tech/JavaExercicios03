package br.com.generation.exerciciofor;

public class InformarNumeros {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Os numeros que restam 5 são: ");
		for(int i = 1000; i <= 1999; i++) {
			if((i % 11) == 5) {
				System.out.println(i);
				Thread.sleep(100);
			}
		}

	}

}
