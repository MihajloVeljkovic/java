package januar2022;

public class Main {

	public static void main(String[] args) {
		
		// Kreiranje objekta tipa KPolinom
        KPolinom kPolinom = new KPolinom(11);
        kPolinom.postaviKoeficijent(11, 3);
        kPolinom.postaviKoeficijent(7, 2);
        kPolinom.postaviKoeficijent(5, 5);

        // Kreiranje objekta tipa MPolinom
        MPolinom mPolinom = new MPolinom(3);
        mPolinom.dodajMonom(3, 11);
        mPolinom.dodajMonom(2, 7);
        mPolinom.dodajMonom(5, 5);

        // Racunanje vrednosti prvog izvoda u tacki x=2
        double xVrednost = 2;
        double prviIzvodKPolinoma = kPolinom.izracunajPrviIzvod().izracunajVrednost(xVrednost);
        double prviIzvodMPolinoma = mPolinom.izracunajPrviIzvod().izracunajVrednost(xVrednost);

        // Ispis rezultata
        System.out.println("Vrednost prvog izvoda KPolinoma u tacki x=" + xVrednost + ": " + prviIzvodKPolinoma);
        System.out.println("Vrednost prvog izvoda MPolinoma u tacki x=" + xVrednost + ": " + prviIzvodMPolinoma);
        
	}
	
}
