package day04;

public class Passanger {
    private String name;
    private String ticketID;
    private int numOfPackages;

    public Passanger(String name, String ticketID, int numOfPackages) {
        this.name = name;
        this.ticketID = ticketID;
        this.numOfPackages = numOfPackages;
    }

    public String getName() {
        return name;
    }

    public String getTicketID() {
        return ticketID;
    }

    public int getNumOfPackages() {
        return numOfPackages;
    }
}
