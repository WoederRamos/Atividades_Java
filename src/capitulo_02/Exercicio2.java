package capitulo_02;

import java.util.Scanner;

//Exercício 2.5
public class Exercicio2 {
		
		public static void main(String[] args)
		{
			//a)
			System.out.println("CÁLCULO DO PRODUTO ENTRE 3 INTEIROS QUAISQUER:");
					
			//b)
			Scanner input = new Scanner(System.in);
					
			//c)
			int x;
			int y;
			int z;
			int result;
					
			//d)
			System.out.print("Digite o primeiro inteiro: ");
					
			//e)
			x = input.nextInt();
					
			//f)
			System.out.print("Digite o segundo inteiro: ");
					
			//g)
			y = input.nextInt();		
					
			//h)
			System.out.print("Digite o terceiro inteiro: ");
					
			//i)
			z = input.nextInt();
			
			//j)
			result = x * y * z;	
					
			//k)
			System.out.printf("O produto é %d%n", result);
		}
	}