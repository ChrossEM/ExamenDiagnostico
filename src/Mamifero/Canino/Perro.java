package Mamifero.Canino;

public class Perro extends Canino{
    protected Integer fuerzaMordida;

    public Perro(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, String color, Float tamanoColmillos, Integer fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public Integer getFuerzaMordida() {
        return fuerzaMordida;
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
