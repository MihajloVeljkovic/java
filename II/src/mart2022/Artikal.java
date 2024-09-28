package mart2022;

public class Artikal {
    private int sifra;
    private String naziv;
    private double cena;
    private Akcija akcija;

    public Artikal(int sifra, String naziv, double cena, Akcija akcija) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.cena = cena;
        this.akcija = akcija;
    }

    public Artikal(int sifra, String naziv, double cena) {
        this(sifra, naziv, cena, null);
    }

    public int getSifra() {
        return sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getCena() {
        return cena;
    }

    public Akcija getAkcija() {
        return akcija;
    }

    public double cenaPoKomadu() {
        return akcija != null ? akcija.getCenaPoKomadu() : cena;
    }

    @Override
    public String toString() {
        return sifra + " " + naziv + " " + cena;
    }
}
