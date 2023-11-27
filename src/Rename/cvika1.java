package Rename;

import java.util.Scanner;

public class cvika1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            int input = 0;

            while (input != -1) {
                System.out.print("Введіть число (або -1 для завершення): ");
                input = scanner.nextInt();

                if (input != -1) {
                    sum += input;
                }
            }

            System.out.println("Сума введених чисел: " + sum);
        }
    }
