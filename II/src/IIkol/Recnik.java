package IIkol;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Recnik {
    private String imeDatoteke;

    public Recnik(String imeDatoteke) {
        this.imeDatoteke = imeDatoteke;
    }

    public int pronadjiRec(String rec) {
        try (BufferedReader reader = new BufferedReader(new FileReader(imeDatoteke))) {
            String linija;
            int brojLinije = 0;
            while ((linija = reader.readLine()) != null) {
                brojLinije++;
                if (linija.contains(rec)) {
                    return brojLinije;
                }
            }
            return 0; // Reč nije pronađena
        } catch (IOException e) {
            return -1; // Greška pri čitanju datoteke
        }
    }

    public String citajRec(int brojLinije) {
        try (BufferedReader reader = new BufferedReader(new FileReader(imeDatoteke))) {
            String linija;
            int trenutnaLinija = 0;
            while ((linija = reader.readLine()) != null) {
                trenutnaLinija++;
                if (trenutnaLinija == brojLinije) {
                    return linija.trim(); // Pročitana reč
                }
            }
            return null; // Greška pri čitanju
        } catch (IOException e) {
            return null; // Greška pri čitanju datoteke
        }
    }
}

