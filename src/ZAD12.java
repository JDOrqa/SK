import java.util.Scanner;

public class ZAD12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Wprowadź liczbę przejechanych kilometrów: ");
        double km = input.nextDouble();
        System.out.print("Wprowadź liczbę spalonych litrów paliwa: ");
        double litr = input.nextDouble();
        double przejechane = km/litr;



        System.out.printf("Liczba kilometrów przejechanych na litrze paliwa wynosi:" + przejechane);
    }

}