package januar2022;

public class Krug {
    private double poluprecnik;

    // Konstruktor za inicijalizaciju poluprecnika
    public Krug(double poluprecnik) {
        this.poluprecnik = poluprecnik;
    }

    // Implementacija funkcija iz interfejsa
    public double izracunajPovrsinu() {
        return Math.PI * poluprecnik * poluprecnik;
    }
    
    public double izracunajObim() {
        return 2 * poluprecnik * Math.PI; 
    }

	public double getPoluprecnik() {
		return poluprecnik;
	}

	public void setPoluprecnik(double poluprecnik) {
		this.poluprecnik = poluprecnik;
	}
}
