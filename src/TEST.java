import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        //ukol 1
        int[][] vysledky= {
                {30,45,30,30},
                {25,10,45,10},
                {20,14,13,20},
        };
        int count = 0;
        for (int i = 0; i < vysledky.length; i++) {
            // Vytvoříme proměnnou pro součet recenzí
            double sum = 0;

            // Projdeme každou recenzi v
            for (int j = 0; j < vysledky[i].length; j++) {
                // Přičteme recenzi k součtu
                sum += vysledky[i][j];
            }

            // Vypočteme průměrné
            double average = sum ;

            // Porovnáme  s hodnotou 30
            if (average >= 30) {
                // Zvýšíme počet
               count++;
            }
        }
        // Vypíšeme počet zaku
       System.out.println("Tolik žaky prošlo " + count);





        //ukol 2
        int[][] prvek={
                {1,5,7,1},
                {1,5,7,9},
                {2,3,7,4},
                {10,20,160,20}
        };
        System.out.println("Printing column:");
        //uzivatel zada cislo sloupce, vypises sloupec
       String in = JOptionPane.showInputDialog("Zadej cislo sloupce");
        int col = Integer.parseInt(in);
        int nej=0;
        for (int i = 0; i < prvek.length; i++) {
            System.out.println(prvek[i][col-1]);
            nej =prvek[i][col-1];
        }
        System.out.println("nejmensi cislo v sloupcu  "+ col+" je "+nej );









        //ukol 3
        ArrayList<String> hesla=new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
                String PENIS ="";
        System.out.println("Zadejte hesla (nebo 'konec' pro ukončení):");
                do {
                    PENIS = scanner.nextLine();
                    if (!PENIS.equals("konec")) {
                        hesla.add(PENIS);
                    }
                } while (!PENIS.equals("konec"));
        for (String noun : hesla) {
                    if (noun.contains("*") && noun.length()==8) {
                        System.out.println("zadal jsi(a je to spravne )"+noun);
                    }
                }


































    }
}
