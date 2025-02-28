import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random ale= new Random();
        int max=50;
        int min=1;
        int numero;
        int contd1=0;
        Scanner teclado = new Scanner(System.in);


        Random ale1= new Random();
        numero= ale1.nextInt(max- min + 1) +min;
        System.out.println("---ADIVINA EL NUMERO----");
        System.out.println("  ");
        System.out.println("SOLO TIENES TRES INTENTOS");
        System.out.println("  ");

        do{
            for (int n= 1; n <=3; n++ ){
                System.out.println("INGRESA UN NUMERO");
                n= teclado.nextInt();
                if (n<numero){
                    System.out.println("El numero es mayor");

                } else if (n>numero) {
                    System.out.println("El numero es menor");

                }else{
                    System.out.println("Ese era el numero");
                    System.out.println(" ");
                    System.out.println("¡GANASTE!");
                    break;
                }
                contd1++;



            }
        }while (contd1<3);

        if(contd1==3){
            System.out.println("PERDISTE");

            System.out.println("Se te acabaron tus tres intentos");

        }
        System.out.println(" ");
        System.out.println("EL NUMERO ERA: " + numero);


        }




}
