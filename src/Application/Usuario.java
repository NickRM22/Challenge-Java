package Application;

//TUDO QUE O USUARIO TEM QUE REGISTRAR

import java.util.Scanner;

public class Usuario extends App {
    private String name, userName, password, cpf;

    Scanner sc = new Scanner(System.in);

    public Usuario(int viewMinutes, int numConversions, String name, String userName, String password, String cpf) {
        super(viewMinutes, numConversions);
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        if (cpf.length() == 11) {
            System.out.println("CPF cadastrado com sucesso");
        } else {
            System.out.println("ERRO, cadastre um CPF válido. (Onze dígitos sem pontuação)");
        }
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

}

