package POLE;

import java.util.Arrays;
import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
            int[] pole = new int[10];
            Scanner sc=new Scanner(System.in);

            // Přidání mého vlastního čísla do pole
        System.out.println("zadaj cisla");
        for (int i = 5; i < pole.length; i++) {
            pole[i]= sc.nextInt();
        }
            // Výpis obsahu pole
            System.out.println("Obsah pole:" + Arrays.toString(pole));


        }
    }

