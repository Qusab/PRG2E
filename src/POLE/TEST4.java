package POLE;

import java.util.Scanner;

public class TEST4 {
    public static void main(String[] args) {
        int [] pole={1, 2, 2, 3, 3, 10, 6, 10,6, 5, 4 ,7, 8, 9};
        Scanner sc=new Scanner(System.in);
        System.out.println("Zadaj hodnotu");
        System.out.println("Vstup je "+sc.nextInt());
        int value= sc.nextInt();
        System.out.println("Vystup");
        int count=0;
        System.out.println("index");
        for (int i = 0; i < pole.length; i++) {
            if (pole[i]==value){
                System.out.println(i);
                count++;
            }
            System.out.println("Vyskytuje se"+count);
        }
    }
}
