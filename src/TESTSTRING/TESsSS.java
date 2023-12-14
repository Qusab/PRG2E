package TESTSTRING;

import java.util.Scanner;

public class TESsSS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        System.out.println("Zadaj heslo");
        for (int i = 0; i <input.length(); i++) {
            if(input.length()>8) {
                System.out.println("delka je ok");
            }                if (input.contains("H")) {
                System.out.println("Zacina pismenem 'H'");
            }
                    if (input.contains("*")){
                        System.out.println("Mas znak '*'");
                    }
            System.out.println("Zkus znovu");
                }
            }


        }

