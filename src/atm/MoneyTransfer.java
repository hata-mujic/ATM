package atm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

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

		BufferedReader br = new BufferedReader(new FileReader("file.txt"));
		File file = new File("file.txt");
		Scanner sc = new Scanner(file);

		int i = -1;

		while ((br.readLine()) != null) {
			while (sc.hasNext()) {

				setName(sc.next());
				setAccountNumber(Integer.parseInt(sc.next()));
				setAccountBalanse(Double.parseDouble(sc.next()));

				if (getAccountNumber() == getSourceAccount()) {
					i = 1;
				}
			}
		}

		br.close();
		sc.close();
		return i == 1 ? true : false;
	}

	public boolean findTargetAccount() throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("file.txt"));
		File file = new File("file.txt");
		Scanner sc = new Scanner(file);

		int i = -1;

		while ((br.readLine()) != null) {
			while (sc.hasNext()) {

				setName(sc.next());
				setAccountNumber(Integer.parseInt(sc.next()));
				setAccountBalanse(Double.parseDouble(sc.next()));

				if (getAccountNumber() == getTargetAccount()) {
					i = 1;
				}
			}
		}

		br.close();
		sc.close();
		return i == 1 ? true : false;
	}

	public boolean checkingBalanseSource() throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new FileReader("file.txt"));
		File file = new File("file.txt");
		Scanner sc = new Scanner(file);

		int i = -1;

		while ((br.readLine()) != null) {
			while (sc.hasNext()) {

				setName(sc.next());
				setAccountNumber(Integer.parseInt(sc.next()));
				setAccountBalanse(Double.parseDouble(sc.next()));

				if (getAccountNumber() == getSourceAccount() && getAccountBalanse() > getTransferAmount()) {
					i = 1;
				}
			}
		}
		br.close();
		sc.close();
		return i == 1 ? true : false;
	}

}
