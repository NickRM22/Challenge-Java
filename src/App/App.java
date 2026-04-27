package App;

//TUDO SALVO NO APP

public class App {
    private int numConversions, viewMinutes, points;
    Usuario usuario = new Usuario();

    public int getNumConversions() {
        return numConversions;
    }

    public void setNumConversions(int numConversions) {
        this.numConversions = numConversions;
    }


    public int getViewMinutes() {
        return viewMinutes;
    }

    public void setViewMinutes(int viewMinutes) {
        this.viewMinutes = viewMinutes;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }



    public void conversionViewsToPoints() {
        if (viewMinutes >= 180) {
            points += viewMinutes / 180;
            viewMinutes = viewMinutes % 180;
        }
    }

    public int conversionPointsToTickets() {
        if (points >= 10) {
            usuario.tickets += points / 10;
            points = points % 10;
        }
        return usuario.tickets;
    }
}



