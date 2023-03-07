package PDF4;
import java.util.Scanner;

public class ZAD7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę pięter: ");
        int pietra = scanner.nextInt();
        if(pietra<=0){
            System.out.print("Podaj poprawne dane: ");
            return;
        }
        int pietro =0;
        double suma=0;
        double sumaZ=0;



        for(int i =1; i<=pietra;i++) {
            pietro=i;
            System.out.print("Podaj liczbę wszystkich pokoi na piętrze "+pietro+"(min 10): \n");
            int wszystko = scanner.nextInt();
            if(wszystko<10){
                System.out.print("Podaj poprawne dane ");
                return;
            }
            System.out.print("Podaj liczbę zajętych pokoi na piętrze "+pietro+": \n");
            int zajete = scanner.nextInt();
suma+=wszystko;
sumaZ+=zajete;

        }
       double poziom=sumaZ/suma;
        System.out.print("Wszystkie pokoje łącznie: " +suma + " \n Wszystkie zajęte pokoje : " +sumaZ
                + " \n Poziom obłożenia  : " +poziom+"%");
    }
}



