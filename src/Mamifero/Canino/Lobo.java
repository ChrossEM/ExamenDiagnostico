package Mamifero.Canino;

public class Lobo extends Canino {
    protected String especie;
    protected Integer numManada;

    public Lobo(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, String color, Float tamanoColmillos, String especie, Integer numManada) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.especie = especie;
        this.numManada = numManada;
    }

    public String getEspecie() {
        return especie;
    }

    public Integer getNumManada() {
        return numManada;
    }
}
