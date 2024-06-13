package Testy;

public class TravelPlan {
    City destination;
    City start;
    int pricePerUnit;

    public TravelPlan(City destination, City start, int pricePerUnit) {
        this.destination = destination;
        this.start = start;
        this.pricePerUnit = pricePerUnit;
    }

    public void getPlan() {
        double distance=Math.sqrt(Math.pow(destination.x-start.x )+Math.pow(destination.y-start.y))
        System.out.println("Cesta od města  "+start+"  do " + destination );
        System.out.println("Vzdálenost : "+distance);
        System.out.println("Celková cena: "+distance*pricePerUnit);
    }
}
