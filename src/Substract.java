/**
 * Created by alexm on 2/25/2017.
 */
public class Substract {

    public static int sub(int x, int y) {

        int max, min;
        if (x > y) {
            max = x;
            min = y;
        } else {
            max = y;
            min = x;
        }
        System.out.println(max + "|" + min);
        int dif = max;
        /*while(y!=0){
            sum +=1;
            y-=1;
        }
        */
        for (int i = 1; i <= min; i++) {
            dif -= 1;
            SkeletonJava.printConsole("Substracting 1 from dif");
        }

        return dif;
    }


}
