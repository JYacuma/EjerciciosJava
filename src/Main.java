import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random ale= new Random();
        int max=10;
        int min=1;
        int rondas, d1, d2;
        int contd1=0, contd2=0;



        Random ale1= new Random();
        rondas= ale1.nextInt(max- min + 1) +min;
        System.out.println("TENDRA " + rondas + " RONDAS");
        System.out.println(" ");

        for (int i= 1; i <= rondas; i++ ){
            d1= ale.nextInt((6 - 1 + 1)) + 1;
            contd1 += d1;

            d2= ale.nextInt((6 - 1 + 1)) + 1;
            contd2 += d2;


            System.out.println(" ");

            System.out.println("D1: " + d1 + " " + "D2: " +d2);


        }

        System.out.println(" ");
        System.out.println("SUMA DE LOS DADOS");
        System.out.println("D1: " + contd1);
        System.out.println("D2: " + contd2);
        System.out.println("  ");

        if (contd1 <= contd2) {
            System.out.println("EL GANADOR ES EL DADO 2");

        }else if(contd1 >= contd2){
            System.out.println("EL GANADOR ES EL DADO 1");

        }else{
            System.out.println("EMPATE");
        }
    }
}