package oktobar2022;

public class Osoba {
	String ime;
    String datumRodjenja;
    String adresa;

    public Osoba(String ime, String datumRodjenja, String adresa) {
        this.ime = ime;
        this.datumRodjenja = datumRodjenja;
        this.adresa = adresa;
    }

    public void markica() {
        System.out.println("Osnovna markica");
    }

	public String prosek() {
		return null;
	}
}
