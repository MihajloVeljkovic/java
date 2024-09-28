package I_domaci;
import java.util.Scanner;

public class zadatak18 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Unesite broj X:");
		int X = scan.nextInt();
		
		scan.close();
		
		for (int i = 100; i < 1000; i++) {
            int sumaCifara = 0;
            int broj = i;

            // Izdvajanje cifara i računanje sume cifara broja i
            while (broj != 0) {
                sumaCifara += broj % 10;
                broj /= 10;
            }

            // Provera da li je suma cifara jednaka unetom broju X
            if (sumaCifara == X) {
                System.out.println(i);
            }
        }
	}
}
