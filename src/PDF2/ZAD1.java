package PDF2;

import java.util.Scanner;
public class ZAD1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Wprowadx wartość z przedziału od 1 do 10: ");
        int liczba = input.nextInt();
        if(liczba < 1 || liczba > 10){
            System.out.printf("Wpisz poprawny dzien");
            return ;
        }

        switch (liczba) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
        }











    }

}
