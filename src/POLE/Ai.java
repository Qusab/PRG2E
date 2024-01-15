package POLE;

import java.util.Scanner;

public class Ai {




        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введіть довжину масиву:");
            int length = scanner.nextInt();
            int[] array = new int[length];

            System.out.println("Введіть елементи масиву:");
            for (int i = 0; i < length; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.println("Введіть значення для пошуку:");
            int value = scanner.nextInt();

            int count = 0;
            System.out.println("Індекси:");
            for (int i = 0; i < length; i++) {
                if (array[i] == value) {
                    System.out.println(i);
                    count++;
                }
            }

            System.out.println("Всього входжень: " + count);
        }
    }



