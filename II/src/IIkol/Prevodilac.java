package IIkol;

public class Prevodilac {
    private String izvorniJezik;
    private String odredisniJezik;

    public Prevodilac(String izvorniJezik, String odredisniJezik) {
        this.izvorniJezik = izvorniJezik;
        this.odredisniJezik = odredisniJezik;
    }

    public void prevediRec(String rec) {
        Recnik izvorniRecnik = new Recnik(izvorniJezik + ".txt");
        Recnik odredisniRecnik = new Recnik(odredisniJezik + ".txt");

        int brojLinije = izvorniRecnik.pronadjiRec(rec);

        if (brojLinije > 0) {
            String prevod = odredisniRecnik.citajRec(brojLinije);
            if (prevod != null) {
                System.out.println("Prevedena reč: " + prevod);
            } else {
                System.out.println("Greška pri čitanju rečnika za odredišni jezik.");
            }
        } else if (brojLinije == 0) {
            System.out.println("Reč ne postoji u rečniku.");
        } else {
            System.out.println("Greška pri čitanju rečnika za izvorni jezik.");
        }
    }
}

