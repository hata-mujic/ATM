package bankomat1;

import java.util.ArrayList;

public class TransferNovca1 extends KreiranjeRacuna1 {

	int sourceAccount;
	int targetAccount;
	double transferAmount;

	public TransferNovca1() {

	}

	public TransferNovca1(int _sourceAccount, int _targetAccount, double _transferAmount) {
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

	public double getIznosKojiSePrebacuje() {
		return transferAmount;
	}

	public void setIznosKojiSePrebacuje(double transferAmount) {
		this.transferAmount = transferAmount;
	}

	public boolean sourceLessThanTarget(double getBalanceSource, double getBalanceTarget) {
		if (getBalanceSource > getBalanceTarget) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean numbersAccountSource(ArrayList<Integer> _arrayAccounts, int _sourceAccount) {
		if (_arrayAccounts.contains(_sourceAccount)) {
			return true;
		} else {
			return false;
		}

	}
	
	public static boolean numbersAccountTarget(ArrayList<Integer> _arrayAccounts, int _targetAccount) {
		if (_arrayAccounts.contains(_targetAccount)) {
			return true;
		} else {
			return false;
		}

	}

}
