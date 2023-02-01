/*
 * Questão 10
 * R= o programa pede para o usuário digitar o primeiro número
 * inteiro, depois de digitado o programa pede para o usuário 
 * digitar o segundo número inteiro, após o usuáro digitar os
 * dois números inteiros o sistema retorna para o usuário a soma
 * dos dois números.
 * 
 * Questão 11
 * R= É uma instrução de declaração de variável especificando o nome (imput)
 * e o tipo(Scanner) esta variável permite o programa ler dados.
 * 
 * Questão 12
 * 
 * R= Ocorre um erro na compilação porque a linha 3 está comentada,
 * linha qual tem o papel de importar uma biblioteca de classes java.
 */


package capitulo_02;

import java.util.Scanner;

public class Addition {
	
	public static void main(String[] args) 
	{
		Scanner imput = new Scanner(System.in);
		int number1;
		int number2;
		int sum;
		
		System.out.print("Entre com o primeiro inteiro: ");
		number1 = imput.nextInt();
		
		System.out.print("Entre com o segundo inteiro: ");
		number2 = imput.nextInt();
		
		sum = number1 + number2;
		
		System.out.printf("A soma é: %d%n", sum);
	}

}
