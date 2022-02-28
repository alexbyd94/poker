
//  https://github.com/williamfiset/data-structures

public class PruebaPaqueteDeCartas {

    public static void main(String[] Args){
        PaqueteDeCartas miPaqueteDeCartas = new PaqueteDeCartas();
        miPaqueteDeCartas.barajar();

        for (int i =  1; i <= 52; i++){

            System.out.printf("%-19s", miPaqueteDeCartas.repartirCarta());

            if (i % 4 == 0)
                System.out.println();
        }

    }

}
