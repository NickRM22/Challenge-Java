package Application;
//TUDO SALVO NO APP

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private List<Usuario> usuarios = new ArrayList<>();

    public void registerUser() {
        Scanner sc = new Scanner(System.in);
        Usuario newUser = new Usuario();
        System.out.println("NOME: ");
        newUser.setName(sc.nextLine());
        System.out.println("USUÁRIO: ");
        newUser.setUserName(sc.nextLine());
        System.out.println("SENHA: ");
        newUser.setPassword(sc.nextLine());
        System.out.println("CPF: ");
        newUser.setCpf(sc.nextLine());

        usuarios.add(newUser);
    }

    public void simularUso() {

    }

    public void calcularRecompensa() {

    }
}



