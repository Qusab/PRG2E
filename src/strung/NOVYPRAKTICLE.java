package strung;

public class NOVYPRAKTICLE {
    public static void main(String[] args) {
        int rows = 10;
        int cols = 10;
        int [][] seqens = new int[rows][cols];
        int counter= 1;
        for (int i = 0; i < seqens.length; i++) {
            for (int j = 0; j < seqens[i].length; j++) {
             seqens[i][j]=counter;
              counter++;
            }
            for (int j = 0; j <seqens.length; j++) {
                for (int k = 0; k <seqens[i].length ; k++) {
                    System.out.print(seqens.length +"\t");
                }
            }
        }
    }
}
