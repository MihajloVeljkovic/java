package januar2022;

public class KPolinom implements Polinom {
    private int stepen;
    private double[] koeficijenti;
    
    // konstruktor koji inicijalizuje stepen polinoma
    public KPolinom(int stepen) {
        this.stepen = stepen;
        this.koeficijenti = new double[stepen + 1];
    }
    
    // metod koji postavlja koeficijent uz zadati stepen
    public void postaviKoeficijent(int stepen, double koeficijent) {
        this.koeficijenti[stepen] = koeficijent;
    }

    @Override
    public double izracunajVrednost(double x) {
        double rezultat = koeficijenti[stepen];
        for (int i = stepen - 1; i >= 0; i--) {
            rezultat = rezultat * x + koeficijenti[i];
        }
        return rezultat;
    }

    @Override
    public Polinom izracunajPrviIzvod() {
        KPolinom prviIzvod = new KPolinom(stepen - 1);
        for (int i = 0; i < stepen; i++) {
            prviIzvod.postaviKoeficijent(i, koeficijenti[i + 1] * (i + 1));
        }
        return prviIzvod;
    }
}
