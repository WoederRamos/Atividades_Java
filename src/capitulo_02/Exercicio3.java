package capitulo_02;

import java.util.Scanner;

//Exercício 2.6
public class Exercicio3 {

		
		public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in);
			
			System.out.println("CÁLCULO DO PRODUTO ENTRE 3 INTEIROS QUAISQUER:");
			
			// Declarações
			int x, y, z, result;
			
			System.out.print("Digite o primeiro inteiro: ");
			x = input.nextInt();
			
			System.out.print("Digite o segundo inteiro: ");
			y = input.nextInt();
			
			System.out.print("Digite o terceiro inteiro: ");
			z = input.nextInt();
			
			result = x * y * z;
			
			System.out.printf("O produto é %d%n", result);
		} // Fim do main
	} // Fim da classe