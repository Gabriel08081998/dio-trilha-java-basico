package aulas;

import java.util.Scanner;

public class AboutMe {

	public static void main(String[] args) {
		
		
		
		
	
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual seu nome");
		String nome =entrada.next();
		
		System.out.println("Qual seu sobrenome");
		String sobrenome = entrada .next();
		
		System.out.println("Qual a sua idade");
		int idade = entrada.nextInt();
		
		System.out.println("Qual a sua altura");
		double altura = entrada.nextDouble();
		
		System.out.println("Ola,me chamo " + nome + " " + sobrenome);
		
		System.out.println("Tenho " + idade + " anos ");
		System.out.println("Minha altura e " + altura + " cm " );

		entrada.close();
	}

}
