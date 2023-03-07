package PDF4;
import java.util.Scanner;

public class ZAD8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę lat: ");
        int lata = scanner.nextInt();
        if(lata<=0){
            System.out.print("Podaj poprawne dane: ");
            return;
        }
        double sumaM=0;
        double suma=0;
        double mies=0;


        for(int i =1; i<=lata;i++) {
            for(int j =1; j<=12;j++) {
                System.out.print("Podaj liczbę centymetrów opadów: \n");
                double odpady= scanner.nextDouble();
                if(odpady<0){
                    System.out.print("Podaj poprawne dane: " );
                    return;
                }
                sumaM+=odpady;

            }

        }
        mies=lata*12;
        suma+=sumaM;
        double srednio=suma/mies;
        System.out.print("Liczba miesięcy: " +mies+" \n");
        System.out.print("Wszystkie odpady łącznie: " +suma+"cm \n");
        System.out.print("Sredni poziom odpadów : " +srednio+" \n");
    }
}



