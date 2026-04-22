public class Usuario {
    private String name;
    private int cpf;
    private int points;
    private String userName;
    private String password;

    public Usuario(String name, int cpf, int points, String userName, String password) {
        this.name = name;
        this.cpf = cpf;
        this.points = points;
        this.userName = userName;
        this.password = password;
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
        }
    }

}
