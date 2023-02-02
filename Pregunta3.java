//¿Haz hecho alguna vez un algoritmo para un programa? ¿Qué hacía? ¿Era correcto y eficiente?

import java.util.Scanner;

public class Pregunta3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("¿Qué algoritmos crees que usan por tus juegos y aplicaciones favoritas?");
        String respuesta = input.nextLine();
        System.out.println("Tu respuesta es: " + respuesta);
    }
}