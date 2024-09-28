package jun2022;

public abstract class Zaposleni {
	String ime;
	String prezime;
	double plata;
	
	public Zaposleni(String ime, String prezime, double plata) {
		this.ime = ime;
		this.prezime = prezime;
		this.plata = plata;
	}

	public double getPlata() {
		return plata;
	}
	
	public abstract void izracunajPlatu(int brojSati);
	
	//kada nasledjujemo apstraktnu metodu
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Zaposleni) {
			Zaposleni drugiZaposleni = (Zaposleni) obj;
			return this.plata == drugiZaposleni.plata;
		}
		return false;
	}
}
