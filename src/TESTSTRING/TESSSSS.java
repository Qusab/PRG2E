package TESTSTRING;

public class TESSSSS {
    public static void main(String[] args) {
        String[] spanishPhrases = {"El Camino", "La Bomba", "Elephant", "Lancelot"};
        for (int i = 0; i < spanishPhrases.length; i++) {
            if (spanishPhrases[i].contains("el")) {
                if (spanishPhrases[i].contains("la")){
                    System.out.println(spanishPhrases[i]);
                    break;
                }
            }
            }
        }
    }