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

    private String comer(){
     return "comiendo";
 }
 private String dormir(){
     return "durmiendo";
 }
 private  String correr(){
     return  "corriendo";
 }
 private String comunicarse(){
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
