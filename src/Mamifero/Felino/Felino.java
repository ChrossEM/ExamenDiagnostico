package Mamifero.Felino;

import Mamifero.Mamifero;

public class Felino extends Mamifero {
    protected Float tamanoGarras;
    protected Integer velocidad;

    public Felino(String habitat, float altura, float largo, float peso, String nombreCientifico,Float tamanoGarras,Integer velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad= velocidad;
    }

    public Float getTamanoGarras() {
        return tamanoGarras;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    @Override
    protected String comer() {
        return null;
    }

    @Override
    protected String dormir() {
        return null;
    }

    @Override
    protected String correr() {
        return null;
    }

    @Override
    protected String comunicarse() {
        return null;
    }
}
