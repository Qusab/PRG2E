package strung;

import java.util.HashMap;
import java.util.Scanner;

public class Domaciukol {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        //Є масив users, одна змінна userName. Вивести, чи є в масиві користувач з заданим іменем і вивести результат.
//        System.out.println("Napis jmeno usera");
//        String[] user={"userName"};
        String uzivatel=sc.nextLine();
//        for (int i = 0; i < user.length; i++) {
//            if(uzivatel.equals(user[i])){
//                System.out.println("Spravne! Mama takoviho clvecka");
//            }else {
//                System.out.println("Skus znovu, tvuj pokus-  "+uzivatel+"   neplatni");
//            }





                // Закодовані символи Морзе для літер англійської абетки
//                HashMap<Character, String> morseCode = new HashMap<>();
//                morseCode.put('A', ".-");
//                morseCode.put('B', "-...");
//                morseCode.put('C', "-.-.");
//                morseCode.put('D', "-..");
//                morseCode.put('E', ".");
//                morseCode.put('F', "..-.");
//                morseCode.put('G', "--.");
//                morseCode.put('H', "....");
//                morseCode.put('I', "..");
//                morseCode.put('J', ".---");
//                morseCode.put('K', "-.-");
//                morseCode.put('L', ".-..");
//                morseCode.put('M', "--");
//                morseCode.put('N', "-.");
//                morseCode.put('O', "---");
//                morseCode.put('P', ".--.");
//                morseCode.put('Q', "--.-");
//                morseCode.put('R', ".-.");
//                morseCode.put('S', "...");
//                morseCode.put('T', "-");
//                morseCode.put('U', "..-");
//                morseCode.put('V', "...-");
//                morseCode.put('W', ".--");
//                morseCode.put('X', "-..-");
//                morseCode.put('Y', "-.--");
//                morseCode.put('Z', "--..");
//
//                Scanner scanner = new Scanner(System.in);
//                System.out.print("Введіть текст для конвертації на Морзе: ");
//                String inputText = scanner.nextLine().toUpperCase(); // Переводимо великі літери
//
//                StringBuilder morseResult = new StringBuilder();
//                for (char character : inputText.toCharArray()) {
//                    if (Character.isLetter(character)) {
//                        // Якщо символ - літера, конвертуємо її на Морзе
//                        morseResult.append(morseCode.get(character)).append(" ");
//                    } else if (character == ' ') {
//                        // Якщо символ - пробіл, додаємо простий пробіл у результат
//                        morseResult.append(" ");
//                    }
//                    // Інші символи ігноруються
//                }
//
//                System.out.println("Результат конвертації на Морзе: " + morseResult.toString().trim());








//                // 6. Виведення числа задом наперед
//        int number = 123456789;
//        int reversedNumber = 0;
//        while (number != 0) {
//            int digit = number % 10;
//            reversedNumber = reversedNumber * 10 + digit;
//            number /= 10;
//        }
//        System.out.println(reversedNumber);


// 5. Знаходження найбільшого імені у масиві
//        String[] names = {"Jan", "Karel", "FranƟšek Dlouhojmenný", "Pablo Diego José Francisco de Paula Juan Nepomuceno María de los Remedios Cipriano de la Sanơsima Trinidad Ruiz y Picasso", "Eva"};
//        String longestName = "";
//        for (String name : names) {
//            if (name.length() > longestName.length()) {
//                longestName = name;
//            }
//        }
//        System.out.println(longestName);




// 2. Знаходження подвійних літер
//        String text = "Halloween";
//        boolean hasDuplicateLetters = false;
//        for (int i = 0; i < text.length(); i++) {
//            char currentChar = text.charAt(i);
//            if (text.indexOf(currentChar) != text.lastIndexOf(currentChar)) {
//                hasDuplicateLetters = true;
//                break;
//            }
//        }
//        System.out.println(hasDuplicateLetters);




        // 3. Переведення літер у верхній або нижній регістр залежно від парності індексу
//        String oppositeCase = "OppositeCase";
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < oppositeCase.length(); i++) {
//            char currentChar = oppositeCase.charAt(i);
//            if (i % 2 == 0) {
//                result.append(Character.toUpperCase(currentChar));
//            } else {
//                result.append(Character.toLowerCase(currentChar));
//            }
//        }
//        System.out.println(result.toString());







        // 4. Підрахунок слів у рядку
//        String words = "To be or not to be, that is the question.";
//        int wordCount = 0;
//        boolean inWord = false;
//        for (char c : words.toCharArray()) {
//            if (Character.isWhitespace(c)) {
//                inWord = false;
//            } else if (!inWord) {
//                inWord = true;
//                wordCount++;
//            }
//        }
//        System.out.println(wordCount);





        // Бонус: Паліндром
        String palindromeText = "radar";
        boolean isPalindrome = true;
        for (int i = 0; i < palindromeText.length() / 2; i++) {
            if (palindromeText.charAt(i) != palindromeText.charAt(palindromeText.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);


            }
        }






