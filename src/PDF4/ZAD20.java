package PDF4;


import java.util.Scanner;

public class ZAD20 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę całkowitą nie większą niż 15: ");
        int liczba= scanner.nextInt();
if(liczba<=0 || liczba>15){
    System.out.println("Wprowadź poprawne dane ");
    return;
}
        for(int i=1;i<=liczba; i++) {

            System.out.print("\n");
            System.out.print("*");

            for (int j = 1; j<= liczba; j++) {
                System.out.print("*");

            }
        }


    }

}
