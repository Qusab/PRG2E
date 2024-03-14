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






//Napište metodu, která vráơ sumu všech cifer v čísle. Metoda může vypadat například takto:
//digitsSum(int number), kde uživatel například zadá číslo 456 a výsledek je 15 (4+5+6).

//    public class Main {
//        public static void main(String[] args) {
//            int number = 456;
//            int sum = digitsSum(number);
//            System.out.println("Součet cifer čísla " + number + " je: " + sum);
//        }
//
//        public static int digitsSum(int number) {
//            int sum = 0;
//            while (number != 0) {
//                sum += number % 10; // Získáme poslední číslici a přičteme ji k sumě
//                number /= 10; // Odstraníme poslední číslici
//            }
//            return sum;
//        }
//    }





//Napište metodu hosts(String ip), která přebere IP adresu ve formátu např. 192.168.1.8/24.
//Zjistěte číslo prefixu (v tomhle případě /24) a spočtěte a přes metodu vraťte počet možných
//adres ze sítě (v případě /24 je to 256 [což je 28
//] možností: 192.168.1.0-255).
//Předpokládejte uživatele, který vždy zadá korektní IP, kontrolu vstupu neřešte.

//    public class Main {
//        public static void main(String[] args) {
//            String ip = "192.168.1.8/24";
//            int possibleHosts = hosts(ip);
//            System.out.println("Počet možných hostů v síti je: " + possibleHosts);
//        }
//
//        public static int hosts(String ip) {
//            String[] parts = ip.split("/");
//            String[] ipParts = parts[0].split("\\.");
//            int prefix = Integer.parseInt(parts[1]);
//            int suffix = 32 - prefix; // Počet bitů pro hosty
//            int possibleHosts = (int) Math.pow(2, suffix);
//            return possibleHosts;
//        }
//    }




//    Bonus:
//    Příklad 7 upravte do prakƟčtější podoby:
//    a) V počtu dostupných adres v síƟ by dvě měly být rezervovány. Adresa pro broadcast a
//    adresa pro výchozí bránu. Upravte příklad tak, aby vracel korektní počet.
//    b) Do konzole vypište i informaci, do jaké třídy IP adresa spadá (A-E).
//    c) Do konzole vypište masku v podobě uvedené např ve Windows: /24 má masku
//255.255.255.0






    //public class Main {
    //    public static void main(String[] args) {
    //        String ip = "192.168.1.8/24";
    //        int[] result = hosts(ip);
    //        int possibleHosts = result[0];
    //        int[] subnetMask = result[1];
    //        char classType = getClassType(ip);
    //
    //        System.out.println("Počet možných hostů v síti (bez broadcast a výchozí brány): " + possibleHosts);
    //        System.out.println("Třída IP adresy: " + classType);
    //        System.out.print("Maska sítě: ");
    //        for (int i = 0; i < subnetMask.length; i++) {
    //            System.out.print(subnetMask[i]);
    //            if (i < subnetMask.length - 1)
    //                System.out.print(".");
    //        }
    //        System.out.println();
    //    }
    //
    //    public static int[] hosts(String ip) {
    //        String[] parts = ip.split("/");
    //        String[] ipParts = parts[0].split("\\.");
    //        int prefix = Integer.parseInt(parts[1]);
    //        int suffix = 32 - prefix;
    //        int possibleHosts = (int) Math.pow(2, suffix) - 2; // Počet možných hostů bez broadcast a výchozí brány
    //
    //        int[] subnetMask = calculateSubnetMask(prefix);
    //
    //        int[] result = {possibleHosts, subnetMask};
    //        return result;
    //    }
    //
    //    public static int[] calculateSubnetMask(int prefix) {
    //        int[] subnetMask = new int[4];
    //        for (int i = 0; i < 4; i++) {
    //            if (prefix >= 8) {
    //                subnetMask[i] = 255;
    //                prefix -= 8;
    //            } else {
    //                subnetMask[i] = (int) (256 - Math.pow(2, 8 - prefix));
    //                prefix = 0;
    //            }
    //        }
    //        return subnetMask;
    //    }
    //
    //    public static char getClassType(String ip) {
    //        String[] ipParts = ip.split("\\.");
    //        int firstOctet = Integer.parseInt(ipParts[0]);
    //        if (firstOctet >= 1 && firstOctet <= 126)
    //            return 'A';
    //        else if (firstOctet >= 128 && firstOctet <= 191)
    //            return 'B';
    //        else if (firstOctet >= 192 && firstOctet <= 223)
    //            return 'C';
    //        else if (firstOctet >= 224 && firstOctet <= 239)
    //            return 'D';
    //        else
    //            return 'E';
    //    }
    //}






}
