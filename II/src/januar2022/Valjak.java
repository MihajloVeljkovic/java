package januar2022;

public class Valjak extends Krug implements GeometrijskoTelo {
	private double visinaValjka;

	public Valjak(double poluprecnik, double visinaValjka) {
		super(poluprecnik);
		this.visinaValjka = visinaValjka;
	}
	
	// Implementacija funkcija iz interfejsa
    @Override
    public double izracunajPovrsinu() {
        return 2 * super.izracunajPovrsinu() + super.izracunajObim()*visinaValjka;
    }
    
	@Override
	public double izracunajZapreminu() {	
		return super.izracunajPovrsinu() * visinaValjka;
	}
}
