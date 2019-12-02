package atm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UsersBasa extends MoneyTransfer {

	public void addUser() throws IOException {

		Scanner input = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new FileWriter("file.txt", true));

		System.out.println("\t\t Creating a bank account.");
		System.out.println("*********************************************************");
		System.out.println("*********************************************************");
		System.out.println("\n");

		String name;
		int aN;
		double aB;

		do {
			System.out.print("Enter a name: ");
			name = input.next();

			System.out.print("Enter the account number: ");
			aN = input.nextInt();

			System.out.print("Enter the account balance: ");
			aB = input.nextDouble();

			System.out.println("---------------------------------------------------------");
			System.out.println("---------------------------------------------------------");

		} while (checkingAccountNegativity() == false || checkingAccountNumber(aN) == false);

		bw.write(name + " " + aN + " " + aB);

		bw.flush();
		bw.newLine();
		bw.close();
		input.close();

	}

	public void transferMoney() throws IOException {
		Scanner input = new Scanner(System.in);

		System.out.println("\t\tTransfer money.");
		System.out.println("*********************************************************");
		System.out.println("*********************************************************");
		System.out.println("\n");

		do {
			System.out.print("Enter the account number from which you are sending: ");
			setSourceAccount(input.nextInt());

			System.out.print("Enter the account number you are sending: ");
			setTargetAccount(input.nextInt());

			System.out.print("Enter the amount of money you want to send: ");
			setTransferAmount(input.nextDouble());

			System.out.println("---------------------------------------------------------");
			System.out.println("---------------------------------------------------------");

		} while (findSourceAccount() == false || findTargetAccount() == false || checkingBalanseSource() == false);

		input.close();

		withdrawAndDepozitMoney();
	}

	
	public void withdrawAndDepozitMoney() throws IOException {

		File oldFile = new File("file.txt");
		File tempFile = new File("tFile.txt");

		BufferedReader br = new BufferedReader(new FileReader(oldFile));
		BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));

		Scanner sc = new Scanner(oldFile);
		String line;

		while ((line = br.readLine()) != null) {

			while (sc.hasNext()) {
				
				setName(sc.next());
				setAccountNumber(Integer.parseInt(sc.next()));
				setAccountBalanse(Double.parseDouble(sc.next()));

				if (getAccountNumber() == getSourceAccount()) {
					bw.write(getName() + " " + getAccountNumber() + " " + (getAccountBalanse() - getTransferAmount()));
				} else if (getAccountNumber() == getTargetAccount()) {
					bw.write(getName() + " " + getAccountNumber() + " " + (getAccountBalanse() + getTransferAmount()));
				} else {
					bw.write(line);
				}
				bw.flush();
				bw.newLine();
			}
			
		}
		bw.close();
		br.close();
		sc.close();

		oldFile.delete();

		boolean success = tempFile.renameTo(oldFile);
		System.out.println(success);

	}

	public void viewAllDataUser() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("file.txt"));
		File file = new File("file.txt");

		Scanner sc = new Scanner(file);

		System.out.println("\t\tList of users");
		System.out.println("*********************************************************");
		System.out.println("*********************************************************");
		System.out.println("\n");

		while ((br.readLine()) != null) {
			while (sc.hasNext()) {

				setName(sc.next());
				setAccountNumber(Integer.parseInt(sc.next()));
				setAccountBalanse(Double.parseDouble(sc.next()));

				System.out.println("User name: " + getName());
				System.out.println("User account: " + getAccountNumber());
				System.out.println("User account balance: " + getAccountBalanse());
				System.out.println("---------------------------------------------------------");
				System.out.println("---------------------------------------------------------");
			}
		}
		sc.close();
		br.close();
	}

}