import java.util.Scanner;

public class ZAD15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj cenę detaliczną płytki: ");
        double cenaDetaliczna = input.nextDouble();
        double zysk = cenaDetaliczna * 0.4;
        System.out.printf("Zysk ze sprzedaży: " + zysk);
    }

}
