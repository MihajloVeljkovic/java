package februar2022;

public class RacionalanBroj extends Broj {
	private int brojnik;
    private int nazivnik;

    public RacionalanBroj(int brojnik, int nazivnik) {
        this.brojnik = brojnik;
        this.nazivnik = nazivnik;
    }

    @Override
    public boolean većiOd(Broj drugi) {
        return odrediVrednost() > drugi.odrediVrednost();
    }

    @Override
    public void prikaziNaStdIzlaz() {
        System.out.println(brojnik + "/" + nazivnik);
    }

    @Override
    public Broj saberi(Broj drugi) {
        if (drugi instanceof RacionalanBroj) {
            RacionalanBroj racionalanDrugi = (RacionalanBroj) drugi;
            int noviNazivnik = this.nazivnik * racionalanDrugi.nazivnik;
            int noviBrojnik1 = this.brojnik * racionalanDrugi.nazivnik;
            int noviBrojnik2 = racionalanDrugi.brojnik * this.nazivnik;

            return new RacionalanBroj(noviBrojnik1 + noviBrojnik2, noviNazivnik);
        } else if (drugi instanceof KompleksanBroj) {
            KompleksanBroj kompleksanDrugi = (KompleksanBroj) drugi;
            double realniDeo = this.brojnik / (double) this.nazivnik;
            double imaginarniDeo = kompleksanDrugi.imaginarniDeo();

            return new KompleksanBroj(realniDeo + imaginarniDeo, kompleksanDrugi.getImaginarniDeo());
        } else {
            throw new IllegalArgumentException("Nije podržana operacija sabiranja sa datim tipom broja.");
        }
    }

    @Override
    public Broj podeli(int delilac) {
        return new RacionalanBroj(this.brojnik, this.nazivnik * delilac);
    }

    @Override
    protected double odrediVrednost() {
        return brojnik / (double) nazivnik;
    }
}
