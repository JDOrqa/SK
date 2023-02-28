package PDF3;
import java.util.Scanner;
public class ZAD7 {
    public static void main(String[] args) {
        int suma= 0;
        Scanner input = new Scanner(System.in);
        int liczba;
        for(int i=1;i<=7;i++){
            System.out.print("Podaj liczbę :  ");
            liczba= input.nextInt();
suma += liczba;

        }
        System.out.print(suma + "\n");
    }
}
