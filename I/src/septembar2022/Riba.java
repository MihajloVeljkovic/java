package septembar2022;

public class Riba extends Zivotinja {
	private String vrstaRibe;

	public Riba(String vrstaRibe) {
		super("Riba");
		this.vrstaRibe = vrstaRibe;
	}

	@Override
	public String toString() {
		return "Riba: [ime=" + vrstaRibe + "]";
	}

	@Override
	public void oglasavanje() {
		System.out.println(vrstaRibe + " se ne oglasava.");
	}

	@Override
	public void kretanje() {
		System.out.println(vrstaRibe + " pliva i gnjuri");
	}
}
