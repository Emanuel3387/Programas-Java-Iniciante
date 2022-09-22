import java.util.Scanner;

public class ifelseifelse {

    public static void main(String[] args) {

        System.out.println(" Ola seja bem vindo \n");
        Scanner entradaTeclado = new Scanner(System.in);

        int idade;

        System.out.println(" Digite sua idade.");
        idade = entradaTeclado.nextInt();
        entradaTeclado.close();

        if (idade <= 10) {
            System.out.println("Crianca");

        } else if (idade <= 17) {
            System.out.println("Adolecente");

        } else {
            System.out.println("Adulto");
        }
    }
}