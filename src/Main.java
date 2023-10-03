import Mamifero.Canino.Lobo;
import Mamifero.Canino.Perro;
import Mamifero.Felino.Guepardo;
import Mamifero.Felino.Tigre;

import java.util.concurrent.TimeoutException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Lobo[] lobos = new Lobo[10];

        // Inicializar cada elemento del arreglo con un objeto Lobo único
        lobos[0] = new Lobo("Bosque", 1.2f, 1.8f, 30.0f, "Canis lupus", "Gris", 5.0f, "Lobo Gris", 1);
        lobos[1] = new Lobo("Montaña", 1.0f, 1.6f, 35.0f, "Canis lupus", "Blanco", 6.0f, "Lobo Ártico", 2);
        lobos[2] = new Lobo("Desierto", 0.8f, 1.4f, 25.0f, "Canis lupus", "Gris", 4.5f, "Lobo del Desierto", 3);
        lobos[3] = new Lobo("Selva", 1.1f, 1.7f, 28.0f, "Canis lupus", "Marrón", 5.2f, "Lobo de la Selva", 4);
        lobos[4] = new Lobo("Tundra", 1.0f, 1.5f, 32.0f, "Canis lupus", "Blanco", 5.5f, "Lobo de la Tundra", 5);
        lobos[5] = new Lobo("Montaña", 1.2f, 1.9f, 29.0f, "Canis lupus", "Gris", 5.2f, "Lobo de Montaña", 6);
        lobos[6] = new Lobo("Bosque", 1.1f, 1.7f, 31.0f, "Canis lupus", "Gris", 5.0f, "Lobo del Bosque", 7);
        lobos[7] = new Lobo("Desierto", 0.9f, 1.3f, 27.0f, "Canis lupus", "Marrón", 4.8f, "Lobo del Desierto", 8);
        lobos[8] = new Lobo("Tundra", 1.0f, 1.6f, 30.0f, "Canis lupus", "Blanco", 5.3f, "Lobo de la Tundra", 9);
        lobos[9] = new Lobo("Selva", 1.3f, 2.0f, 34.0f, "Canis lupus", "Marrón", 5.7f, "Lobo de la Selva", 10);

        Perro[] perros = new Perro[10];

        // Inicializar cada elemento del arreglo con un objeto Perro único
        perros[0] = new Perro("Casa", 0.6f, 0.9f, 15.0f, "Canis familiaris", "Marrón", 2.0f, 100);
        perros[1] = new Perro("Casa", 0.7f, 1.0f, 18.0f, "Canis familiaris", "Blanco", 2.2f, 120);
        perros[2] = new Perro("Casa", 0.5f, 0.8f, 12.0f, "Canis familiaris", "Negro", 1.8f, 90);
        perros[3] = new Perro("Casa", 0.8f, 1.2f, 22.0f, "Canis familiaris", "Dorado", 2.5f, 110);
        perros[4] = new Perro("Casa", 0.6f, 0.9f, 16.0f, "Canis familiaris", "Marrón", 2.1f, 95);
        perros[5] = new Perro("Casa", 0.7f, 1.1f, 19.0f, "Canis familiaris", "Negro", 2.3f, 105);
        perros[6] = new Perro("Casa", 0.6f, 0.9f, 14.0f, "Canis familiaris", "Blanco", 2.0f, 88);
        perros[7] = new Perro("Casa", 0.8f, 1.3f, 25.0f, "Canis familiaris", "Marrón", 2.4f, 115);
        perros[8] = new Perro("Casa", 0.7f, 1.0f, 17.0f, "Canis familiaris", "Gris", 2.2f, 98);
        perros[9] = new Perro("Casa", 0.6f, 0.9f, 15.0f, "Canis familiaris", "Blanco", 2.1f, 105);

        Guepardo[] guepardos = new Guepardo[10];

        // Inicializar cada elemento del arreglo con un objeto Guepardo único
        guepardos[0] = new Guepardo("Savannah", 0.9f, 1.4f, 50.0f, "Acinonyx jubatus", 3.0f, 112);
        guepardos[1] = new Guepardo("Savannah", 0.85f, 1.3f, 48.0f, "Acinonyx jubatus", 2.8f, 115);
        guepardos[2] = new Guepardo("Savannah", 0.92f, 1.5f, 52.0f, "Acinonyx jubatus", 3.2f, 110);
        guepardos[3] = new Guepardo("Savannah", 0.88f, 1.4f, 49.0f, "Acinonyx jubatus", 3.1f, 113);
        guepardos[4] = new Guepardo("Savannah", 0.91f, 1.6f, 53.0f, "Acinonyx jubatus", 3.3f, 108);
        guepardos[5] = new Guepardo("Savannah", 0.87f, 1.3f, 47.0f, "Acinonyx jubatus", 2.7f, 118);
        guepardos[6] = new Guepardo("Savannah", 0.89f, 1.4f, 50.0f, "Acinonyx jubatus", 3.0f, 114);
        guepardos[7] = new Guepardo("Savannah", 0.86f, 1.2f, 46.0f, "Acinonyx jubatus", 2.6f, 120);
        guepardos[8] = new Guepardo("Savannah", 0.93f, 1.7f, 55.0f, "Acinonyx jubatus", 3.4f, 106);
        guepardos[9] = new Guepardo("Savannah", 0.84f, 1.1f, 45.0f, "Acinonyx jubatus", 2.5f, 122);

        // Usar un foreach para imprimir los atributos de los guepardos
        for (Guepardo guepardo : guepardos) {
            System.out.println("Velocidad: " + guepardo.getVelocidad());
            System.out.println("Hábitat: " + guepardo.getHabitat());
            System.out.println("Altura: " + guepardo.getAltura());
            System.out.println("Largo: " + guepardo.getLargo());
            System.out.println("Peso: " + guepardo.getPeso());
            System.out.println("Nombre Científico: " + guepardo.getNombreCientifico());
            System.out.println("Tamaño de Garras: " + guepardo.getTamanoGarras());
            System.out.println();
        }

        // Usar un foreach para imprimir los atributos de los perros
        // for (Perro perro : perros) {
        //     System.out.println("Fuerza de Mordida: " + perro.getFuerzaMordida());
        //     System.out.println("Hábitat: " + perro.getHabitat());
        //     System.out.println("Altura: " + perro.getAltura());
        //     System.out.println("Largo: " + perro.getLargo());
        //     System.out.println("Peso: " + perro.getPeso());
        //     System.out.println("Nombre Científico: " + perro.getNombreCientifico());
        //     System.out.println("Color: " + perro.getColor());
        //     System.out.println("Tamaño de Colmillos: " + perro.getTamanoColmillos());
        //     System.out.println();
        //}

        // for (Lobo lobo : lobos) {
        //     System.out.println("Especie: " + lobo.getEspecie());
        //     System.out.println("Número de Manada: " + lobo.getNumManada());
        //     System.out.println("Hábitat: " + lobo.getHabitat());
        //     System.out.println("Altura: " + lobo.getAltura());
        //     System.out.println("Largo: " + lobo.getLargo());
        //     System.out.println("Peso: " + lobo.getPeso());
        //     System.out.println("Nombre Científico: " + lobo.getNombreCientifico());
        //     System.out.println("Color: " + lobo.getColor());
        //     System.out.println("Tamaño de Colmillos: " + lobo.getTamanoColmillos());
        //     System.out.println();
        // }




    }
}
