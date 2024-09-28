package februar2022;

public abstract class Broj {
	public abstract boolean veciOd(Broj other);
	public abstract void prikazi();
	public abstract Broj saberi(Broj other);
	public abstract Broj podeli(int divisor);
	protected abstract double odrediVrednost();
}
