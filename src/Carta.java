public class Carta {

    private final String cara;
    private final String palo;

    public Carta(String caraCarta, String paloCarta){
        this.cara = caraCarta;
        this.palo = paloCarta;
    }

    public String toString(){ return cara + " de " + palo;}

}
