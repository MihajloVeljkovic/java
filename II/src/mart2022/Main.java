package mart2022;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Artikal[] artikli = ucitajArtikleIzFajla("artikli.txt");

        Racun racun = new Racun(10);
        racun.dodajStavku(artikli[0], 2);
        racun.dodajStavku(artikli[1], 1);

        System.out.println(racun);

        snimiRacunUFajl(racun, "racun.txt");
    }

    public static Artikal[] ucitajArtikleIzFajla(String filePath) {
        List<Artikal> artikli = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                int sifra = Integer.parseInt(parts[0]);
                String naziv = parts[1];
                double cena = Double.parseDouble(parts[2]);

                Akcija akcija = null;
                if (parts.length > 3) {
                    int popust = Integer.parseInt(parts[3]);
                    double cenaPoKomadu = Double.parseDouble(parts[4]);
                    akcija = new Akcija(popust, cenaPoKomadu);
                }

                Artikal artikal = new Artikal(sifra, naziv, cena, akcija);
                artikli.add(artikal);
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return artikli.toArray(new Artikal[0]);
    }

    public static void snimiRacunUFajl(Racun racun, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(racun.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
