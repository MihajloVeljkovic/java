package oktobar2022;

public class Student extends Osoba {
    String imeFakulteta;
    String smer;
    int godinaUpisa;
    int trenutnaGodina;

    public Student(String ime, String datumRodjenja, String adresa, String imeFakulteta, String smer, int godinaUpisa, int trenutnaGodina) {
        super(ime, datumRodjenja, adresa);
        this.imeFakulteta = imeFakulteta;
        this.smer = smer;
        this.godinaUpisa = godinaUpisa;
        this.trenutnaGodina = trenutnaGodina;
    }

    @Override
    public void markica() {
        System.out.println("Zelena markica");
    }

    public double prosek() {
        return trenutnaGodina - godinaUpisa + 1;
    }
}