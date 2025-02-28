
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int juega=0;
        int max = 3;
        int min = 1;
        int ronda;
        int dinero;
        int gano, divide, perdio;

        Scanner teclado = new Scanner(System.in);



        System.out.println("----CASINO-----");
        System.out.println(" ");
        System.out.println("NORMAS");
        System.out.println("Caera aleatoraimente 3 opciones al ingresar el dinero");
        System.out.println("  ");
        System.out.println("1= SE DUBPLICARA EL DINERO");
        System.out.println("2= SE TE QUITA LA MITAD DEL DINERO");
        System.out.println("3= PIRDES TODO");

        System.out.println("¿CUANTO DINERO VAS HA INGRESAR?");
        System.out.println("  ");

        dinero = teclado.nextInt();
        System.out.println("  ");

        do {

            Random ale1 = new Random();
            ronda = ale1.nextInt(max - min + 1) + min;


            if (ronda == 1) {
                gano = dinero * 2;
                dinero=gano;
                System.out.println("SE DUPLICO TU DINERO");
                System.out.println(gano);


            } else if (ronda == 2) {
                divide = dinero / 2;
                dinero=divide;
                System.out.println("PERDISTE LA MITAD");
                System.out.println(divide);


            } else if (ronda == 3) {

                System.out.println("PERDISTE TODO");
                dinero=0;

                break;

            }
            System.out.println("  ");

            System.out.println("¿QUIERES SEGUIR JUGANDO?");
            System.out.println("   ");
            System.out.println("1: SI");
            System.out.println("2: NO");
            juega=teclado.nextInt();



        }while(juega==1);
        System.out.println("QUEDASTE CON: " + dinero);
        System.out.println("  ");
        System.out.println("FIN DEL JUEGO");

    }
}
