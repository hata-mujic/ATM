package atm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UsersAccount {
	private String name;
	private int accountNumber;
	private double accountBalanse;

	public UsersAccount() {

	}

	public UsersAccount(String name, int accountNumber, double accountBalanse) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.accountBalanse = accountBalanse;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalanse() {
		return accountBalanse;
	}

	public void setAccountBalanse(double accountBalanse) {
		this.accountBalanse = accountBalanse;
	}

	@Override
	public String toString() {
		return "name=" + name + ", accountNumber=" + accountNumber + ", accountBalanse=" + accountBalanse;
	}

	public boolean checkingAccountNegativity() {
		if (getAccountNumber() < 0 || getAccountBalanse() < 0) {
			return false;
		}
		return true;
	}

	public boolean checkingAccountNumber(int account) throws IOException {
		int i = -1;
		BufferedReader br = new BufferedReader(new FileReader("file.txt"));
		File file = new File("file.txt");
		Scanner sc = new Scanner(file);

		while ((br.readLine()) != null) {
			while (sc.hasNext()) {

				setName(sc.next());
				setAccountNumber(Integer.parseInt(sc.next()));
				setAccountBalanse(Double.parseDouble(sc.next()));
				if (getAccountNumber() == account) {
					i = 1;
				}
			}
		}
		sc.close();
		br.close();
		return i == -1 ? true : false;

	}

}

