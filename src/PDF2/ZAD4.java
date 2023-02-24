package PDF2;

import java.util.Scanner;
public class ZAD4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj pierwsz wynik (%): ");
        double ocena1 = input.nextDouble();
        if (ocena1 < 1 || ocena1 > 100) {
            System.out.printf("Wpisz poprawny wynik ");
            return ;
        }
        System.out.print("Podaj drugi wynik (%): ");
        double ocena2 = input.nextDouble();
        if (ocena2 < 1 || ocena2 > 100) {
            System.out.printf("Wpisz poprawny wynik ");
            return ;
        }
        System.out.print("Podaj trzeci wynik (%): ");
        double ocena3 = input.nextDouble();

        if (ocena3 < 1 || ocena3 > 100) {
            System.out.printf("Wpisz poprawny wynik ");
            return ;
        }
     double srednia = (ocena1+ocena2+ocena3)/3;
        System.out.printf("Średnia testów wynosi: "+ srednia + "\n");
        if(srednia >= 90){
            System.out.printf("Ocena testów wynosi: 5 ");
            return ;
        }else if(srednia >=80 && srednia <= 89){
            System.out.printf("Ocena testów wynosi: 4 ");
            return ;
        }else if(srednia >=70 && srednia <= 79){
            System.out.printf("Ocena testów wynosi: 3 ");
            return ;
        }else if(srednia >=60 && srednia <= 69){
            System.out.printf("Ocena testów wynosi: 2 ");
            return ;
        }else if(srednia <60){
            System.out.printf("Ocena testów wynosi: 1 ");
            return ;
        }

    }
}