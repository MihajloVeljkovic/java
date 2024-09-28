package interfejs_4zad;

public class NPolinom implements Polinom {
	 private int stepen;
	 private double[] nule;
	
	 public NPolinom(int stepen, double[] nule) {
	     this.stepen = stepen;
	     this.nule = nule;
	 }
	
	 @Override
	 public double izracunajVrednost(double x) {
	     double rezultat = 1.0;
	     for (int i = 0; i < stepen; i++) {
	         rezultat *= (x - nule[i]);
	     }
	     return rezultat;
	 }
	
	 @Override
	 public double nadjiNulu(double a, double b) {
	     // Implementacija nije potrebna jer su nule već poznate
	     return nule[0];
	 }
}
