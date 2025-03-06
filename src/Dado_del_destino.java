
import java.util.Scanner;
import java.util.Random;

public class Dado_del_destino {
    public static void main(String[] args) {

        int termina = 0;
        int max = 6;
        int min = 1;
        int iniciar;
        int dado;
        int ronda=0;
        int vida=5;
        int puntos=0;
        int pierdevida, gana3p, gana1p;
        Scanner teclado = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("---EL DADO DEL DESTINO---");
        System.out.println("  ");
        System.out.println("La cara que te salga te cambiara tu partida:");
        System.out.println("   ");
        System.out.println("1= PIERDES 1 VIDA ");
        System.out.println("6= GANAS 3 PUNTOS");
        System.out.println("2 o 4= GANAS 1 PUNTO ");
        System.out.println("3 o 5= NO PASARA NADA");
        System.out.println(" ");
        System.out.println("Comenzaras con 5 vidas y 0 puntos");
        System.out.println("Ganas al complentar mas de 10 puntos");
        System.out.println("Pierdes al perder todas tus vidas");
        System.out.println(" ");
        System.out.println("PRESIONA 1 PARA INICIAR");
        System.out.println("  ");
        iniciar = teclado.nextInt();
        System.out.println("  ");

        if (iniciar == 1) {

            System.out.println("---INICIO---");
            System.out.println("  ");
            System.out.println("VIDAS= " + vida);
            System.out.println("PUNTOS= " + puntos);
            System.out.println("  ");


            do{
                Random ale1 = new Random();
                dado= ale1.nextInt(max - min + 1) + min;

                ronda++;
                System.out.println("RONDA " + ronda);

                if (dado==1){
                    pierdevida = vida - 1;
                    vida=pierdevida;
                    System.out.println("PERDISTE UNA VIDA");
                    System.out.println("   ");
                    System.out.println("VIDAS= "+ pierdevida);
                    System.out.println("PUNTOS= " + puntos);

                } else if (dado==6) {
                    gana3p= puntos + 3;
                    puntos= gana3p;
                    System.out.println("GANASTE 3 PUNTOS");
                    System.out.println("  ");
                    System.out.println("VIDAS= " + vida);
                    System.out.println("PUNTOS= " + gana3p);


                } else if (dado==2 || dado == 4) {
                    gana1p= puntos + 1;
                    puntos= gana1p;
                    System.out.println("GANASTE 1 PUNTO");
                    System.out.println("   ");
                    System.out.println("VIDAS= " + vida);
                    System.out.println("PUNTOS= " + gana1p);


                }else if (dado==3 || dado == 5) {
                    System.out.println("NO PASO NADA");
                    System.out.println("   ");
                    System.out.println("VIDAS= " + vida);
                    System.out.println("PUNTOS= " + puntos);

                }
                System.out.println("  ");
                System.out.println("PRESIONA 1 PARA CONTINUAR");
                System.out.println("   ");

                termina=teclado.nextInt();

            }while(vida>0 && puntos<10 && termina==1);

            if (vida==0){
                System.out.println("PERDISTE");
                System.out.println("VIDAS= " + vida);
                System.out.println("PUNTOS= " + puntos);

            } else if (puntos<=10) {
                System.out.println("GANASTE");
                System.out.println("VIDAS= " + vida);
                System.out.println("PUNTOS= " + puntos);
            }


            System.out.println(" ");
            System.out.println("----FIN DEL PROGRAMA----");

            System.out.println("  ");


        }else{
            System.out.println("----FIN DEL PROGRAMA----");
            System.out.println("  ");
        }


    }
}
