package PDF2;

import java.util.Scanner;
public class ZAD3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj wagę (w KG): ");
        double waga = input.nextDouble();

        System.out.print("Podaj wzrost (w m): ");
        double wzrost = input.nextDouble();


        double bmi = waga / (wzrost * wzrost);

        if (bmi >= 18.5 && bmi <= 25) {
            System.out.printf("Masz optymalne BMI ");
            return ;
        } else if (bmi < 18.5) {
            System.out.printf("Masz niedowagę");
            return ;
        } else if (bmi > 25) {
            System.out.printf("Masz nadwagę");
            return ;
        }
    }
}