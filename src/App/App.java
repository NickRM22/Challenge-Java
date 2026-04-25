package App;

public class App {
    private int numConversions;
    private int tickets;
    private int viewMinutes;
    Usuario usuario = new Usuario();

    public int getNumConversions() {
        return numConversions;
    }

    public void setNumConversions(int numConversions) {
        this.numConversions = numConversions;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public int getViewMinutes() {
        return viewMinutes;
    }

    public void setViewMinutes(int viewMinutes) {
        this.viewMinutes = viewMinutes;
    }

    public void conversionViews() {
        if (viewMinutes >= 180) {
            usuario.points += viewMinutes / 180;
            viewMinutes = viewMinutes % 180;
        }
    }

}



