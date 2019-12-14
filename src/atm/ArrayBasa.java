package atm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ArrayBasa extends MoneyTransfer {

	private ArrayList<UsersAccount> accounts = new ArrayList<>();

	public void fillingArrayFromFile() throws NumberFormatException, IOException {
		accounts.removeAll(accounts); // empty the array

		Path path = Paths.get("file.txt");

		if (!Files.exists(path)) {
			Files.createFile(path);
		}

		BufferedReader br = new BufferedReader(new FileReader("file.txt"));
		String data;

		while ((data = br.readLine()) != null) {
			String[] a = data.split(" ");

			setName(a[0]);
			setAccountNumber(Integer.valueOf(a[1]));
			setAccountBalanse(Double.valueOf(a[2]));

			accounts.add(new UsersAccount(getName(), getAccountNumber(), getAccountBalanse()));
		}

		br.close();
	}

	public void ViewAllUsersAccount() throws NumberFormatException, IOException {
		fillingArrayFromFile();

		System.out.println("\t\tView all users account");
		System.out.println("*********************************************************");
		System.out.println("*********************************************************");
		System.out.println("\n");

		for (UsersAccount e : accounts) {

			System.out.println("User name: " + e.getName());
			System.out.println("User account: " + e.getAccountNumber());
			System.out.println("User account balance: " + e.getAccountBalanse());
			System.out.println("---------------------------------------------------------");
			System.out.println("---------------------------------------------------------");
		}
	}

/////////////////////////////////////////////////////////////////
	public boolean checkingAccountNumber(int _accountNumber) {

		for (UsersAccount e : accounts) {
			if (e.getAccountNumber() == _accountNumber) {
				return false;
			}
		}
		return true;
	}

	public boolean checkingAccountNegativity(int _getAccountNumber, double _getAccountBalance) {
		return (_getAccountNumber > 0 && _getAccountBalance > 0);
	}

///////////////////////////////////////////////////////////////////////
	public boolean findSourceAccount() {

		for (UsersAccount e : accounts) {
			if (e.getAccountNumber() == getSourceAccount()) {
				return true;
			}
		}

		return false;
	}

	public boolean findTargetAccount() {

		for (UsersAccount e : accounts) {
			if (e.getAccountNumber() == getTargetAccount()) {
				return true;
			}
		}

		return false;
	}

	public boolean checkingBalanseSource() throws NumberFormatException, IOException {
		fillingArrayFromFile();

		for (UsersAccount e : accounts) {
			if (e.getAccountNumber() == getSourceAccount() && e.getAccountBalanse() > getTransferAmount()) {
				return true;
			}
		}

		return false;
	}

	public boolean transferMoneey() {
		for (UsersAccount e : accounts) {

			if (e.getAccountNumber() == getSourceAccount()) {
				e.setAccountBalanse(e.getAccountBalanse() - getTransferAmount());
				return true;
			}
		}
		return false;
	}

	public boolean receivedMoney() {
		for (UsersAccount e : accounts) {

			if (e.getAccountNumber() == getTargetAccount()) {
				e.setAccountBalanse(e.getAccountBalanse() + getTransferAmount());
				return true;
			}
		}
		return false;
	}

	public void fillingFileFromArray() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("file.txt"));
		bw.write("");// empty the file

		for (UsersAccount e : accounts) {

			bw.write(e.toString());
			bw.flush();
			bw.newLine();
		}

		bw.close();
	}

}
