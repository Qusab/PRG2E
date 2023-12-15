package TESTSTRING;

import java.util.Scanner;

public class TESsSS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Zadaj heslo");
        String input=sc.nextLine();
        for (int i = 0; i <input.length(); i++) {
            if(input.length()>8) {
                System.out.println("delka je ok");
            }                if (input.charAt(0) !='H') {
                System.out.println("Zacina pismenem 'H'");
            }
                    if (input.contains("*")){
                        System.out.println("Mas znak '*'"+"  Super- je spravně");
                        break;
                    }
            System.out.println("Zkus znovu");
                }
            }


        }

