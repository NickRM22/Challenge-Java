package Application;

//TUDO SALVO NO APP

public class App {
    private int numConversions, viewMinutes;


    public App(int viewMinutes, int numConversions) {
        this.viewMinutes = viewMinutes;
        this.numConversions = numConversions;

    }

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


}



