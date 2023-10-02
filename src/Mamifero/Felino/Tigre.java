package Mamifero.Felino;

public class Tigre extends Felino{
    protected String especieTigre;

    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico, Float tamanoGarras, Integer velocidad,String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }


    public String getEspecieTigre() {
        return especieTigre;
    }

}
