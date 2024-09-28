package oktobar2022;

public class Zaposleni extends Osoba {
    String imeFirme;
    String odeljenje;
    double mesecnaPlata;

    public Zaposleni(String ime, String datumRodjenja, String adresa, String imeFirme, String odeljenje, double mesecnaPlata) {
        super(ime, datumRodjenja, adresa);
        this.imeFirme = imeFirme;
        this.odeljenje = odeljenje;
        this.mesecnaPlata = mesecnaPlata;
    }

    @Override
    public void markica() {
        System.out.println("Crvena markica");
    }

    public double prosek() {
        return mesecnaPlata;
    }
}
