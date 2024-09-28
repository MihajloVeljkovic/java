package februar2022;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Broj[] nizBrojeva = new Broj[10];

        for (int i = 0; i < nizBrojeva.length; i++) {
            if (i % 2 == 0) {
                // Na parnim pozicijama postavi racionalan broj
                int brojnik = (int) (Math.random() * 100);
                int nazivnik = (int) (Math.random() * 100) + 1; // Nazivnik ne sme biti 0
                nizBrojeva[i] = new RacionalanBroj(brojnik, nazivnik);
            } else {
                // Na neparnim pozicijama postavi kompleksan broj
                double realniDeo = Math.random() * 100;
                double imaginarniDeo = Math.random() * 100;
                nizBrojeva[i] = new KompleksanBroj(realniDeo, imaginarniDeo);
            }
        }

        // Sortiraj niz po vrednosti brojeva
        Arrays.sort(nizBrojeva, (broj1, broj2) -> {
            if (broj1.većiOd(broj2)) {
                return 1;
            } else if (broj2.većiOd(broj1)) {
                return -1;
            }
            return 0;
        });

        // Ispisi uredjeni niz
        System.out.println("Uredjeni niz brojeva:");
        for (Broj broj : nizBrojeva) {
            broj.prikaziNaStdIzlaz();
        }

        // Racunaj aritmeticku sredinu
        double suma = 0;
        for (Broj broj : nizBrojeva) {
            suma += broj.odrediVrednost();
        }
        double aritmetickaSredina = suma / nizBrojeva.length;

        // Ispisi aritmeticku sredinu
        System.out.println("\nAritmeticka sredina: " + aritmetickaSredina);
    }
}
