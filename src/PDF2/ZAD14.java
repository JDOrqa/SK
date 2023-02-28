package PDF2;

import java.util.Scanner;

public class ZAD14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Wprowadź jedną litere swojego pakietu (A, B, C): ");
        char litera = input.nextLine().toUpperCase().charAt(0);


        System.out.println("Wprowadź liczbę minut rozmów : ");
        double min = input.nextDouble();
        double pakietA = 39.99;
        double pakietB = 59.99;
        double pakietC = 69.99;
        double minA = 0.45;
        double minB = 0.40;
        double sumaA = pakietA+(min-450)*minA;
        double sumaB = pakietB+(min-900)*minB;
        double oszcAB = sumaA - sumaB;
        double oszcAC = sumaA - pakietC;
        double oszcCB = sumaB - pakietC;
       double sumaAB= sumaA-pakietB;
        switch (litera) {
            case 'A':

                if(min <= 450){
                    System.out.println("Łączne opłaty za miesiąc: " +pakietA + " zł \n");
                }else{
                    System.out.println("Łączne opłaty za miesiąc: " +sumaA + " zł \n");

                }
                if(min > 450 && min <=900 && sumaA > pakietB && sumaA > pakietC){
                    System.out.println("Wybierając ofertę B zaoszczędziłbyś: " + sumaAB+ " zł \n");
                    System.out.println("Wybierając ofertę C zaoszczędziłbyś: " +oszcAC + " zł \n");
                }else if(min > 900  && sumaA > sumaB && sumaA > pakietC){
                System.out.println("Wybierając ofertę B zaoszczędziłbyś: " + oszcAB+ " zł \n");
                System.out.println("Wybierając ofertę C zaoszczędziłbyś: " +oszcAC + " zł \n");
            } else if (min >900 && sumaA > sumaB) {
                    System.out.println("Wybierając ofertę B zaoszczędziłbyś: " +oszcAB + " zł \n");
                }else if (min > 450 && min <=900 && sumaA > pakietB) {
                    System.out.println("Wybierając ofertę B zaoszczędziłbyś: " +sumaAB + " zł \n");
                } else if (min > 900 && sumaA > pakietC && sumaA < sumaB) {
                    System.out.println("Wybierając ofertę C zaoszczędziłbyś: " +oszcAC + " zł \n");
                } else  {
return;
                }


                break;
            case 'B':
                if(min <= 900){
                    System.out.println("Łączne opłaty za miesiąc: " +pakietB + " zł \n");
                }else{
                    System.out.println("Łączne opłaty za miesiąc: " +sumaB + " zł \n");
                }
                if(min > 900 && sumaB > pakietC){

                    System.out.println("Wybierając ofertę C zaoszczędziłbyś: " +oszcCB + " zł \n");
                } else  {
                    return;
                }
                break;
            case 'C':
                System.out.println("Łączne opłaty za miesiąc: " +pakietC + " zł \n");
                break;

        }
    }

}
