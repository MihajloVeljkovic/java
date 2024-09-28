package januar2022;

public class Kupa extends Krug implements GeometrijskoTelo {
	private double visinaKupe;

	// Konstruktor za inicijalizaciju poluprecnika i visine
    public Kupa(double poluprecnik, double visinaKupe) {
        super(poluprecnik);
        this.visinaKupe = visinaKupe;
    }

    @Override
	public double izracunajPovrsinu() {
		return (super.izracunajPovrsinu() + Math.PI * getPoluprecnik() * Math.sqrt(getPoluprecnik() + visinaKupe));
	}
    
	@Override
	public double izracunajZapreminu() {
		return (super.izracunajPovrsinu() * visinaKupe) / 3;
	}
}
