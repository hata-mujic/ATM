package atm;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UsersBasa extends ArrayBasa {

	Scanner input = new Scanner(System.in);

	public void addUser() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("file.txt", true));

		System.out.println("\t\t Creating a bank account.");
		System.out.println("*********************************************************");
		System.out.println("*********************************************************");
		System.out.println("\n");

		System.out.print("Enter a name: ");
		String name = input.next();
		setName(name);

		System.out.print("Enter the account number: ");
		int aNumber = input.nextInt();
		setAccountNumber(aNumber);

		System.out.print("Enter the account balance: ");
		double bNumber = input.nextDouble();
		setAccountBalanse(bNumber);

		while (checkingAccountNegativity(getAccountNumber(), getAccountBalanse()) == false
				|| checkingAccountNumber(getAccountNumber()) == false) {

			System.out.println("\n");
			System.out.println("**************** <<==WRONG ENTRY ************************");
			System.out.println("****************** TRY AGAIN==>> ************************");
			System.out.println("\n");

			System.out.print("Enter a name: ");
			name = input.next();
			setName(name);

			System.out.print("Enter the account number: ");
			aNumber = input.nextInt();
			setAccountNumber(aNumber);

			System.out.print("Enter the account balance: ");
			bNumber = input.nextDouble();
			setAccountBalanse(bNumber);
		}

		System.out.println("\n");
		System.out.println("************ Your account has been created. *************");
		System.out.println("\n");

		bw.write((new UsersAccount(name, aNumber, bNumber)).toString());
		bw.flush();
		bw.newLine();
		bw.close();

		fillingArrayFromFile();

	}

	public void transferMoney() throws IOException {

		System.out.println("\t\tTransfer money.");
		System.out.println("*********************************************************");
		System.out.println("*********************************************************");
		System.out.println("\n");

		System.out.print("Enter the account number from which you are sending: ");
		setSourceAccount(input.nextInt());

		System.out.print("Enter the account number you are sending: ");
		setTargetAccount(input.nextInt());

		System.out.print("Enter the amount of money you want to send: ");
		setTransferAmount(input.nextDouble());

		while (findSourceAccount() == false || findTargetAccount() == false || checkingBalanseSource() == false
				|| getTransferAmount() < 0) {

			System.out.println("\n");
			System.out.println("**************** <<==WRONG ENTRY ************************");
			System.out.println("****************** TRY AGAIN==>> ************************");
			System.out.println("\n");

			System.out.print("Enter the account number from which you are sending: ");
			setSourceAccount(input.nextInt());

			System.out.print("Enter the account number you are sending: ");
			setTargetAccount(input.nextInt());

			System.out.print("Enter the amount of money you want to send: ");
			setTransferAmount(input.nextDouble());

		}

		System.out.println("\n");
		System.out.println("************* Your money have transferred. **************");
		System.out.println("\n");

		transferToNewAccount();

	}

}
