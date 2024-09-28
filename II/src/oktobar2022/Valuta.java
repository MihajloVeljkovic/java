package oktobar2022;

public class Valuta {
	private String naziv;
	private int kurs;
	static int brojValuta = 0;
	
	//konstruktor
	public Valuta(String naziv, int kurs) {
		this.naziv = naziv;
		this.kurs = kurs;
		brojValuta++;
	}
	
	public double racunajRazmenu(double brojJedinica) {
        return brojJedinica * kurs;
    }

    public void promeniKurs(double noviKurs) {
        kurs = noviKurs;
    }

    public static int brojKreiranihValuta() {
        return brojValuta;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getKurs() {
        return kurs;
    }
}
