package capitulo_02;
/* Questão 13
 * R = O código irá pedir para o suário inserir dois inteiros
 * após o usuário introduzir os dois numero inteiros
 * O programa irá comparar os dois numeros inteiros depois
 * retornará para o usuário o resultado.
 * 
 * Questão 15
 * R= A entrada é do tipo int, ou seja só aceita imteiros
 * para ceitar letras seria um char
 */
import java.util.Scanner;

public class Comparison 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int soma;
		int multiplicação;
		int divisão;
		int resto;
		
		System.out.print("Entre com o primeiro inteiro: ");
		numero1 = input.nextInt();
		
		System.out.print("Entre com o segundo inteiro: ");
		numero2 = input.nextInt();
		
		if (numero1 == numero2)
			System.out.printf("%d == %d%n", numero1, numero2);
		if (numero1 != numero2)
			System.out.printf("%d != %d%n", numero1, numero2);
		if (numero1 < numero2)
			System.out.printf("%d < %d%n", numero1, numero2);
		if (numero1 > numero2)
			System.out.printf("%d > %d%n", numero1, numero2);
		if (numero1 <= numero2)
			System.out.printf("%d <= %d%n", numero1, numero2);
		if (numero1 >= numero2)
			System.out.printf("%d >= %d%n", numero1, numero2);
		
		soma = numero1 + numero2;
		System.out.printf("A soma entre %d e %d é: %d%n", numero1, numero2, soma);
		
		multiplicação = numero1 * numero2;
		System.out.printf("A multiplicação entre %d e %d é: %d%n", numero1, numero2, multiplicação);
		
		divisão = numero1 / numero2;
		System.out.printf("A divisão entre %d e %d é: %d%n", numero1, numero2, divisão);
		
		resto = numero1 % numero2;
		System.out.printf("O resto da divisão entre %d e %d é: %d%n", numero1, numero2, resto);
		
	}
}
