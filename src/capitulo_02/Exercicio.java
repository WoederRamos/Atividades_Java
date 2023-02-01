package capitulo_02;

import java.util.Scanner;

public class Exercicio {
		
		 public static void main(String[] args) 
		 {
		Scanner entrada = new Scanner(System.in);
		 
		 int numero1;
		 int numero2;
		 float resultado = 0;
		 
		 
		 System.out.print("Entre com o primeiro numero: ");
		 numero1 = entrada.nextInt(); 
		 
		 System.out.print("Entre com o segundo numero: ");
		 numero2 = entrada.nextInt(); 
		 
		 System.out.print("Digite o operador: ");
		 String operador = entrada.next(); 
		 
		 
		 if (numero2 == 0)
				System.out.printf("o segundo numero tem que ser diferente de 0 ");
		 else {

		 
			 switch (operador)
			    {

			        case "+":
			            resultado = numero1+numero2;
			            break;
			        case "-":
			            resultado = numero1-numero2;
			            break;
			        case "*":
			            resultado = numero1*numero2;
			            break;
			        case "/":
			            resultado = numero1/numero2;
			            break;
			         default:
			 		    System.out.println("você botou o operador errado amigo");

			        	 
			            
			    }
			    System.out.println("Resultado igual a: "+ resultado);

		 }
		

		 }}
