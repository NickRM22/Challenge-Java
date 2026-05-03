package Application;

//TUDO QUE O USUARIO TEM QUE REGISTRAR

public class Usuario {
    private String name, userName, password, cpf;
    private int viewMinutes;
    private Tickets tickets;
    private Points points;

    public Usuario(String name, String userName, String password, String cpf) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.cpf = cpf;
    }

    public Usuario() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getViewMinutes() {
        return viewMinutes;
    }

    public void setViewMinutes(int viewMinutes) {
        this.viewMinutes = viewMinutes;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
