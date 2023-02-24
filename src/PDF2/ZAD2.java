package PDF2;

import java.util.Scanner;
public class ZAD2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Wprowadź dzien: ");
        int dzien = input.nextInt();
        if(dzien < 1 || dzien > 31){
            System.out.printf("Wpisz poprawny dzien");
            return ;
        }
        System.out.print("Wprowadź miesiac: ");
        int miesiac = input.nextInt();
        if(miesiac< 1 || miesiac > 12){
            System.out.printf("Wpisz poprawny miesiac");
            return ;
        }
        System.out.print("Wprowadź dwie ostatnie cyfry roku: ");
        int rok = input.nextInt();
        if(rok < 1 || rok > 99){
            System.out.printf("Wpisz poprawny rok");
            return ;
        }

       int iloczyn = dzien*miesiac;

        if(iloczyn == rok){
            System.out.printf("Podana przez ciebie data jest wyjątkowa, iloczyn dnia i miesiac równa się rokowi");
        }else {
            System.out.printf("Twoj rok jest normalny");
        }















    }

}
