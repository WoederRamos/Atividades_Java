package capitulo_04;

import java.util.Scanner;

public class ClassAvarage {

public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		/*
		int total = 0; 
		int gradeCounter = 1;
		
		while (gradeCounter <= 10) 
			{
			System.out.print("Informe a nota: "); 
			 int grade = input.nextInt(); 
			 total = total + grade; 
			 gradeCounter = gradeCounter + 1; 
			 }
			
			 int average = total / 10; 
			 System.out.printf("%nTotal das notas e: %d%n", total);
			 System.out.printf("Media da classe e: %d%n", average);
			 } */
		
		// Questão 24:
		
	    // Agora é possível que o usuário insirir a quantidade de notas que ele desejar.
	    //O problema da divisão não ocorre mais pois ele apenas realizará a operação de divisão se
		//o usuário inserir pelo menos uma nota
		//O erro da divisão imprecisa não ocorre mais, pois o valor da média é double.
			int contadorNotas = 0;
			int total = 0;

			System.out.print("Enter grade or -1 to quit: ");
			int nota = input.nextInt();
			
			while (nota != -1) 
			{
				total = total + nota;
				contadorNotas += 1;
				
				System.out.print("Enter grade or -1 to quit: "); 
				nota = input.nextInt();
			}
			
			if (contadorNotas != 0) 
			{
				double media = (double) total / contadorNotas;
				System.out.printf("%nTotal de %d notas digitadas é %d%n",
				contadorNotas, total);
				System.out.printf("A media da classe é %.2f%n", media);
			}
			else 
			{
				System.out.println("Notas nãoo foram digitadas!"); 
			}
	}
}
