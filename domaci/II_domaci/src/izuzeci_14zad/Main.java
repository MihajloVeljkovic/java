package izuzeci_14zad;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try {
            Scanner scan = new Scanner(System.in);
            
            System.out.print("Unesite broj elemenata vektora: ");
            int brojElemenata = scan.nextInt();

            Vektor vektor = new Vektor(brojElemenata);

            System.out.println("Unesite vrednosti elemenata vektora: ");
            for (int i = 0; i < brojElemenata; i++) {
                System.out.print("Element[" + i + "]: ");
                int vrednost = scan.nextInt();
                vektor.postaviVrednost(i, vrednost);
            }

            double srednjiElement = vektor.srednjiElement();
            System.out.println("Srednji element vektora: " + srednjiElement);
            
            scan.close();
            
        } catch (IllegalArgumentException | IndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Greška: " + e.getMessage());
        }	
    }
}
