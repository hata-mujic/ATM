package atm;

import java.util.ArrayList;

public class MoneyTransfer {

	int sourceAccount;
	int targetAccount;
	double transferAmount;

	public MoneyTransfer() {

	}

	public MoneyTransfer(int _sourceAccount, int _targetAccount, double _transferAmount) {
		this.sourceAccount = _sourceAccount;
		this.targetAccount = _targetAccount;
		this.transferAmount = _transferAmount;
	}

	public int getSourceAccount() {
		return sourceAccount;
	}

	public void setSourceAccount(int sourceAccount) {
		this.sourceAccount = sourceAccount;
	}

	public int getTargetAccount() {
		return targetAccount;
	}

	public void setTargetAccount(int targetAccount) {
		this.targetAccount = targetAccount;
	}

	public double getTransferAmount() {
		return transferAmount;
	}

	public void setTransferAmount(double transferAmount) {
		this.transferAmount = transferAmount;
	}
/////////////////////////////////////////////////////////////////////////////////////

	public boolean findSourceAccount(ArrayList<UsersAccount> _account) {
		for (UsersAccount e : _account) {
			if (e.getAccountNumber() == getSourceAccount()) {
				return true;
			}
		}
		return false;
	}

	public boolean findTargetAccount(ArrayList<UsersAccount> _account) {
		for (UsersAccount e : _account) {
			if (e.getAccountNumber() == getTargetAccount()) {
				return true;
			}
		}
		return false;
	}


	public boolean checkingBalanseSource(ArrayList<UsersAccount> _account) {
		for (UsersAccount e : _account) {
			if (e.getAccountNumber() == getSourceAccount() && e.getAccountBalanse() > getTransferAmount()) {
				return true;
			}
		}
		return false;
	}

	public void transferToNewAccount(ArrayList<UsersAccount> _account) {
		for (UsersAccount e : _account) {
			if (e.getAccountNumber() == getSourceAccount()) {
				e.setAccountBalanse(e.getAccountBalanse() - getTransferAmount());
			}
		}

		for (UsersAccount e : _account) {
			if (e.getAccountNumber() == getTargetAccount()) {
				e.setAccountBalanse(e.getAccountBalanse() + getTransferAmount());
			}
		}

	}

}
