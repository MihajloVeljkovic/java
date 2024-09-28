package mart2022;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		List dobitnaKombinacija = Listic.izvlacenje(7, 49); // Na primer, izvlačimo 7 brojeva iz 49
        Loto.setDobitnaKombinacija(dobitnaKombinacija);

        List lotoListic = new ArrayList();
        lotoListic.add(2);
        lotoListic.add(7);
        lotoListic.add(14);
        lotoListic.add(22);
        lotoListic.add(30);
        lotoListic.add(37);
        lotoListic.add(46);

        Loto loto = new Loto(1000, lotoListic);
        System.out.println("Dobitna kombinacija: " + dobitnaKombinacija);
        System.out.println("Vaš listić: " + loto.getLotoListic());
        System.out.println(loto.proveriDobitak());
        
	}
}