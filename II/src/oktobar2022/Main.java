package oktobar2022;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Valuta> ucitajKurseveIzFajla(String filePath) {
        List<Valuta> valute = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                String nazivValute = String.join(" ", parts[0], parts[1]);
                double kursValute = Double.parseDouble(parts[2].replace(',', '.'));
                Valuta valuta = new Valuta(nazivValute, kursValute);
                valute.add(valuta);
            }
        } catch (IOException e) {
            System.out.println("Greška prilikom čitanja fajla: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Neispravan format podataka u fajlu: " + e.getMessage());
        }
        return valute;
    }

    public static void main(String[] args) {
        List<Valuta> valute = ucitajKurseveIzFajla("kurs.txt");

        for (Valuta valuta : valute) {
            System.out.println(valuta.getNaziv() + ": " + valuta.getKurs());
        }

        try {
            System.out.print("Unesite broj jedinica koje se razmenjuju: ");
            double brojJedinica = Double.parseDouble(System.console().readLine());

            for (Valuta valuta : valute) {
                double vrednostRazmene = valuta.racunajRazmenu(brojJedinica);
                System.out.println("Vrednost razmene u " + valuta.getNaziv() + ": " + vrednostRazmene);
            }

            System.out.print("Unesite novi kurs za američki dolar: ");
            double noviKurs = Double.parseDouble(System.console().readLine());
            valute.get(1).promeniKurs(noviKurs);

            try (FileWriter writer = new FileWriter("razmena.dat")) {
                for (Valuta valuta : valute) {
                    writer.write(valuta.getNaziv() + " " + valuta.racunajRazmenu(brojJedinica) + "\n");
                }
            } catch (IOException e) {
                System.out.println("Greška prilikom pisanja u fajl: " + e.getMessage());
            }

            System.out.println("Ukupan broj kreiranih valuta: " + Valuta.brojKreiranihValuta());

        } catch (NumberFormatException e) {
            System.out.println("Niste uneli ispravan broj.");
        }
    }
}
