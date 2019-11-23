package bankomat;

public class TransferNovca extends KreiranjeRacuna {
	int sourceAccount;
	int targetAccount;
	double iznosKojiSePrebacuje;

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
		return iznosKojiSePrebacuje;
	}

	public void setIznosKojiSePrebacuje(double iznosKojiSePrebacuje) {
		this.iznosKojiSePrebacuje = iznosKojiSePrebacuje;
	}
	
}
