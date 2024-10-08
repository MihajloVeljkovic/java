package septembar2023;

public class KPolinom implements Polinom {
	 private int stepen;
	 private double[] koeficijenti;
	 
	 public KPolinom(int stepen, double[] koeficijenti) {
	     this.stepen = stepen;
	     this.koeficijenti = koeficijenti;
	 }
	
	 @Override
	 public double izracunajVrednost(double x) {
	     double rezultat = koeficijenti[0];
	     for (int i = 1; i <= stepen; i++) {
	         rezultat = rezultat * x + koeficijenti[i];
	     }
	     return rezultat;
	 }
	
	 @Override
	 public double nadjiNulu(double a, double b) {
		 double epsilon = 1e-9;
	     while (b - a > epsilon) {
	    	 double sredina = (a + b) / 2;
	         if (izracunajVrednost(sredina) == 0.0) {
	        	 return sredina;
	         } else if (izracunajVrednost(a) * izracunajVrednost(sredina) < 0) {
	        	 b = sredina;
	         } else {
	        	 a = sredina;
	         }
	     }
	     return (a + b) / 2;
	 }
}
