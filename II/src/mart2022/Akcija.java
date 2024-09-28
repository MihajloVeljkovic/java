package mart2022;

public class Akcija {
    private int popust;
    private double cenaPoKomadu;

    public Akcija(int popust, double cenaPoKomadu) {
        this.popust = popust;
        this.cenaPoKomadu = cenaPoKomadu;
    }

    public int getPopust() {
        return popust;
    }

    public double getCenaPoKomadu() {
        return cenaPoKomadu;
    }
}
