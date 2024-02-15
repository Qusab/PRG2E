import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;



public class Domaci_ukol {
    public static void main(String[] args) {
        //ukol 1
//        ArrayList<Integer> BigPenis =new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            BigPenis.add(i+1);
//        }
//        //або використовувати Collections.reverse(numbers);
//        //та просто виписати
//        for (int i = BigPenis.size() - 1; i >= 0; i--) {
//            System.out.println(BigPenis.get(i));
//        }


        //ukol 2
//        int [][] smallPenis= {
//                {1,2,3,4,5},
//                {6,7,8,9,10,},
//                {11,12,13,14,15},
//                {16,17,18,19,20},
//                {21,22,23,24,25}
//        };
//
//        System.out.println("Printing column:");
//        //uzivatel zada cislo sloupce, vypises sloupec
//        String input = JOptionPane.showInputDialog("Zadej cislo sloupce");
//        int col = Integer.parseInt(input);
//        int sum=0;
//        for (int i = 0; i < smallPenis.length; i++) {
//            System.out.println(smallPenis[i][col-1]);
//            sum +=smallPenis[i][col-1];
//        }
//        System.out.println("suma v sloupcu  "+ col+" je "+ sum);


        //ukol 3


//                // Připravíme ArrayList pro řetězce španělských podstatných jmen
//                ArrayList<String> spanishNouns = new ArrayList<String>();
//
//                // Uživatel bude zadávat řetězce
//                Scanner scanner = new Scanner(System.in);
//                String input;
//        System.out.println("Zadejte španělské podstatné jméno (nebo 'fin' pro ukončení):");
//                do {
//                    input = scanner.nextLine();
//                    if (!input.equals("fin")) {
//                        spanishNouns.add(input);
//                    }
//                } while (!input.equals("fin"));
//
//                // Vypíšeme všechny řetězce se španělským členem
//                for (String noun : spanishNouns) {
//                    if (noun.startsWith("el ") || noun.startsWith("la ") || noun.startsWith("un ")) {
//                        System.out.println("zadal jsi(a je to spravne )"+noun);
//                    }
//                }


        //ukol 4


//                // Створюємо ArrayList для випадкових чисел
//                ArrayList<Integer> numbers = new ArrayList<Integer>();
//
//                // Генеруємо 100 випадкових чисел від 0 до 100
//        for (int i = 0; i < 100; i++) {
//            int randomNumber = (int) (Math.random() * 100 + 1);
//            numbers.add(randomNumber);
//        }
//
//
//
//
//        // Видаляємо всі числа менше 50
//                int count = 0;
//                for (int i = 0; i < numbers.size(); i++) {
//                    if (numbers.get(i) <= 50) {
//                        numbers.remove(i);
//                        i--; // Зменшуємо індекс, щоб врахувати видалений елемент
//                        count++;
//                    }
//                }
//
//                // Виводимо в консоль, скільки чисел було видалено, та вміст списку після видалення
//                System.out.println("Було видалено " + count + " чисел.");
//                System.out.println("Вміст списку після видалення: " + numbers);


        //ukol 5
//        double[][] recenze = {
//                {1, 5, 3, 2, 6},
//                {4, 5, 2, 5, 6},
//                {9, 9, 7, 8, 9},
//                {3, 3, 1, 1, 2}
//        };
//        int count = 0;
//
//        // Projdeme každý film v 2D poli
//        for (int i = 0; i < recenze.length; i++) {
//            // Vytvoříme proměnnou pro součet recenzí pro daný film
//            double sum = 0;
//
//            // Projdeme každou recenzi v daném filmu
//            for (int j = 0; j < recenze[i].length; j++) {
//                // Přičteme recenzi k součtu
//                sum += recenze[i][j];
//            }
//
//            // Vypočteme průměrné skóre pro daný film
//            double average = sum / recenze[i].length;
//
//            // Porovnáme průměrné skóre s hodnotou 7.5
//            if (average > 7.5) {
//                // Zvýšíme počet filmů
//                count++;
//            }
//        }
//
//        // Vypíšeme počet filmů na konzoli
//        System.out.println("Počet filmů s průměrným skóre > 7.5 je: " + count);




        //bonus



              Scanner scanner = new Scanner(System.in);

                // Rozšíření 1: Uživatel zadává délku strany hracího pole
                System.out.println("Zadejte délku strany hracího pole:");
                int delkaStrany = scanner.nextInt();

                // Rozšíření 2: Uživatel zadává počet hledaných pokladů
                System.out.println("Zadejte počet hledaných pokladů:");
                int pocetPokladu = scanner.nextInt();

                char[][] hraciPole = new char[delkaStrany][delkaStrany];
                boolean[][] poklady = new boolean[delkaStrany][delkaStrany];

                // Inicializace hracího pole a umístění pokladů
                for (int i = 0; i < delkaStrany; i++) {
                    for (int j = 0; j < delkaStrany; j++) {
                        hraciPole[i][j] = '-';
                        poklady[i][j] = false;
                    }
                }
                for (int k = 0; k < pocetPokladu; k++) {
                    int randomRow = (int) (Math.random() * delkaStrany);
                    int randomCol = (int) (Math.random() * delkaStrany);
                    poklady[randomRow][randomCol] = true;
                }

                int pokusy = 0;
                while (true) {
                    // Vykreslení hracího pole
                    for (int i = 0; i < delkaStrany; i++) {
                        for (int j = 0; j < delkaStrany; j++) {
                            System.out.print(hraciPole[i][j] + " ");
                        }
                        System.out.println();
                    }

                    // Uživatel zadává souřadnice pole
                    System.out.println("Zadejte souřadnice pole (řádek sloupec):");
                    int radek = scanner.nextInt();
                    int sloupec = scanner.nextInt();

                    // Kontrola platnosti souřadnic
                    if (radek < 0 || radek >= delkaStrany || sloupec < 0 || sloupec >= delkaStrany) {
                        System.out.println("Neplatné souřadnice. Zadejte prosím platné souřadnice.");
                        continue;
                    }

                    // Zkontrolovat, zda je pole s pokladem
                    if (poklady[radek][sloupec]) {
                        System.out.println("Gratulujeme! Našli jste poklad!");
                        break;
                    } else {
                        System.out.println("Smůla! Poklad není na tomto poli.");
                        hraciPole[radek][sloupec] = 'o';
                        pokusy++;
                    }
                }

                System.out.println("Počet pokusů: " + pokusy);
                scanner.close();













    }
}




    















