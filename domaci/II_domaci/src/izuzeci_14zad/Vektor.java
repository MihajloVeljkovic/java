package izuzeci_14zad;

public class Vektor {
	private int brojElemenata;
    private int[] elementi;

    public Vektor(int brojElemenata) {
        if (brojElemenata <= 0) {
            throw new IllegalArgumentException("Broj elemenata mora biti veći od 0.");
        }
        this.brojElemenata = brojElemenata;
        this.elementi = new int[brojElemenata];
    }

    public void postaviVrednost(int k, int vrednost) {
        if (k < 0 || k >= brojElemenata) {
            throw new IndexOutOfBoundsException("Indeks van opsega.");
        }
        this.elementi[k] = vrednost;
    }

    public int srednjiElement() {
        if (brojElemenata % 2 == 0) {
            throw new ArithmeticException("Vektor mora imati neparan broj elemenata za određivanje srednjeg elementa.");
        }
        int srednjiIndeks = brojElemenata / 2;
        return elementi[srednjiIndeks];
    }
}
