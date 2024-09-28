package I_domaci;
import java.util.Scanner;

public class zadatak36 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Unesite broj n: ");
		int n = scan.nextInt();
		
		scan.close();
		
        double suma = 0;	//	pocetna vrednost za sumu
        double faktorijel = 1;	//	pocetna vrednost za faktorijel

        for (int i = 1; i <= n; i++) {
            faktorijel *= i;
            suma += 1 / faktorijel;
        }

        System.out.println("Suma je: " + suma);
	}
}
