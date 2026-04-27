package App;

//TUDO QUE O USUARIO TEM QUE REGISTRAR

public class Usuario extends App {
    private String name, userName, password;
    private int cpf;
    protected int ticketObtained;

    public Usuario(String name, String userName, String password, int cpf, int ticketObtained) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.cpf = cpf;
        this.ticketObtained = ticketObtained;
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

