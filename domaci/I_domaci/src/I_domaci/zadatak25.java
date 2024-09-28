package I_domaci;
import java.util.Scanner;

public class zadatak25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Unesite broj K:");
		int k = scan.nextInt();
		
		scan.close();
		
		int brojac = 0;
		int i = 999;	// Pocinjemo od najveceg trocifrenog broja
		
		System.out.println("Najveci trocifreni brojevi deljivi sa " + k + " su:");
		
		while (brojac < 10 && i >= 100) {
			if (i % k == 0) {
                System.out.println(i);
                brojac ++;
            }
			i--;
		}
		
		if (brojac < 10) {
			System.out.println("Nema 10 brojeva deljivih sa " + k);
		} 
	}	
}
