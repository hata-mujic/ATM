package bankomat;

import java.util.ArrayList;

public class KreiranjeRacuna {

	private int brojRacuna;
	private String ime;
	private double stanjeRacuna;
	private ArrayList<Integer> niz = new ArrayList<Integer>();

	public KreiranjeRacuna() {

	}

	public int getBrojRacuna() {
		return brojRacuna;
	}

	public void setBrojRacuna(int brojRacuna) {
		this.brojRacuna = brojRacuna;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public double getStanjeRacuna() {
		return stanjeRacuna;
	}

	public void setStanjeRacuna(double stanjeRacuna) {
		this.stanjeRacuna = stanjeRacuna;
	}

	public boolean ispitivanjeNegativnostiBrojaRacuna() {
		if (getBrojRacuna() > 0) {
			return true;
		} else {
			return false;
		}
	}

	public ArrayList<Integer> nizBrojaRacuna(ArrayList<Integer> _niz) {
		for (int i = 0; i < _niz.size(); i++) {
			niz.add(_niz.get(i));
		}

		brisanjeDodavanjeClanaNizaBrojaRacuna();
		return niz;
	}

	public ArrayList<Integer> getNizBrojaRacuna() {
		return niz;
	}

	public boolean ispitivanjeNizBrojRacuna() {
		for (int i = 0; i < getNizBrojaRacuna().size(); i++) {
			if (i != getNizBrojaRacuna().size() - 1) {

				if (getNizBrojaRacuna().get(i) == getBrojRacuna()) {
					return false;
				}
			}
		}
		return true;
	}

	public ArrayList<Integer> brisanjeDodavanjeClanaNizaBrojaRacuna() {
		if (ispitivanjeNizBrojRacuna() == false) {
			niz.remove(getNizBrojaRacuna().size() - 1);
		}
		return niz;
	}

	public boolean ispitivanjeStanjaRacuna() {
		if (getStanjeRacuna() > 0) {
			return true;
		} else {
			return false;

		}
	}

	public void ispitivanje() {
		if (ispitivanjeNegativnostiBrojaRacuna() == false || ispitivanjeNizBrojRacuna() == false) {
			System.out.println("Ponovo ukucajte broj racuna.");
		} else if (ispitivanjeStanjaRacuna() == false) {
			System.out.println("Ponovo ukucajte stanje racuna.");
		} else {
			System.out.println("Vas racun je napravljen.");
		}

	}

}
