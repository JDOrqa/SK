package PDF2;

import java.util.Scanner;

public class ZAD11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj trzy nazwiska biegaczy:");


        String nazwisko1 = input.nextLine();
        String nazwisko2 = input.nextLine();
        String nazwisko3 = input.nextLine();

        System.out.println("Podaj trzy czasy biegaczy (sek):");

        double czas1 = input.nextDouble();
        double czas2 = input.nextDouble();
        double czas3 = input.nextDouble();



        System.out.println("Podium:");
        if(czas1 < czas2 && czas1 < czas3 && czas2<czas3){
            System.out.println("1."+ nazwisko1+"\n"+"2."+ nazwisko2+"\n"+"3."+ nazwisko3+"\n");
        }else if(czas1 < czas2 && czas1 < czas3 && czas3<czas2){
            System.out.println("1."+ nazwisko1+"\n"+"2."+ nazwisko3+"\n"+"3."+ nazwisko2+"\n");
        } else if(czas2 < czas1 && czas2 < czas3 && czas1<czas3){
            System.out.println("1."+ nazwisko2+"\n"+"2."+ nazwisko3+"\n"+"3."+ nazwisko1+"\n");
        }else if(czas2 < czas1 && czas2 < czas3 && czas3<czas1){
            System.out.println("1."+ nazwisko2+"\n"+"2."+ nazwisko1+"\n"+"3."+ nazwisko3+"\n");
        }else if(czas3 < czas1 && czas3 < czas2 && czas1<czas2){
            System.out.println("1."+ nazwisko3+"\n"+"2."+ nazwisko1+"\n"+"3."+ nazwisko2+"\n");
        }else if(czas3 < czas1 && czas3 < czas2 && czas2<czas1){
            System.out.println("1."+ nazwisko3+"\n"+"2."+ nazwisko2+"\n"+"3."+ nazwisko1+"\n");
        }
    }
}

