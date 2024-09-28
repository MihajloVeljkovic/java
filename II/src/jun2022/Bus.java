package jun2022;

public class Bus extends Transportation implements Reservation {
	private int numberOfSeats;
    private int seatClass;

    public Bus(String companyName, String destination, String from, int numberOfSeats, int seatClass) {
        super(companyName, destination, from);
        this.numberOfSeats = numberOfSeats;
        this.seatClass = seatClass;
    }

    @Override
    public void reserveSeat() {
        if (numberOfSeats > 0) {
            numberOfSeats--;
            System.out.println("Sedište uspešno rezervisano u autobusu.");
        } else {
            System.out.println("Autobus je pun.");
        }
    }

    @Override
    public double calculateThePrice() {
        return seatClass * 1000.00;
    }

    @Override
    public String toString() {
        return "Prevoz: Autobus kompanije " + companyName + " vozi od " + from + " do " + destination + 
        		", ima " + numberOfSeats + " sedišta klase " + seatClass + ". Cena je " + calculateThePrice() + ".";
    }
}
