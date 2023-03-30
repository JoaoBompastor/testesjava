package javateste;
import java.util.Scanner;


class Saco {
    public static void main(String[] args) {

        String memes = "sacoringa";
        System.out.println(memes);

    }
}

class pessoa {
    public static void main(String[] agrs) {
        
        // inicializa o scanner

        Scanner scan = new Scanner(System.in);

        // pega o input como string

        System.out.println("Digite seu nome: ");
        String Nome = scan.nextLine();

        // pega o input como inteiro

        System.out.println("Digite sua idade: ");
        int Idade = scan.nextInt();

        // printa os resultados

        System.out.println("Seu nome é: " + Nome);
        System.out.println("E sua idade é: " + Idade);

        // fecha o scanner

        scan.close();

    }
}
