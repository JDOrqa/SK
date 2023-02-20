import java.util.Scanner;

public class ZAD20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Wprowadź ilość ciastek: ");
        int ciastka = input.nextInt();
        double cukier = 1.5;
        double maslo = 1;
        double maka = 2.75;

        double cukierJeden = 1.5/48;
        double masloJeden = 1.0/48;
        double makaJeden = 2.75/48;

        double cukierW = cukierJeden*ciastka;
        double masloW = masloJeden*ciastka;
        double makaW = makaJeden*ciastka;

        System.out.printf("Do zrobienia: " + ciastka + "\n" + "Potrzebujesz: \n");
        System.out.printf(cukierW + " szklanki cukru \n");
        System.out.printf(masloW + " szklanki masla \n");
        System.out.printf(makaW + " szklanki mąki");


    }

}