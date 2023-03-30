import java.util.Scanner;

class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String Nome = scan.nextLine();

        System.out.println(Nome);

        scan.close();
    }
}
