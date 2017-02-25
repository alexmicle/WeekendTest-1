/**
 * Created by alexm on 2/25/2017.
 */
public class ArrayExample {

    public static void main(String[] args) {

    /*    int[] arrayInt = {0, 1, 2, 3, 5, 9, 28, 6, 4, 7};
        int[] squares = new int[arrayInt.length];
        int i = 0;
        for (int array2 : arrayInt) {
            squares[i] = array2 * array2;
            i++;
        }
        for (int square : squares) {
            System.out.println(square);
        }*/

        int x = SkeletonJava.readIntConsole("Please input a number:");
        int[] z = evenMax(x);

        for(int y = 0; y<z.length;y++) {
            System.out.println(z[y]);
        }
    }

        public static int[] evenMax(int x){

        int[] arrayMax = new int[x];

        arrayMax[0] = 0;

        for(int i = 1; i<x;i++){

            arrayMax[i]= arrayMax[i-1] + 2;
        }

        return arrayMax;
        }
}
