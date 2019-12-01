package atm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class MoneyTransfer extends UsersAccount {

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
	public boolean findSourceAccount() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("vjezba11.txt"));
		String line;
		int i = -1;

		while ((line = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line);
			
			setName(st.nextToken());
			setAccountNumber(Integer.parseInt(st.nextToken()));
			setAccountBalanse(Double.parseDouble(st.nextToken()));
			
			if (getAccountNumber() == getSourceAccount()) {
				i = 1;
			}
		}

		br.close();
		return i == 1 ? true : false;
	}

	public boolean findTargetAccount() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("vjezba11.txt"));
		String line;
		int i = -1;

		while ((line = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line);
			
			setName(st.nextToken());
			setAccountNumber(Integer.parseInt(st.nextToken()));
			setAccountBalanse(Double.parseDouble(st.nextToken()));
			
			if (getAccountNumber() == getTargetAccount()) {
				i = 1;
			}
		}

		br.close();
		return i == 1 ? true : false;
	}

	public boolean checkingBalanseSource() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("vjezba11.txt"));
		String line;
		int i = -1;

		while ((line = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line);
			
			setName(st.nextToken());
			setAccountNumber(Integer.parseInt(st.nextToken()));
			setAccountBalanse(Double.parseDouble(st.nextToken()));

			if (getAccountNumber() == getSourceAccount() && getAccountBalanse() > getTransferAmount()) {
				i = 1;
			}
		}
		
		br.close();
		return i == 1 ? true : false;
	}

}
