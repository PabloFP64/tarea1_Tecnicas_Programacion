//¿Qué algoritmos usas en tu vida cotidiana? ¿Piensas que podrías escribir un programa para hacerlos más eficientes?

import java.util.Scanner;

public class Pregunta1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("¿Qué algoritmos usas en tu vida cotidiana? ¿Piensas que podrías escribir un programa para hacerlos más eficientes?");
        String respuesta = input.nextLine();
        System.out.println("Tu respuesta es: " + respuesta);
    }
}