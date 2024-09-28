package mart2022;

public class Racun {
    private Artikal[] stavke;
    private int[] komadi;

    public Racun(int kapacitet) {
        stavke = new Artikal[kapacitet];
        komadi = new int[kapacitet];
    }

    public void dodajStavku(Artikal artikal, int komada) {
        for (int i = 0; i < stavke.length; i++) {
            if (stavke[i] == null || stavke[i].getSifra() == artikal.getSifra()) {
                if (stavke[i] == null) {
                    stavke[i] = artikal;
                }
                komadi[i] += komada;
                return;
            }
        }
    }

    public Integer ukloniStavku(Artikal artikal) {
        for (int i = 0; i < stavke.length; i++) {
            if (stavke[i] != null && stavke[i].getSifra() == artikal.getSifra()) {
                int otkucanoKomada = komadi[i];
                stavke[i] = null;
                komadi[i] = 0;
                return otkucanoKomada;
            }
        }
        return null;
    }

    public String stampajStavku(Artikal artikal, int otkucanoKomada) {
        double cenaPoKomadu = artikal.cenaPoKomadu();
        double ukupnaCena = otkucanoKomada * cenaPoKomadu;

        return String.format("%-20s %d x %.2f %.2f", artikal.getNaziv(), otkucanoKomada, cenaPoKomadu, ukupnaCena);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        double ukupnaSuma = 0.0;

        for (int i = 0; i < stavke.length; i++) {
            if (stavke[i] != null) {
                int otkucanoKomada = komadi[i];
                ukupnaSuma += otkucanoKomada * stavke[i].cenaPoKomadu();
                sb.append(stampajStavku(stavke[i], otkucanoKomada)).append("\n");
            }
        }

        sb.append("Ukupna suma: ").append(ukupnaSuma);
        return sb.toString();
    }
}

