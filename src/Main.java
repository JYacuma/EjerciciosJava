
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int termina = 0;
        int max = 100;
        int min = 1;
        int num1, num2;
        double resultado;
        String opcion;
        int iniciar;
        String sim1 = "+";
        String sim2 = "-";
        String sim3 = "*";
        String sim4 = "/";
        String sim5 = "^";
        String sim6 = "%";


        Scanner teclado = new Scanner(System.in);

        System.out.println("   ");
        System.out.println("------CALCULADORA------");
        System.out.println("   ");

        System.out.println("-En esta aplicación se generaran dos numeros aleatoriamente (comprediddos entre 1-100).");
        System.out.println("-Tu ingrasaras que operacion matematica quieres hacer con estos dos numeros.");
        System.out.println(" ");
        System.out.println("----SIMBOLOS MATEMATICOS----");
        System.out.println("(+) SUMA");
        System.out.println("(-) RESTA");
        System.out.println("(*) MULTIPLICACION");
        System.out.println("(/) DIVISION");
        System.out.println("(^) POTENCIACION");
        System.out.println("(%) MODULO");
        System.out.println("  ");
        System.out.println("PRESIONA 1 PARA INICIAR");

        System.out.println("  ");

        iniciar = teclado.nextInt();
        System.out.println("  ");

        if (iniciar == 1) {

            System.out.println("---INICIO---");
            System.out.println("  ");


            do {
                Random ale1 = new Random();
                num1 = ale1.nextInt(max - min + 1) + min;
                num2 = ale1.nextInt(max - min + 1) + min;
                System.out.println("NUMERO 1= " + num1);
                System.out.println("NUMERO 2= " + num2);
                System.out.println("  ");
                System.out.println("¿QUE OPERACION QUIERES USAR?");
                System.out.println("  ");
                opcion = teclado.next();
                System.out.println("  ");

                if (opcion.equals(sim1)) {
                    System.out.println("----SUMA----");
                    System.out.println(" ");
                    resultado = num1 + num2;
                    System.out.println(num1 + " + " + num2);
                    System.out.println(" ");
                    System.out.println("RESULTADO= " + resultado);

                } else if (opcion.equals(sim2)) {
                    System.out.println("----RESTA----");
                    System.out.println(" ");
                    resultado = num1 - num2;
                    System.out.println(num1 + " - " + num2);
                    System.out.println(" ");
                    System.out.println("RESULTADO= " + resultado);

                } else if (opcion.equals(sim3)) {
                    System.out.println("----MULTIPLICACION----");
                    System.out.println(" ");
                    resultado = num1 * num2;
                    System.out.println(num1 + " * " + num2);
                    System.out.println(" ");
                    System.out.println("RESULTADO= " + resultado);

                }else if (opcion.equals(sim4)) {
                    System.out.println("----DIVISION----");
                    System.out.println(" ");
                    resultado = (double) num1 / num2;
                    System.out.println(num1 + " / " + num2);
                    System.out.println(" ");
                    System.out.println("RESULTADO= " + resultado);

                }else if (opcion.equals(sim5)) {
                    System.out.println("----POTENCIACION----");
                    System.out.println(" ");
                    resultado = Math.pow(num1, num2);;
                    System.out.println(num1 + " ^ " + num2);
                    System.out.println(" ");
                    System.out.println("RESULTADO= " + resultado);

                }else if (opcion.equals(sim6)) {
                    System.out.println("----MODULO----");
                    System.out.println(" ");
                    resultado = num1 % num2;
                    System.out.println(num1 + " % " + num2);
                    System.out.println(" ");
                    System.out.println("RESULTADO= " + resultado);

                }

                System.out.println("  ");
                System.out.println("¿QUIERES SEGUIR HACIENDO OPERACIONES?");
                System.out.println("   ");
                System.out.println("1: SI");
                System.out.println("2: NO");
                System.out.println(" ");
                termina=teclado.nextInt();


            }while (termina == 1) ;

            System.out.println(" ");
            System.out.println("----FIN DEL PROGRAMA----");
            System.out.println("  ");


        }else{
            System.out.println("----FIN DEL PROGRAMA----");
            System.out.println("  ");
        }
    }
}