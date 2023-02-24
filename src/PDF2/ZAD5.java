package PDF2;

import java.util.Scanner;
public class ZAD5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj masę obiektu (kg): ");
        double masa = input.nextDouble();
       double ciezar = masa*9.8;
       if(ciezar > 1000){
           System.out.print("Obiekt jest zbyt ciężki ");
       }else if(ciezar < 10){
            System.out.print("Obiekt jest za lekki");
        }

    }
}