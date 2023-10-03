package Mamifero;


public class Mamifero {
 protected String habitat;
 protected Float altura;
 protected Float largo;
 protected Float peso;
 protected String nombreCientifico;

    public Mamifero(String habitat, Float altura, Float largo, Float peso, String nombreCientifico) {
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        this.nombreCientifico = nombreCientifico;
    }

    protected String comer(){
     return "comiendo";
 }
 protected String dormir(){
     return "durmiendo";
 }
 protected  String correr(){
     return  "corriendo";
 }
 protected String comunicarse(){
     return  "comunicando";
 }


    public String getHabitat() {
        return habitat;
    }

    public Float getAltura() {
        return altura;
    }

    public Float getLargo() {
        return largo;
    }

    public Float getPeso() {
        return peso;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }
}
