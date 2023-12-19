package strung;

import java.util.Scanner;

public class Practike1 {
    public static void main(String[] args) {
        //nacti string od uzivatele
        Scanner sc= new Scanner(System.in);
        //zadaj string
        String input= sc.nextLine();
        //je dlouhy alespon 8 znaku
        if (input.length()>7){
            System.out.println("Input OK");
        }

        //overi rodne cislo
        //overi=ynak '/'
        //pocet znaku = 11
        //vypis, zda se jedna o muze/zenu
        String rc= "005209/1245";
        if (rc.charAt(6)=='/') {
            System.out.println("/ je OK");
            if (rc.length()==11){
                System.out.println("Delka OK");
                if (rc.charAt(2)=='0'|| rc.charAt(2)=='1'){
                    System.out.println("Jste muze");
                }else {
                    System.out.println("Jedna se o zenu");
                }
            }
        }




        //pripravit string heslo
        //overit, zda uzivatel heslo uhodl
        String password= "secret";
        System.out.println("ZAdadj heslo");
        input = sc.nextLine();
        if(input.equals(password)){
            System.out.println("spravne heslo");
        }else{
            System.out.println(":)L");
        }


        String[]passwords={"bagr","toi toi","mama mia!"};
        System.out.println("Zadaj heslo: ");
        input= sc.nextLine();
        for (int i = 0; i < passwords.length; i++) {
            if (passwords[i].equals(input)){
                System.out.println("Zadaj jsi spravne heslo");
                break;
            }


        }

        //prevod textu -> velka mala pismena
        //Java je case sensitibe
        //uzivatel zada text, vypis je velkymi pismeny
        System.out.println("zadaj text");
        input=sc.nextLine();
        String upperText= input.toUpperCase();
        System.out.println(input+"byl preveen na"+upperText);



        //porovnejte, zda jsou dve slova stejna bez ohledu na velikost pismen
        //hello ->hELlo budou stejne
        String first = "hello";
        String second = "hELlo";
        System.out.println("Jsou stejne?"+first.equals(second));
        System.out.println("Jsou stejne?"+first.equalsIgnoreCase(second));
        //Alternativni (a zbytecne)




    }
}
