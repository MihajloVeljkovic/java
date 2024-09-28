package septembar2022;

public class Pingvin extends Zivotinja {
	private String imePingvina;

	public Pingvin(String imePingvina) {
		super("Pingvin");
		this.imePingvina = imePingvina;
	}

	@Override
	public String toString() {
		return "Pingvin: [ime=" + imePingvina + "]";
	}

	@Override
	public void oglasavanje() {
		System.out.println(imePingvina + " se oglasava.");
	}

	@Override
	public void kretanje() {
		System.out.println(imePingvina + " hoda, pliva i gnjuri.");
	}
}
