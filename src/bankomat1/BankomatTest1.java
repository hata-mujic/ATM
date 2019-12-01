package bankomat1;

import java.util.ArrayList;
import java.util.Scanner;

public class BankomatTest1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> nizBrojaRacuna = new ArrayList<>();
		ArrayList<KreiranjeRacuna1> racun = new ArrayList<>();

		KreiranjeRacuna1 racun1 = new KreiranjeRacuna1("Hata", 123, 333.3);
		racun.add(racun1);
		nizBrojaRacuna.add(racun1.getBrojRacuna());
		KreiranjeRacuna1 racun2 = new KreiranjeRacuna1("Kadira", 124, 111.1);
		racun.add(racun2);
		nizBrojaRacuna.add(racun2.getBrojRacuna());

		String ime;
		int brojRacuna;
		double stanjeRacuna;

		System.out.println("Unesi ime:");
		ime = input.next();
		System.out.println("Unesite broj racuna:");
		brojRacuna = input.nextInt();
		System.out.println("Unesi stanje na racunu: ");
		stanjeRacuna = input.nextDouble();

		while (provjeraBrojaRacuna(nizBrojaRacuna, brojRacuna) == false
				|| provjeraNegativnostiBrojaRacuna(brojRacuna) == false
				|| provjeraNegativnostiStanjaRacuna(stanjeRacuna) == false) {
			System.out.println("Pogrešan unos, pokušajte ponovo.");
			System.out.println("Unesi ime:");
			ime = input.next();
			System.out.println("Unesite broj racuna:");
			brojRacuna = input.nextInt();
			System.out.println("Unesi stanje na racunu: ");
			stanjeRacuna = input.nextDouble();
		}

		if (provjeraBrojaRacuna(nizBrojaRacuna, brojRacuna) == true
				&& provjeraNegativnostiBrojaRacuna(brojRacuna) == true
				&& provjeraNegativnostiStanjaRacuna(stanjeRacuna) == true) {

			nizBrojaRacuna.add(brojRacuna);
			racun.add(new KreiranjeRacuna1(ime, brojRacuna, stanjeRacuna));
			System.out.println("Vas racun je kreiran.");
		}

		for (int i = 0; i < racun.size(); i++) {
			System.out.println(racun.get(i));
		}
//////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("Unesite broj racuna sa kojega šaljete:");
		int sourceAccount = input.nextInt();
		System.out.println("Unesite broj racuna kojem šaljete:");
		int targetAccount = input.nextInt();
		System.out.println("Unesite iznos novca koji šaljete:");
		double transferAmount = input.nextDouble();

		TransferNovca1 transferNovca1 = new TransferNovca1(sourceAccount, targetAccount, transferAmount);
		if (transferNovca1.findBalansSource(racun) !=-1 && transferNovca1.findBalansTarget(racun) ==true
				&& transferNovca1.sourceLessThanTarget(transferNovca1.findBalansSource(racun)) == true) {
			transferNovca1.transferToNewAccount(racun);
		}
		
		for(KreiranjeRacuna1 e: racun) {
			System.out.println(e+ " ");
		}

		input.close();
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static boolean provjeraBrojaRacuna(ArrayList<Integer> _niz, int _brojRacuna) {
		if (_niz.contains(_brojRacuna)) {
			return false;
		} else {
			return true;
		}

	}

	public static boolean provjeraNegativnostiBrojaRacuna(int _brojRacuna) {
		if (_brojRacuna > 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean provjeraNegativnostiStanjaRacuna(double stanjeRacuna) {
		if (stanjeRacuna > 0) {
			return true;
		} else {
			return false;
		}
	}

}
