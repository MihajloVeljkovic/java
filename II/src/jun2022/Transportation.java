package jun2022;

public abstract class Transportation {
	String companyName;
    String destination;
    String from;

    public Transportation(String companyName, String destination, String from) {
        this.companyName = companyName;
        this.destination = destination;
        this.from = from;
    }

    public abstract String toString();
}
