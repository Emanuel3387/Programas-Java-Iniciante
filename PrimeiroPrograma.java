package primeiroprograma;

import java.util.Scanner;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        Scanner  keyboardIn = new Scanner(System.in);
        String userAdmin ;
        System.out.println(" Digite o usuario ou ' s ' para sair. \n");
        userAdmin = keyboardIn.nextLine();
        while (!userAdmin.equals("s")){
            System.out.println(" **** Ola **** "+ userAdmin);
            System.out.println(" Digite o usuario ou ' s ' para sair. \n");
            userAdmin = keyboardIn.nextLine();

        }
    System.out.println(" Fim do Programa.");

    }
}
