import java.util.Scanner;

public class ZAD17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Wprowadź cenę posiłku: ");
        double cena = input.nextDouble();
        double podatek = cena *0.0675;
        double cenaPodatek = cena + podatek;
        double napiwek = cenaPodatek * 0.20;
        double suma = cenaPodatek + napiwek;
        System.out.printf("Cena posiłku: " + cena + "\n");
        System.out.printf("Wartość podatku: " + podatek +"\n");
        System.out.printf("Wysokość napiwku: " + napiwek +"\n");
        System.out.printf("Łączna kwota do zapłaty: " + suma);
    }

}

