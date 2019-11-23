package bankomat;

import java.util.ArrayList;

public class BankomatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KreiranjeRacuna racun1 = new KreiranjeRacuna();
		KreiranjeRacuna racun2 = new KreiranjeRacuna();
		KreiranjeRacuna racun3 = new KreiranjeRacuna();

		ArrayList<Integer> niz = new ArrayList<Integer>();

		racun3.setIme("Suljo");
		racun3.setStanjeRacuna(12);
		racun1.setBrojRacuna(12345);
		niz.add(racun1.getBrojRacuna());

		
		racun3.setIme("Haso");
		racun3.setStanjeRacuna(127);
		racun2.setBrojRacuna(123456);
		niz.add(racun2.getBrojRacuna());

		racun3.setIme("Huso");
		racun3.setStanjeRacuna(1267);
		racun3.setBrojRacuna(1234567);
		niz.add(racun3.getBrojRacuna());

		System.out.println(racun3.nizBrojaRacuna(niz));

		racun3.ispitivanje();
		
		TransferNovca transfer1= new TransferNovca();
		transfer1.setTargetAccount(12345);
		
	}

}
