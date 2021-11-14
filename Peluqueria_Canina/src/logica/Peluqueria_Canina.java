package logica;

import igu.principal;

public class Peluqueria_Canina {

    public static void main(String[] args) {

        Controladora control = new Controladora();

        principal princ = new principal(control);
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
    }
}
