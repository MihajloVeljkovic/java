package izuceci_5zad;

public class Main {

	public static void main(String[] args) {
		
        try {
            // Primeri kreiranja monoma i pozivanje metoda
        	System.out.println("Monomi za poredjenje:");
            Monom monom1 = new Monom(3, 4);
            Monom monom2 = new Monom(2, 4);

            monom1.prikaziMonom();
            monom2.prikaziMonom();

            monom1.uporediMonome(monom2);
            
            double vrednost = monom1.izracunajVrednost(2);
            System.out.println("Vrednost monoma za x=2: " + vrednost);
        } catch (IllegalArgumentException e) {
            System.out.println("Doslo je do greske: " + e.getMessage());
        }
        
        Polinom polinom = new Polinom(10);

        polinom.kreirajMonom(6, 2);
        polinom.kreirajMonom(-2, 3);
        polinom.kreirajMonom(7.4, 0);
        polinom.kreirajMonom(-2.5, 6);

        System.out.println("\nPolinom pre sortiranja:");
        polinom.stampajPolinom();

        polinom.sortirajPolinom();

        System.out.println("Polinom posle sortiranja:");
        polinom.stampajPolinom();

        double xVrednost = 2;
        double yVrednost = 10;
        double rezultat = polinom.izracunajVrednost(xVrednost, yVrednost);
        System.out.println("Vrednost polinoma za x = " + xVrednost + ": " + rezultat);  
    } 
}
