package jul2022;

public class Mapa {
	private int brojTacaka;
    private Tacka[] nizTacaka;

    public Mapa(int brojTacaka) {
        this.brojTacaka = brojTacaka;
        this.nizTacaka = new Tacka[brojTacaka];
    }
    
    // metod koji postavlja k-tu tacku u mapi
    public void postaviTacku(int index, Tacka tacka) {
        nizTacaka[index] = tacka;
    }
    
    // metoda koja izracunava ukupno rastojanje izmedju prve i zadnje tacke u nizu
    public double izracunajUkupnoRastojanje() {
        double ukupnoRastojanje = 0;
        for (int i = 0; i < brojTacaka - 1; i++) {
            ukupnoRastojanje += nizTacaka[i].izracunajRastojanje(nizTacaka[i + 1]);
        }
        return ukupnoRastojanje;
    }
}
