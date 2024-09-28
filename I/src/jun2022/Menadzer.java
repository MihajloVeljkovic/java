package jun2022;

public class Menadzer extends Zaposleni {
	//konstruktor
	public Menadzer(String ime, String prezime, double plata) {
		super(ime, prezime, plata);
	}
		
	//metoda za izracunavanje plate
	@Override
	public void izracunajPlatu(int brojSati) {
		plata = 200 * brojSati;
	}
}
