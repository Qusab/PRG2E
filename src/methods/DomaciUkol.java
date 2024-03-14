package methods;

public class DomaciUkol {
    //1. Napište metodu getMax(int[] array), která ze získaného pole vybere největší prvek a ten
    //následně vráti (analogicky můžete vyzkoušet i nejmenší pro minimum).
//    public static int getMax(int[] array) {
//        int max = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//        return max;
//    }



 //   (analogicky můžete vyzkoušet i nejmenší pro minimum).
//    public static int getMin(int[] array) {
//        int min = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] < min) {
//                min = array[i];
//            }
//        }
//        return min;
//    }


//           2. Napište metodu dayCount(int day, int month), která vráti počet dní od začátku roku do
//datumu. Nezapomeňte, že počet dní v jednotlivých měsících se liší, můžete si proto tedy
//takové hodnotu pro každý měsíc uložit v poli
//Př: Zadám den 5, měsíc 2 -> uběhlo 36 dní (31 + 5)

//    public static int dayCount(int day, int month) {
//        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//        int days = 0;
//
//        for (int i = 0; i < month - 1; i++) {
//            days += daysInMonth[i];
//        }
//        days += day;
//        return days;
//    }




//         Úkol 2 rozšiřte tak, že vytvoříte přidáte do hlavičky metody i údaj o roce, takže hlavička
//metody bude vypadat dayCount(int day, int month, int year). Dále si připravte další metodu
//pro zjištění, zda se jedná o přestupný rok isLeapYear(int year). Tato metoda by měla pouze
//vracet, zda se jedná o přestupný rok (zvolte vhodný datový typ). Tuto metodu následně
//využijte v metodě dayCount(…) a počet dní zohledněte s přestupným rokem.


//public static int dayCount(int day, int month, int year) {
//    int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//    int days = 0;
//
//    for (int i = 0; i < month - 1; i++) {
//        days += daysInMonth[i];
//    }
//
//    days += day;
//
            // Přidání jednoho dne, pokud je rok přestupný a měsíc je 3 nebo vyšší
//    if (isLeapYear(year) && month > 2) {
//        days += 1;
//    }
//    return days;
//}


//           Napište dvě metody pro počítání s trojúhelníkem: isTriangle(int a, int b, int c), která vráơ
//údaj, zda takové strany mohou vůbec tvořit trojúhelník. Dále napište metodu pro výpočet
//obsahu triangleArea(int a, int b, int c), která přechozí metodu využije. Pokud metoda
//isTrinalge(…) vráơ hodnotu false, tak vraťte obsah s hodnotou -1. V případě, že se doopravdy
//jedná o trojúhelník, metody vráơ obsah


//    public static boolean isTriangle(int a, int b, int c) {
//        return a + b > c && a + c > b && b + c > a;
//    }
//    public static double triangleArea(int a, int b, int c) {
//        if (!isTriangle(a, b, c)) {
//            return -1;
//        }
//        double s = (a + b + c) / 2.0;
//        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
//    }







}
