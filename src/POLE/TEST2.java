package POLE;

public class TEST2 {
        public static void main(String[] args) {
            int[] pole = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int soucetSudych = 0;
            int soucetLichych = 0;

            for (int cislo : pole) {
                if (cislo % 2 == 0) {
                    soucetSudych += cislo; // Přidá sudé číslo k součtu sudých čísel
                } else {
                    soucetLichych += cislo; // Přidá liché číslo k součtu lichých čísel
                }
            }

            System.out.println("Součet sudých čísel: " + soucetSudych);
            System.out.println("Součet lichých čísel: " + soucetLichych);
        }
    }

