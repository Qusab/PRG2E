package strung;

import java.util.ArrayList;

public class NEW {
    public static void main(String[] args) {
        //VYTVORINI
        ArrayList<Integer> bigArray=new ArrayList<>();
        int a = 5;
        Integer b =10;
        b.toString();
        System.out.println(a+b);
        //ukladani 20 nahodnych cisel
        bigArray.add(10);//prvni volne misto
        bigArray.add(1,10);// na index 1
        for (int i = 0; i < 20; i++) {
            bigArray.add(i+1);
        }
        //vypis varianta 1
        System.out.println(bigArray);
        //vypis varianta 2
        bigArray.get(5);//vytahne prvek na indexu 5
        //tiskani velikostib pole
        for (int i = 0; i < bigArray.size(); i++) {
            System.out.println(bigArray.get(i));
        }
        //otazka obsahuje prvek 5
        bigArray.contains(5);


        //kde je ten prvek
        bigArray.indexOf(15);



        //kde je ten prvek naposled
        bigArray.lastIndexOf(21);



        //odstraneni prvku
        bigArray.clear();//vsech
        for (int i = 0; i < 10; i++) {
            bigArray.add(i*5);
        }
        System.out.println(bigArray);



        bigArray.remove(3);//index odstrani na 3
        bigArray.remove(10);
        System.out.println(bigArray);

        bigArray.isEmpty();//je tam vubec neco
        boolean isEmpty = bigArray.size() ==0;



        ArrayList<Integer> evenBigerArrays = new ArrayList<>();
        System.out.println(evenBigerArrays);
        evenBigerArrays.addAll(bigArray);
        System.out.println(evenBigerArrays);
        for (int i = 0; i <=100 ; i++) {
            evenBigerArrays.add(i);
        }
        System.out.println(bigArray);
        System.out.println(evenBigerArrays);
    }
}
