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

	public double getTransferAmount() {
		return transferAmount;
	}

	public void setTransferAmount(double transferAmount) {
		this.transferAmount = transferAmount;
	}

	public double findBalansSource(ArrayList<KreiranjeRacuna1> _account) {
		for (KreiranjeRacuna1 e : _account) {
			if (e.getBrojRacuna() == getSourceAccount()) {
				return e.getStanjeRacuna();
			}
		}
		return -1;
	}

	public boolean findBalansTarget(ArrayList<KreiranjeRacuna1> _account) {
		for (KreiranjeRacuna1 e : _account) {
			if (e.getBrojRacuna() == getTargetAccount()) {
				return true;
			}
		}
		return false;
	}

	public boolean sourceLessThanTarget(double getBalanceSource) {
		return getBalanceSource > getTransferAmount();
	}

	public void transferToNewAccount(ArrayList<KreiranjeRacuna1> _account) {
		for (KreiranjeRacuna1 e : _account) {
			if (e.getBrojRacuna() == getSourceAccount()) {
				e.setStanjeRacuna(e.getStanjeRacuna() - getTransferAmount());
			}
		}

		for (KreiranjeRacuna1 e : _account) {
			if (e.getBrojRacuna() == getTargetAccount()) {
				e.setStanjeRacuna(e.getStanjeRacuna() + getTransferAmount());
			}
		}

	}

}
