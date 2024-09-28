package jun2022;

public class KancelarijskiRadnik extends Zaposleni {
	public KancelarijskiRadnik(String ime, String prezime, double plata) {
		super(ime, prezime, plata);
	}
	
	@Override
	public void izracunajPlatu(int brojSati) {
		plata = 100 * brojSati;
	}
}
