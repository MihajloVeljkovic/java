package interfejs_4zad;

public class Main {
	
	public static void main(String[] args) {
		// Testiranje KPolinom
        double[] koeficijentiK = {1, -3, 2}; // Primer koeficijenata: x^2 - 3x + 2
        KPolinom kPolinom = new KPolinom(2, koeficijentiK);

        double vrednostK = kPolinom.izracunajVrednost(2);
        System.out.println("Vrednost KPolinoma u tački x=2: " + vrednostK);

        double nulaK = kPolinom.nadjiNulu(1, 3);
        System.out.println("Nula KPolinoma u intervalu [1, 3]: " + nulaK);

        // Testiranje NPolinom
        double[] nuleN = {1, 2}; // Primer nula: (x - 1)(x - 2) = x^2 - 3x + 2
        NPolinom nPolinom = new NPolinom(2, nuleN);

        double vrednostN = nPolinom.izracunajVrednost(2);
        System.out.println("Vrednost NPolinoma u tački x=2: " + vrednostN);

        double nulaN = nPolinom.nadjiNulu(1, 3);
        System.out.println("Nula NPolinoma u intervalu [1, 3]: " + nulaN);      
	}
}