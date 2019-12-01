package atm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

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

	public boolean checkingAccountNumber() throws IOException {
		int i = -1;
		String line;
		BufferedReader br = new BufferedReader(new FileReader("vjezba11.txt"));

		while ((line = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line);
			setName(st.nextToken());

			int account = Integer.parseInt(st.nextToken());

			if (account == getAccountNumber()) {
				i = 1;
			}
			//setAccountBalanse(Double.parseDouble(st.nextToken()));
		}
		br.close();
		return i == -1 ? true : false;

	}

}
