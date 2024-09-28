package januar2022;

public class MPolinom implements Polinom {
    private int brojNenultihKoeficijenata;
    private double[] koeficijenti;
    private int[] stepeni;
    
    // konstruktor koji inicijalizuje broj nenulih monoma
    public MPolinom(int brojNenultihKoeficijenata) {
        this.brojNenultihKoeficijenata = brojNenultihKoeficijenata;
        this.koeficijenti = new double[brojNenultihKoeficijenata];
        this.stepeni = new int[brojNenultihKoeficijenata];
    }
    
    // metod koji kreira monom sa zadatim koeficijentom i stepenom na odredjenoj poziciji u nizu
    public void dodajMonom(double koeficijent, int stepen) {
        for (int i = 0; i < brojNenultihKoeficijenata; i++) {
            if (stepeni[i] == stepen) {
                koeficijenti[i] += koeficijent;
                return;
            }
        }
        // Ako monom sa datim stepenom ne postoji, dodajemo novi monom
        for (int i = 0; i < brojNenultihKoeficijenata; i++) {
            if (stepen < stepeni[i]) {
                for (int j = brojNenultihKoeficijenata - 1; j > i; j--) {
                    koeficijenti[j] = koeficijenti[j - 1];
                    stepeni[j] = stepeni[j - 1];
                }
                koeficijenti[i] = koeficijent;
                stepeni[i] = stepen;
                return;
            }
        }
        koeficijenti[brojNenultihKoeficijenata - 1] = koeficijent;
        stepeni[brojNenultihKoeficijenata - 1] = stepen;
    }

    @Override
    public double izracunajVrednost(double x) {
        double rezultat = 0;
        for (int i = 0; i < brojNenultihKoeficijenata; i++) {
            rezultat += koeficijenti[i] * Math.pow(x, stepeni[i]);
        }
        return rezultat;
    }

    @Override
    public Polinom izracunajPrviIzvod() {
        MPolinom prviIzvod = new MPolinom(brojNenultihKoeficijenata);
        for (int i = 0; i < brojNenultihKoeficijenata; i++) {
            if (stepeni[i] > 0) {
                prviIzvod.dodajMonom(koeficijenti[i] * stepeni[i], stepeni[i] - 1);
            }
        }
        return prviIzvod;
    }
}
