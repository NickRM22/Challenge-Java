package Application;

public class Tickets {
    private int tickets;
    Points points = new Points();

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    private int simularUso() {
        if (points.getPoints() >= 10) {
            tickets += points.getPoints() / 10;
            points.setPoints(points.getPoints() % 10);
        }
        return tickets;
    }
}
