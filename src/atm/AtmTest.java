package atm;

import java.util.ArrayList;
import java.util.Scanner;

public class AtmTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<UsersAccount> accounts = new ArrayList<>();

		UsersAccount account1 = new UsersAccount("Hata", 123, 333.3);
		accounts.add(account1);

		UsersAccount account2 = new UsersAccount("Kadira", 124, 111.1);
		accounts.add(account2);

		System.out.println("Unesi ime:");
		String name = input.next();
		
		System.out.println("Unesite broj racuna:");
		int accountNumber = input.nextInt();
		
		System.out.println("Unesi stanje na racunu: ");
		double accountBalanse = input.nextDouble();

		while (UsersAccount.checkingAccountNumber(accounts, accountNumber) == false
				||UsersAccount.checkingAccountNegativity(accountNumber, accountBalanse) == false) {
			System.out.println("Pogrešan unos, pokušajte ponovo.");
			
			System.out.println("Unesi ime:");
			name = input.next();
			
			System.out.println("Unesite broj racuna:");
			accountNumber = input.nextInt();
			
			System.out.println("Unesi stanje na racunu: ");
			accountBalanse = input.nextDouble();
		}

		if (UsersAccount.checkingAccountNumber(accounts, accountNumber) == true
				||UsersAccount.checkingAccountNegativity(accountNumber, accountBalanse) == true) {

			accounts.add(new UsersAccount(name, accountNumber, accountBalanse));
			System.out.println("Vas racun je kreiran.");
		}

		for (int i = 0; i < accounts.size(); i++) {
			System.out.println(accounts.get(i));
		}
//////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("Unesite broj racuna sa kojega šaljete:");
		int sourceAccount = input.nextInt();
		
		System.out.println("Unesite broj racuna kojem šaljete:");
		int targetAccount = input.nextInt();
		
		System.out.println("Unesite iznos novca koji šaljete:");
		double transferAmount = input.nextDouble();

		
		MoneyTransfer moneyTransfer1= new MoneyTransfer(sourceAccount, targetAccount, transferAmount);
		if (moneyTransfer1.findSourceAccount(accounts) ==true && moneyTransfer1.findTargetAccount(accounts) == true
				&& moneyTransfer1.checkingBalanseSource(accounts) == true) {
			moneyTransfer1.transferToNewAccount(accounts);
		}

		for(UsersAccount e: accounts) {
			System.out.println(e);
		}

		input.close();
	}
	

}
