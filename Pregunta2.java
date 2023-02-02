//¿Qué algoritmos crees que usan por tus juegos y aplicaciones favoritas?

import java.util.Scanner;

public class Pregunta2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("¿Qué algoritmos crees que usan por tus juegos y aplicaciones favoritas?");
        String respuesta = input.nextLine();
        System.out.println("Tu respuesta es: " + respuesta);
    }
}