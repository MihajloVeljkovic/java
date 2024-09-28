package jun2022;

public class Glavna {

	public static void main(String[] args) {
		KancelarijskiRadnik kr = new KancelarijskiRadnik("Mihajlo", "Veljkovic", 40000); //kreiranje objekta kr
		Menadzer m = new Menadzer("Dragisa", "Veljkovic", 40000); //kreiranje objekta m
		
		//prikazivanje objekata kr
		System.out.println("RADNIK:");
		System.out.println("Ime:	 " 	+ kr.ime);
		System.out.println("Prezime: " 	+ kr.prezime);
		System.out.println("Plata:	 " 	+ kr.plata);
		System.out.println();
		
		//prikazivanje objekata m
		System.out.println("MENADZER:");
		System.out.println("Ime:	 " 	+ m.ime);
		System.out.println("Prezime: " 	+ m.prezime);
		System.out.println("Plata:	 " 	+ m.plata);
		System.out.println();
		
		kr.izracunajPlatu(8); // Radnik radi 8 sati
        m.izracunajPlatu(10); // Menadzer radi 10 sati
        
        //ispisujemo njihove plate
        System.out.println("Plata radnika:	 " + kr.getPlata());
        System.out.println("Plata menadzera: " + m.getPlata());
        System.out.println();

        // Provera da li su dva zaposlena jednaka po plati
        System.out.println("Da li su jednake plate? " + kr.equals(m));
	}
}
