package februar2022;

public class KompleksanBroj extends Broj {
	private double realniDeo;
    private double imaginarniDeo;

    public KompleksanBroj(double realniDeo, double imaginarniDeo) {
        this.realniDeo = realniDeo;
        this.imaginarniDeo = imaginarniDeo;
    }

    @Override
    public boolean većiOd(Broj drugi) {
        return odrediVrednost() > drugi.odrediVrednost();
    }

    @Override
    public void prikaziNaStdIzlaz() {
        System.out.println(realniDeo + " + " + imaginarniDeo + "i");
    }

    @Override
    public Broj saberi(Broj drugi) {
        if (drugi instanceof RacionalanBroj) {
            RacionalanBroj racionalanDrugi = (RacionalanBroj) drugi;
            double realniDeoRezultata = this.realniDeo + racionalanDrugi.odrediVrednost();
            double imaginarniDeoRezultata = this.imaginarniDeo;

            return new KompleksanBroj(realniDeoRezultata, imaginarniDeoRezultata);
        } else if (drugi instanceof KompleksanBroj) {
            KompleksanBroj kompleksanDrugi = (KompleksanBroj) drugi;
            double realniDeoRezultata = this.realniDeo + kompleksanDrugi.realniDeo;
            double imaginarniDeoRezultata = this.imaginarniDeo + kompleksanDrugi.imaginarniDeo;

            return new KompleksanBroj(realniDeoRezultata, imaginarniDeoRezultata);
        } else {
            throw new IllegalArgumentException("Nije podržana operacija sabiranja sa datim tipom broja.");
        }
    }

    @Override
    public Broj podeli(int delilac) {
        return new KompleksanBroj(this.realniDeo / delilac, this.imaginarniDeo / delilac);
    }

    @Override
    protected double odrediVrednost() {
        // Modul kompleksnog broja
        return Math.sqrt(Math.pow(realniDeo, 2) + Math.pow(imaginarniDeo, 2));
    }

    public double imaginarniDeo() {
        return imaginarniDeo;
    }
	
}
