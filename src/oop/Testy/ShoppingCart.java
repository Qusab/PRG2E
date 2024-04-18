package oop.Testy;

public class ShoppingCart {
    public int totalPrice, itemPrice, ;
    double dískount;

    public ShoppingCart( int discount) {
        this.discount = 0,50;
        this.totalPrice=totalPrice;
    }


    void add(int itemPrice) {
        totalPrice += this.itemPrice;
    }

    void remove (int itemPrice){
        if (!(itemPrice>= totalPrice)){
            totalPrice-=this.itemPrice;
        }else {
            System.out.println("Chyba");
        }
    }

    int getPrice(){
        if (totalPrice-discount==0){
            totalPrice-= discount;
        }else if (totalPrice-itemPrice==0){
            totalPrice-=itemPrice;
            }else {
            totalPrice-(totalPrice *0,21);
        }
        return getPrice;
    }


}
