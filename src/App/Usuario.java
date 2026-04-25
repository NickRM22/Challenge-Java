package App;

public class Usuario extends App {
    private String name;
    private int cpf;
    protected int points;
    private String userName;
    private String password;
    protected int ticketObtained;

    public Usuario(String name, int cpf, int points, String userName, String password, int ticketObtained) {
        this.name = name;
        this.cpf = cpf;
        this.points = points;
        this.userName = userName;
        this.password = password;
        this.ticketObtained = ticketObtained;
        super.getNumConversions();
        super.getTickets();
        super.getViewMinutes();
    }

    public Usuario() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() >= 4 && password.length() <= 8) {
            this.password = password;
            System.out.println("Senha criada com sucesso!");
        } else {
            System.out.println("Senha deve ter entre 4 e 8 caracteres");
            this.password = password;
        }
    }

    public int getTicketObtained() {
        return ticketObtained;
    }

    public void setTicketObtained(int ticketObtainesd) {
        this.ticketObtained = ticketObtainesd;
    }
}

