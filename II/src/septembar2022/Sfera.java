package septembar2022;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sfera {
    private static int brojSfera = 0; // Broj kreiranih sfera
    private double x, y, z; // Koordinate centra sfere
    private double poluprecnik; // Poluprečnik sfere
    
    // Podrazumevani konstruktor (kreira jediničnu sferu sa centrom u koordinatnom početku)
    public Sfera() {
        this(0, 0, 0, 1);
    }

    // Konstruktor sa tri argumenta (koordinate centra sfere, kreira jediničnu sferu sa centrom u tački čije su koordinate date kao argumenti konstruktora)
    public Sfera(double x, double y, double z) {
        this(x, y, z, 1);
    }

    // Konstruktor koji kreira sferu kada su poznati svi neophodni podaci
    public Sfera(double x, double y, double z, double poluprecnik) {
        this.x = x;
        this.y = y;
        this.z = z;
        postaviPoluprecnik(poluprecnik);
        brojSfera++;
    }

    // Metod za računanje zapremine sfere
    public double izracunajZapreminu() {
        return (4.0 / 3.0) * Math.PI * Math.pow(poluprecnik, 3);
    }

    // Metod za promenu poluprečnika sfere
    public void postaviPoluprecnik(double noviPoluprecnik) {
        if (noviPoluprecnik > 0) {
            poluprecnik = noviPoluprecnik;
        } else {
            throw new IllegalArgumentException("Poluprecnik mora biti pozitivan broj.");
        }
    }

    // Metod za dohvat broja kreiranih sfera
    public static int brojKreiranihSfera() {
        return brojSfera;
    }

    // Metod za ispisivanje informacija o sferi
    @Override
    public String toString() {
        return "Sfera sa centrom (" + x + ", " + y + ", " + z + ") i poluprecnikom " + poluprecnik;
    }

    // Metod za učitavanje podataka iz fajla
    public static Sfera ucitajIzFajla(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = reader.readLine();
        reader.close();

        // Parsiranje podataka iz linije
        String[] tokens = line.split(",");
        double x = Double.parseDouble(tokens[0]);
        double y = Double.parseDouble(tokens[1]);
        double z = Double.parseDouble(tokens[2]);
        double poluprecnik = Double.parseDouble(tokens[3]);

        return new Sfera(x, y, z, poluprecnik);
    }

    // Metod za ispisivanje površina u fajl
    public static void ispisiPovrsineUFajl(String filename, Sfera... sfere) throws IOException {
        FileWriter writer = new FileWriter(filename);

        for (Sfera sfera : sfere) {
            writer.write("Povrsina " + sfera + ": " + sfera.izracunajZapreminu() + "\n");
        }

        writer.close();
    }
}
