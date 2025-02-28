
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double peso;
        double estatura;
        double IMC;

        Scanner teclado = new Scanner(System.in);

        System.out.println("---INDICE DE GRASA CORPORAL---");
        System.out.println("  ");
        System.out.println("Digita tu peso en kg: ");
        peso= teclado.nextDouble();

        System.out.println("   ");
        System.out.println("Digita tu altura en metros: ");
        estatura= teclado.nextDouble();
        IMC= peso/(estatura*estatura);
        System.out.println("  ");

        System.out.println("TU INDICE DE GRASA CORPORAL ES:");

        if(IMC<=18.5){
            System.out.println("BAJO PESO");
        } else if (IMC>18.5 && IMC<=24.9) {
            System.out.println("PESO NORMAL");

        }else if (IMC>=25 && IMC<=26.9) {
            System.out.println("SOBREPESO GRADO I");

        }else if (IMC>=27 && IMC<=29.9) {
            System.out.println("SOBREPESO GRADO II");

        }else if (IMC>=30 && IMC<=34.9) {
            System.out.println("OBESISDAD TIPO I");

        }else if (IMC>=35 && IMC<=39.9) {
            System.out.println("OBESISDAD TIPO II");

        }else if (IMC>=40 && IMC<=49.9) {
            System.out.println("OBESISDAD TIPO III (MORBIDA)");

        }else if (IMC>=50) {
            System.out.println("OBESISDAD TIPO IV (EXTREMA");

        }
        System.out.println(IMC);



    }

}
