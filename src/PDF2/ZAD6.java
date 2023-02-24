package PDF2;

import java.util.Scanner;
public class ZAD6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbę sekund : ");
        int sekundy = input.nextInt();

        if(sekundy >= 60 && sekundy < 3600){
            double minuty= sekundy/60;
            System.out.print("Podana liczba sekund to : " + minuty +" minuty \n");

        }else if(sekundy >= 3600 && sekundy <86400){
            double minuty= sekundy/60;
            double godziny=sekundy/3600;
            System.out.print("Podana liczba sekund to : " + godziny +" godziny lub "+minuty +" minuty \n");
        }else if(sekundy >= 86400){
        double minuty= sekundy/60;
        double godziny=sekundy/3600;
        double dni = sekundy/86400;
        System.out.print("Podana liczba sekund to : "+ dni + " dni lub " + godziny +" godziny lub "+minuty +" minuty \n");
    }

    }
}