package PDF2;

import java.util.Scanner;

public class ZAD17aka18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Czy któraś z osób jest na diecie wegetariańskiej: ");
        String weget = input.nextLine().toLowerCase();

        System.out.println("Czy któraś z osób jest na diecie  wegańskiej: ");
        String wege = input.nextLine().toLowerCase();

        System.out.println("Czy któraś z osób jest na diecie  bezglutenowej: ");
        String bezg = input.nextLine().toLowerCase();


        if(weget.equals("tak") && wege.equals("nie") && bezg.equals("nie")) {
            System.out.println("Możecie wybrać się do nastepujących restauracji:"+ "\n" +  "Włoskie Specjały" + "\n" +  "Kawiarnia na Rogu" + "\n"+  "Kuchnia u Szefa" + "\n"+  "Pizzeria przy dworcowej" + "\n");
        }else if(weget.equals("tak") && wege.equals("tak") && bezg.equals("tak")) {
            System.out.println("Możecie wybrać się do nastepujących restauracji:"+ "\n" +  "Kawiarnia na Rogu" + "\n"+  "Kuchnia u Szefa" + "\n");

        }
        else if(weget.equals("nie") && wege.equals("nie") && bezg.equals("nie")) {

            System.out.println("Możecie wybrać się do nastepujących restauracji:"+ "\n" +  "Włoskie Specjały" + "\n" +  "Kawiarnia na Rogu" + "\n"+  "Kuchnia u Szefa" + "\n"+  "Pizzeria przy dworcowej" + "\n" +  "Luksusowe Burgery u Jarka" + "\n");
        }else if(weget.equals("tak") && wege.equals("nie") && bezg.equals("tak")) {

            System.out.println("Możecie wybrać się do nastepujących restauracji:"+ "\n"  +  "Kawiarnia na Rogu" + "\n"+  "Kuchnia u Szefa" + "\n"+  "Pizzeria przy dworcowej" + "\n");
        }else if(weget.equals("nie") && wege.equals("tak") && bezg.equals("tak")) {

            System.out.println("Możecie wybrać się do nastepujących restauracji:"+ "\n" +  "Kawiarnia na Rogu" + "\n"+  "Kuchnia u Szefa" + "\n");
        } else if(weget.equals("nie") && wege.equals("tak") && bezg.equals("nie")) {

            System.out.println("Możecie wybrać się do nastepujących restauracji:"+ "\n" +  "Kawiarnia na Rogu" + "\n"+  "Kuchnia u Szefa" + "\n");
        }






    }

}



