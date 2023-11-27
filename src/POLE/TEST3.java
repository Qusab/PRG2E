package POLE;

import java.util.Arrays;

public class TEST3 {
        public static void main(String[] args) {
            int[] poleCisel = {4, 9, 36, 100, 400,};
            double[] poleOdmocnin = new double[poleCisel.length];

            for (int i = 0; i < poleCisel.length; i++) {
                poleOdmocnin[i] = Math.sqrt(poleCisel[i]);
            }

            System.out.println("Pole čísel: " + Arrays.toString(poleCisel));
            System.out.println("Pole odmocnin: " + Arrays.toString(poleOdmocnin));
        }
    }

