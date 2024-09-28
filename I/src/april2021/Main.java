package april2021;

public class Main {

	public static void main(String[] args) {
		// objekat klase MatricniDisplej
		MatricniDisplej md = new MatricniDisplej(0);
		
		// resetujemo vrednost
		md.reset();
		
		// 5 puta inkrementiramo sadrzaj
		for(int i = 0; i <= 4; i++) {
			System.out.println("inkrement " + i);
			md.increment();
			md.show();
			System.out.println("");
		}			
	}
}
