import java.util.Scanner;

public class ZAD14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj wynik z pierwszego testu: ");
        int wynik1 = input.nextInt();
        System.out.print("Podaj wynik z drugiego testu: ");
        int wynik2 = input.nextInt();
        System.out.print("Podaj wynik z trzeciego testu: ");
        int wynik3 = input.nextInt();
        double srednia = (wynik1 + wynik2 + wynik3) / 3.0;
        System.out.printf("Wynik z pierwszego testu: "+ wynik1 +"\n");
        System.out.printf("Wynik z drugiego testu: "+ wynik2 +"\n");
        System.out.printf("Wynik z trzeciego testu: "+ wynik3 +"\n");
        System.out.printf("Średnia wyników: "+ srednia +"\n");
    }

}

