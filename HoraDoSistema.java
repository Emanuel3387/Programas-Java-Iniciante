package horadosistema;

import java.awt.*;
import java.util.Date;
import java.util.Locale;

public class HoraDoSistema {
    public static void main(String[] args) {

        // imprime Hora e data do sistema */

        Date relogio = new Date();
        System.out.println("\n A hora do sistema é:");
        System.out.println(relogio.toString());

        // Imprimi Idioma do Sistema */

        Locale loc =Locale.getDefault();
        System.out.println("\n A linguagem do seu sistema é:");
        System.out.println(loc.getDisplayLanguage());

        // imrime resolucao do sistema */

        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("\n A resolução atual da tela é: \n" + " Width : " + size.getWidth() + " Height : " + size.getHeight());

    }
}
