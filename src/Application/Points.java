package Application;

public class Points {
    private int points;
    Usuario usuario = new Usuario();

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int conversionViewsForPoints() {
        if (usuario.getViewMinutes() >= 180) {
            points += usuario.getViewMinutes() / 180;
            usuario.setViewMinutes(usuario.getViewMinutes() % 180);
        }
        return points;
    }
}
