package TEST;

public class testik2 {
    public static void main(String[] args) {
        int max=100;
        int min=-100;
        int soucet=0;
        int[] pole=new int[20];
        for (int i = 0; i < pole.length; i++) {
            pole[i]=(int)(Math.random()*(max-min+1)+min);
            
        }
    }
}
