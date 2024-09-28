package izuceci_5zad;

import java.util.Arrays;

public class Polinom {
    private Monom[] monomi;
    private int dimenzija;

    public Polinom(int dimenzija) {
        if (dimenzija < 1 || dimenzija > 100) {
            // Ako dimenzija nije u validnom opsegu, postavi je na 50
            this.dimenzija = 50;
        } else {
            this.dimenzija = dimenzija;
        }

        // Inicijalizacija niza monoma
        this.monomi = new Monom[this.dimenzija];
    }

    public void kreirajMonom(double koeficijent, int stepen) {
        for (int i = 0; i < dimenzija; i++) {
            if (monomi[i] == null) {
                // Ako je trenutna pozicija prazna, postavi novi monom
                monomi[i] = new Monom(koeficijent, stepen);
                return;
            } else if (monomi[i].getStepen() == stepen) {
                // Ako postoji monom istog stepena, dodaj mu koeficijent
                monomi[i].dodajKoeficijent(koeficijent);
                return;
            }
        }

        // Ako nema slobodnog mesta, baci izuzetak
        throw new IllegalArgumentException("Nema dovoljno mesta za novi monom.");
    }

    public double izracunajVrednost(double x, double y) {
        double rezultat = 0;

        for (Monom monom : monomi) {
            if (monom != null) {
                rezultat += monom.getKoeficijent() * Math.pow(x, monom.getStepen());
            }
        }
        
        if(rezultat == 0) {
        	throw new ArithmeticException("Deljenje nulom nije dozvoljeno.");
        }
        
        return y / rezultat;
    }

    public void stampajPolinom() {
        for (Monom monom : monomi) {
            if (monom != null) {
                System.out.print(monom + " ");
            }
        }
        System.out.println();
    }

    public void sortirajPolinom() {
        Arrays.sort(monomi, (a, b) -> {
            if (a == null && b == null) {
                return 0;
            } else if (a == null) {
                return 1;
            } else if (b == null) {
                return -1;
            } else {
                return Integer.compare(b.getStepen(), a.getStepen());
            }
        });
    }
}
