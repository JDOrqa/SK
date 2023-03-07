package PDF4;
import java.util.Scanner;



public class ZAD12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wartości sprzedaży sklepu 1 z dzisaj: " );
        double wart1= input.nextDouble();
        System.out.println("Podaj wartości sprzedaży sklepu 2 z dzisaj " );
        double wart2= input.nextDouble();
        System.out.println("Podaj wartości sprzedaży sklepu 3 z dzisaj " );
        double wart3= input.nextDouble();
        System.out.println("Podaj wartości sprzedaży sklepu 4 z dzisaj " );
        double wart4= input.nextDouble();
        System.out.println("Podaj wartości sprzedaży sklepu 5 z dzisaj " );
        double wart5= input.nextDouble();
double wartc1=wart1/100;
        System.out.print("Sklep nr1: " );
for(int i=1;i<=wartc1;i++){
    System.out.print("*" );
}
        System.out.print("\n" );
        double wartc2=wart2/100;
        System.out.print("Sklep nr2: " );
        for(int i=1;i<=wartc2;i++){
            System.out.print("*" );
        }
        System.out.print("\n" );
        double wartc3=wart3/100;
        System.out.print("Sklep nr3: " );
        for(int i=1;i<=wartc3;i++){
            System.out.print("*" );
        }
        System.out.print("\n" );
        double wartc4=wart4/100;
        System.out.print("Sklep nr4: " );
        for(int i=1;i<=wartc4;i++){
            System.out.print("*" );
        }
        System.out.print("\n" );
        double wartc5=wart5/100;
        System.out.print("Sklep nr5: " );
        for(int i=1;i<=wartc5;i++){
            System.out.print("*" );
        }



    }
}




