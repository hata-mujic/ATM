package bankomat1;

public class KreiranjeRacuna1 {
	private String ime;
	private int brojRacuna;
	private double stanjeRacuna;
	
	public KreiranjeRacuna1() {

	}

	public KreiranjeRacuna1(String _ime, int _brojRacuna, double _stanjeRacuna) {
		this.ime = _ime;
		this.brojRacuna = _brojRacuna;
		this.stanjeRacuna = _stanjeRacuna;
	}

	public KreiranjeRacuna1(int _brojRacuna) {
		this.brojRacuna = _brojRacuna;
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

	@Override
	public String toString() {
		return ("ime=" + ime + ", brojRacuna=" + brojRacuna + ", stanjeRacuna=" + stanjeRacuna);
	}

	

}
