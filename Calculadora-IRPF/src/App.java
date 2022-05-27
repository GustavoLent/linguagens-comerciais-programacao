import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Cadastro de usuário");

        User zeh = new User();
        User rambo = new User();
        Scanner scan = new Scanner(System.in);

        System.out.println(zeh);
        System.out.println(rambo);

        zeh.preencher(scan);
        rambo.preencher(scan);

        System.out.println(zeh);
        System.out.println(rambo);
    }
}
