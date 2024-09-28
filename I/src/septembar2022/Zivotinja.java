package septembar2022;

public abstract class Zivotinja {
	// staticke komnstante za nacine kretanja
		public static final int HODA	= 0b0001;	// binarna reprezentacija
		public static final int SKACE	= 0b0010;	// binarna reprezentacija
		public static final int PLIVA	= 0b0100;	// binarna reprezentacija
		public static final int GNJURI	= 0b1000;	// binarna reprezentacija
		
		public String vrsta; // instanca klase
		
		// konstruktor
		public Zivotinja(String vrsta) {
			this.vrsta = vrsta;
		}
		
		// metod toString
		@Override
		public String toString() {
			return "Zivotinja [vrsta=" + vrsta + "]";
		}

		// apstraktna metoda
		public abstract void oglasavanje();
		public abstract void kretanje();
		
		// nacini kretanja
		public static void ispisiKretanje(int nacinKretanja) {
			if(nacinKretanja == HODA) {
				System.out.println("HODA");
			} else if(nacinKretanja == SKACE) {
				System.out.println("SKACE");
			} else if(nacinKretanja == PLIVA) {
				System.out.println("PLIVA");
			} else {
				System.out.println("GNJURI");
			}
		}
}
