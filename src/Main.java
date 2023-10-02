import Mamifero.Canino.Lobo;
import Mamifero.Canino.Perro;
import Mamifero.Felino.Tigre;

import java.util.concurrent.TimeoutException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Tigre tigre = new Tigre("jungla",2.3f,3.2f,255.65f,"trig",3.3f,22,"trigger");
        Lobo lobo = new Lobo("tunddra", 2.33f, 6.2f,899f,"lobezno","white",3.22f,"WhiteWolf",22);


        System.out.println(tigre.getEspecieTigre());
        System.out.println(tigre.getAltura());
        System.out.println(tigre.getLargo());
        System.out.println(tigre.getPeso());
        System.out.println(tigre.getTamanoGarras());
        System.out.println("\n");
        System.out.println(lobo.getNumManada());
        System.out.println(lobo.getAltura());
        System.out.println(lobo.getLargo());
        System.out.println(lobo.getPeso());
        System.out.println(lobo.getEspecie());
        System.out.println(lobo.getNombreCientifico());

        System.out.println();






    }
}