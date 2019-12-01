package atm;

import java.util.ArrayList;

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

	public static boolean checkingAccountNumber(ArrayList<UsersAccount> _accunts, int _accountNumber) {
		for (UsersAccount e : _accunts) {
			if (e.getAccountNumber() != _accountNumber) {
				return true;
			}
		}
		return false;
	}

	public static boolean checkingAccountNegativity(int _accountNumber, double _accountBalanse) {
		if (_accountNumber > 0 && _accountBalanse > 0) {
			return true;
		}
		return false;

	}

}
