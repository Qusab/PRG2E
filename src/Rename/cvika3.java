package Rename;

import java.util.Scanner;

public class cvika3 {
    public static void main(String[] args) {
        int random=(int)(Math.random()*101);
        Scanner sc=new Scanner(System.in);
       int tip=-1;
        System.out.println(random);
        System.out.println("napis cislo v rozmezi od 1 do 100");
        while (tip!=random){
            System.out.println("zadaj cislo");
            tip=sc.nextInt();
            if(tip<random){
                System.out.println("cislo je male");
            } else if (tip>random) {
                System.out.println("cislo je velke");

            }else {
                System.out.println("Spracne");
            }
        }
    }
}
