package methods;

import java.time.LocalDate;

public class TEsT {
    //napiste metodu, která převrzme hodnoty dvou datumů v textové podobě.
    //Metoda nic nevratí a do konzole vypise, ktery ze dvou dat je novejsi
    //newerDate(String date,String otherDate)
    public static void newerDate(String date, String otherDate) {
        LocalparsedDate = LocalDate.parse(date);
        LocalDate parsedOtherDate = LocalDate.parse(otherDate);

        if (parsedDate.isAfter(parsedOtherDate)) {
            System.out.println(date + " je novější než " + otherDate);
        } else if (parsedDate.isBefore(parsedOtherDate)) {
            System.out.println(otherDate + " je novější než " + date);
        } else {
            System.out.println("Obě data jsou stejně nová");
        }
    }



    //napiste metodu timeValues(String[] times),ktera přijme pole řetezců, ktere obsahuji časove honoty.
    //Tato metodu vrati hodnotu součtu všech prvků převedenych na vteřiny
    //Př: vstup={"2:30","1:00"...} vrati 210(150+60)
         public static void timeValues(String[] times){
             String[] cas;
            for (int i = 0; i < ; i++) {

            }
            }


            static void Price(int pocet, int cenaZaKus, int vyska, int sirka){

            int price= pocet*cenaZaKus;
            if (pocet>10){
                price+=price*0.15;
            }
                System.out.println("Za palety velikostí    " + vyska "x" + sirka "   je "+price );
            }
        }

        }

