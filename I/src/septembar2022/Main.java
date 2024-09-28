package septembar2022;

public class Main {

	public static void main(String[] args) {
		// kreiranje objekata
		Pas pas = new Pas("Billy");
		Riba riba = new Riba("Saran");
		Pingvin pingvin = new Pingvin("Pingy");
				
		// metode za oglasavanje
		pas.oglasavanje();
		riba.oglasavanje();
		pingvin.oglasavanje();
				
		// metode za kretanje
		pas.kretanje();
		riba.kretanje();
		pingvin.kretanje();
				
		// kreiranje objekata
		System.out.println(pas);
		System.out.println(riba);
		System.out.println(pingvin);
	}
}
