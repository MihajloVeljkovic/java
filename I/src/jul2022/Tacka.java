package jul2022;

public class Tacka {
	private int x, y;
	private String naziv;
	
	// konstruktor koji postavlja koordinate i naziv
	public Tacka(int x, int y, String naziv) {
		this.x = x;
		this.y = y;
		this.naziv = naziv;
	}
	
	// funkcija za izracunavanje rastojanja od zadate tacke
	public double izracunajRastojanje(Tacka drugaTacka) {
		return Math.sqrt(Math.pow(drugaTacka.x - this.x, 2) + Math.pow(drugaTacka.y - this.y, 2));
	}
}
