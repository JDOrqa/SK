package PDF2;

import java.util.Scanner;

public class ZAD13 {
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

        switch (litera) {
            case 'A':
                if(min <= 450){
                    System.out.println("Łączne opłaty za miesiąc: " +pakietA + " zł \n");
                }else{
                    System.out.println("Łączne opłaty za miesiąc: " +sumaA + " zł \n");
                }

                break;
            case 'B':
                if(min <= 900){
                    System.out.println("Łączne opłaty za miesiąc: " +pakietB + " zł \n");
                }else{
                    System.out.println("Łączne opłaty za miesiąc: " +sumaB + " zł \n");
                }

                break;
            case 'C':
                System.out.println("Łączne opłaty za miesiąc: " +pakietC + " zł \n");
                break;

        }
    }

}
