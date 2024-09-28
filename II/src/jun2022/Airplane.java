package jun2022;

public class Airplane extends Transportation implements Reservation {
	private int seatsEconomy;
    private int seatsBusiness;

    public Airplane(String companyName, String destination, String from, int seatsEconomy, int seatsBusiness) {
        super(companyName, destination, from);
        this.seatsEconomy = seatsEconomy;
        this.seatsBusiness = seatsBusiness;
    }

    @Override
    public void reserveSeat() {
        if (seatsEconomy > 0) {
            seatsEconomy--;
            System.out.println("Ekonomsko sedište uspešno rezervisano u avionu.");
        } else if (seatsBusiness > 0) {
            seatsBusiness--;
            System.out.println("Nema ekonomskog mesta, poslovno mesto je rezervisano u avionu.");
        } else {
            System.out.println("Avion je pun.");
        }
    }

    @Override
    public double calculateThePrice() {
        if (seatsEconomy > 0) {
            return 2000.00;
        } else {
            return 10000.00;
        }
    }

    @Override
    public String toString() {
        return "Prevoz: Avion kompanije " + companyName + " ide iz " + from + " za " + destination +
                ", ima " + seatsEconomy + " ekonomska mesta i " + seatsBusiness + " poslovnih mesta. Cena je " + calculateThePrice() + ".";
    }
}
