package jun2022;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// Kreiranje objekta tipa Bus
        Bus bus = new Bus("Tours", "Ljubljana", "Beograd", 12, 3);
        bus.reserveSeat();
        System.out.println(bus.toString());

        // Kreiranje objekta tipa Airplane
        Airplane airplane = new Airplane("Tours", "Bahami", "Beograd", 1, 5);
        airplane.reserveSeat();
        System.out.println(airplane.toString());

        // Ispisivanje cena na ekran
        System.out.println("Cena autobuske karte: " + bus.calculateThePrice());
        System.out.println("Cena avionske karte: " + airplane.calculateThePrice());

        // Upisivanje karata u tekstualne fajlove
        writeToFile("autobus_karta.txt", bus.toString());
        writeToFile("avion_karta.txt", airplane.toString());
	}
	
	private static void writeToFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("Karta je uspešno upisana u fajl: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
