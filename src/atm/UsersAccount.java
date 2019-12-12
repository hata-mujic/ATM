package atm;

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
		return name + " " + accountNumber + " " + accountBalanse;
	}

}
