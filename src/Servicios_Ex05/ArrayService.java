package Servicios_Ex05;

import Entidades_Ex05.Array;
import java.util.Scanner;

/**
 *
 * @author NeuenMartinez
 */
public class ArrayService {

    Scanner leer = new Scanner(System.in);
    boolean aux = true;

    public void intentos(Array mes) {
        System.out.println("Adivine el mes secreto");
        System.out.println("Introduzca el nombre del mes en minúsculas:");
        do {
            String intento = leer.nextLine();
            if (intento.equalsIgnoreCase(mes.getMesSecreto())) {
                System.out.println("¡Ha acertado!");
                aux = false;
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
                aux = true;
            }
        } while (aux == true);
    }
}
