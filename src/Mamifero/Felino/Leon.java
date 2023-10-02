package Mamifero.Felino;

public class Leon extends Felino {
    protected Integer numManada;
    protected Float potenciaRogido;
    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico, Float tamanoGarras, Integer velocidad, Integer numManada, Float potenciaRogido) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }
}
