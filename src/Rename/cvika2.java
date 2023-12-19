package Rename;

import java.util.Scanner;

public class cvika2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Napis cislo,faktorial ktereho chces");
        int n= sc.nextInt();
        long factorial=1;
        if(n<0){
            System.out.println("factorial nelze pocitat");
        }else {
            for (int i = 1; i <= n; i++) {
                factorial *= i;
                ;
            }
            System.out.println("Factorial cisla:   "+ n+ "   je   "+factorial);
        }

    }
}
