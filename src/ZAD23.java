import java.util.Scanner;

public class ZAD23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.print("Podaj długości rzędu w metrach: ");
        double dlg = input.nextDouble();

        System.out.print("Podaj ilosc miejsca zajmowanego przez okratowanie: ");
        double krata = input.nextDouble();

        System.out.print("Podaj odległość między sadzonkami: ");
        double sadzonki = input.nextDouble();

        double sadzony = (dlg-2*krata)/sadzonki;
        System.out.printf("Liczba sadzonek, jakie zmieszczą się w rzędzie to:"+sadzony );
    }
}
