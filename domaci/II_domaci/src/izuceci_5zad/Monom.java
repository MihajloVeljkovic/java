package izuceci_5zad;

public class Monom {
    private double koeficijent;
    private int stepen;
    
    public Monom(double koeficijent, int stepen) {
        if (stepen > 100) {
            stepen = 100; // Obrada prekoračenja stepena
        }

        this.koeficijent = koeficijent;
        this.stepen = stepen;
    }

    public double getKoeficijent() {
        return koeficijent;
    }

    public int getStepen() {
        return stepen;
    }

    public void dodajKoeficijent(double koeficijent) {
        this.koeficijent += koeficijent;
    }

    @Override
    public String toString() {
        return koeficijent + "x^" + stepen;
    }
    
    // Metoda za izračunavanje vrednosti monoma za zadatu vrednost x
    public double izracunajVrednost(double x) {
        return koeficijent * Math.pow(x, stepen);
    }

    // Metoda za poređenje monoma istog stepena
    public void uporediMonome(Monom drugiMonom) {
        if (this.stepen != drugiMonom.stepen) {
            // Ako monomi nisu istog stepena, baciti izuzetak
            throw new IllegalArgumentException("Monomi nisu istog stepena.");
        }

        // Poredi koeficijente
        if (this.koeficijent > drugiMonom.koeficijent) {
            System.out.println("Prvi monom je veći.");
        } else if (this.koeficijent < drugiMonom.koeficijent) {
            System.out.println("Drugi monom je veći.");
        } else {
            System.out.println("Monomi su jednaki.");
        }
    }

    // Metoda za prikaz monoma
    public void prikaziMonom() {
        System.out.println(koeficijent + "x^" + stepen);
    }
}
