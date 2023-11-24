package TEST;

import java.util.Arrays;

public class testik {
    public static void main(String[] args) {
        int[]pole=new int[10];
         int pocet=0;
        for (int i = 0; i < pole.length; i++) {
            if(pole[i]<5||pole[i]>20){
                System.out.println(pole[i]+",");
                pocet++;
        }


        }
        System.out.println(pocet+"nelezi v intervalu");
    }
}
