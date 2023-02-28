package PDF2;

import java.util.Scanner;

public class ZAD12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Wprowadź jedno z trzech słów (powietrze, woda, stal): ");
        String slowo = input.nextLine();

        System.out.println("Wprowadź odległość do przebycia (m): ");
        double odl = input.nextDouble();

double czasP = odl/343;
double czasW = odl/1490;
double czasS = odl/5100;


        if(slowo.equals("powietrze")){
            System.out.println("Czas potrzebny do pokonania przez dźwięk odległośći w powietrzu wynosi:  " + czasP +" sekund \n");
        } else if (slowo.equals("woda")) {
            System.out.println("Czas potrzebny do pokonania przez dźwięk odległośći w wodzie wynosi:  " + czasW +" sekund \n");
        }else if (slowo.equals("stal")) {
            System.out.println("Czas potrzebny do pokonania przez dźwięk odległośći w stali wynosi:  " + czasS +" sekund \n");
        }


    }
    }


