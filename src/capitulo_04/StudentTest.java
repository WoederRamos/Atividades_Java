package capitulo_04;
//Questão 9: É muito importante realizar verificações e manter o código sempre funcionando, 
//pois, caso deixemos para testá-lo apenas no final, será mais difícil encontrar e corrigir os erros.
public class StudentTest {

	public static void main(String[] args) 
	{
		Student account1 = new Student("Jane Green", 83);
		Student account2 = new Student("Jonh Blue", 56);
		
		System.out.printf("%s's letter grade is: %s%n",
		account1.getNome(), account1.obtemLetraNota());
		System.out.printf("%s's letter grade is: %s%n",
		account2.getNome(), account2.obtemLetraNota());
		
		// QUESTAO 13
		account1.toString();
		account2.toString();
	}
}
