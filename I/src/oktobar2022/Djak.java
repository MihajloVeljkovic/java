package oktobar2022;

public class Djak extends Osoba {
	String nazivSkole;
    int razred;
    double prosecnaOcena;

    public Djak(String ime, String datumRodjenja, String adresa, String nazivSkole, int razred, double prosecnaOcena) {
        super(ime, datumRodjenja, adresa);
        this.nazivSkole = nazivSkole;
        this.razred = razred;
        this.prosecnaOcena = prosecnaOcena;
    }

    @Override
    public void markica() {
        System.out.println("Plava markica");
    }

    public double prosek() {
        return prosecnaOcena;
    }
}
