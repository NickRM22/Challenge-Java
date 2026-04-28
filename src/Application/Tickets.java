package Application;

public class Tickets extends Points {
    private int tickets;

    public Tickets(int viewMinutes, int numConversions, int points, int tickets) {
        super(viewMinutes, numConversions, points);
        this.tickets = tickets;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public int conversionPointsToTickets() {
        if (super.getPoints() >= 10) {
            tickets += getPoints() / 10;
            super.setPoints(super.getPoints() % 10);
        }
        return tickets;
    }
}
