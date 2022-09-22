import java.util.Random;

public class MegaSena {

    public static void main(String[] args) {

        System.out.println(" Ola, Segue dica  1 de 6 números da mega sena:");
        Random generete = new Random();
        int i = 0;
        while (i < 6) {
            int number = generete.nextInt(60);
            System.out.println(number);
            i++;
        }
    }
}

