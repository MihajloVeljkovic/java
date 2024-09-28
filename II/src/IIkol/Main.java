package IIkol;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite reč za prevođenje: ");
        String rec = scanner.nextLine();

        System.out.print("Unesite izvorni jezik: ");
        String izvorniJezik = scanner.nextLine();

        System.out.print("Unesite odredišni jezik: ");
        String odredisniJezik = scanner.nextLine();

        Prevodilac prevodilac = new Prevodilac(izvorniJezik, odredisniJezik);
        prevodilac.prevediRec(rec);

        scanner.close();
    }
}

