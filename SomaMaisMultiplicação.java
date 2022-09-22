import java.util.Scanner;

public class SomaMaisMultiplicação {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        int a,b,c,d;
        System.out.println(" Digite o primeiro número para soma.\n");
        a = entradaTeclado.nextInt();
        System.out.println(" Digite o segundo número para soma.\n");
        b = entradaTeclado.nextInt();
        c = a + b;
        System.out.println(" O resultato entre a soma de a:" + a + " é b:" + b + " é igual a:" + c);
        d = c * a;
        System.out.println(" é a multiplicação do resultado entre a soma de 'a': "
                + a + " é 'b': " + b + " vezes o valor de 'a': " + a + "  é iagual à: " + d );
    }
}
