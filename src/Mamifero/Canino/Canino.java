package Mamifero.Canino;

import Mamifero.Mamifero;

public class Canino extends Mamifero {
    private String color;
    private Float tamanoColmillos;

    public Canino(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, String color, Float tamanoColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }
}
