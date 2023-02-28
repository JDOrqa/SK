package PDF2;

import java.util.Scanner;
public class ZAD10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Podaj liczbę kalori : ");
        double kalorie = input.nextDouble();

        System.out.print("Podaj liczbę gramów tłuszczu : ");
        double tluszcz= input.nextDouble();
        double kalorieT= tluszcz*9;
        double kalorieZ= kalorieT/kalorie*100 ;
        if(kalorie < kalorieT ){System.out.print("Dane wejściowe są nieprawidłowe  ");
            return;
        }




        System.out.print("Procent kalori pochodzących z tłuszczu to: "+ kalorieZ+ "% \n");
        if(kalorieZ < 30){
            System.out.print("Produkt jest nisktłuszczowy ");
            return;
        }

    }
}
