package strung;

import java.util.Arrays;
import java.util.Scanner;

public class PRACTICLE1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //uzivatel zada nayev pisnickich,autora, rok vylani
        //vse ulizime do jednodzchich retezcu
        String input="Dream on;Aerosmith;(1973)";
        String songName;
        String author;
        String yearOfRelase;




        //ukazka-split
        String [] SplitSong= input.split(";");
        System.out.println(Arrays.toString(SplitSong));
        songName=SplitSong[0];
        author=SplitSong[1];
        yearOfRelase=SplitSong[2];
        System.out.println("Song"+ songName+ "comprosed by"+author+"in"+yearOfRelase);
        String greetings="Hello beatifil world";
        String[]words=greetings.split(" ");
        System.out.println(Arrays.toString(words));



        //ukazka-substring
        String word="hello";
        String subWorld= word.substring(0,4);
        //interval:vsechny znaky na indexu <0,4)
        System.out.println(word+"  ->"+subWorld);




         //vezmi string ve kterm je cislo a pricti k tomu 42
        String number="450";
        int actualNumber=Integer.parseInt(number);
        System.out.println("number is "+ actualNumber);
        System.out.println("Soucet je "+(actualNumber+42));
    }
}
