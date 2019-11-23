package bankomat1;

import java.util.ArrayList;

public class Racun extends KreiranjeRacuna1 {
	private static ArrayList<KreiranjeRacuna1> niz = new ArrayList<>();

	public static ArrayList<KreiranjeRacuna1> nizRacuna(ArrayList<KreiranjeRacuna1> _niz) {

		return niz;
	}

	/*
	 * public ArrayList<Integer> getNizRacuna() { return niz; }
	 */

	public static void viewNizRacuna(ArrayList<KreiranjeRacuna1> _niz) {
		for (KreiranjeRacuna1 e : niz) {
			System.out.print(e + " ");
			System.out.println();
		}
	}
	/*
	 * public int provjera(ArrayList<KreiranjeRacuna1> _niz, int source){ for (int i
	 * = 0; i < _niz.size(); i++) { if(_niz.get(i)) {
	 * 
	 * }
	 * 
	 * }
	 */
		
	}
	
	@Override
	public String toString() {
	    String results = "+";
	    for(KreiranjeRacuna1 d : niz) {
	        results += d.toString(); //if you implement toString() for Dog then it will be added here
	    }
	    return results;
	  }
	
}
