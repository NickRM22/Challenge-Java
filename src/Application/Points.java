package Application;

public class Points extends App {
    private int points;

    public Points(int viewMinutes, int numConversions, int points) {
        super(viewMinutes, numConversions);
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void conversionViewsToPoints() {
        if (super.getViewMinutes() >= 180) {
            points += super.getViewMinutes() / 180;
            super.setViewMinutes(super.getViewMinutes() % 180);
        }
    }
}
