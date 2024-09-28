package septembar2022;

public class Pas extends Zivotinja {
	private String imePsa;

	public Pas(String imePsa) {
		super("Pas");
		this.imePsa = imePsa;
	}

	@Override
	public String toString() {
		return "Pas: [ime=" + imePsa + "]";
	}

	@Override
	public void oglasavanje() {
		System.out.println(imePsa + " laje.");
	}

	@Override
	public void kretanje() {
		System.out.println(imePsa + " hoda i skace.");
	}
}
