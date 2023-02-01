package capitulo_02;
/*
 * Questão 02
 * R = uma classe e um método
 */
/*
 * Questão 03
 * R = adicionei a linha de código com o println, adicionei entre parenteses a mensagem
 *  e cliquei no botão run para executar o programa.
 */
public class Welcome1 {
	
	public static void main(String[] args) { 
	
		String data_hora = "18/08/2021 23:14";
		String nome = "Woeder";
		String matricula = "20202y6-rc0302";
		
		//System.out.println("Welcome to java Programing!");
		
		/*
		 * Questão 04
		 */
		System.out.print("Bem-Vindo!");
		System.out.print("Woeder_20202y6-rc0302");
		System.out.println("Saudações!");
		System.out.print("\n");
		
		/*
		 * Questão 05 
		 */
		System.out.println("\"Bem-Vindo! Woeder_20202y6-rc0302 Saudações!\"");
		
		/*
		 * Questão 06 
		 */
		System.out.println("\"Bem-Vindo!\nWoeder_20202y6-rc0302\nSaudações!\"");
		
		/*
		 * Questão 07
		 */
		System.out.printf("\tBem-Vindo!\n\tWoeder_20202y6rc0302\n\tSaudações!\n");
		
		/*
		 * Questão 08 
		 */
	
		System.out.println("\"Bem-Vindo!\"Woeder_20202y6-rc0302\"Saudações!\"");
		
		/*
		 * Questão 09 
		 */
		System.out.printf("%s\t%s\t%s", nome, data_hora, matricula);
		
	
	}

}