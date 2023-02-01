package capitulo_03;
import java.util.Scanner;
public class AccountTest 
{

	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		
		//Account myAccount = new Account();
		
		//System.out.printf("Nome inicial é: %s%n%n", myAccount.getName());
		
		//System.out.println("Por favor entre com o nome:");
		//String theName = input.nextLine();
		//myAccount.setName(theName);
		//System.out.println();
		
		//System.out.printf("Nome do obejeto minha conta é:%n%s%n", myAccount.getName());
		
		Account account1 = new Account("Matheus");
		Account account2 = new Account("Paulo");
		
		System.out.printf("Nome da conta1 é: %s%n", account1.getName());
		System.out.printf("Nome da conta2 é: %s%n", account2.getName());
		

		
		
	}

}
