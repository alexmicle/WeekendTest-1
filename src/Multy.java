/**
 * Created by alexm on 2/25/2017.
 */
public class Multy {

    public static int prod(int x, int y) {

        int max, min;
        if (x > y) {
            max = x;
            min = y;
        } else {
            max = y;
            min = x;
        }
        System.out.println(max + "|" + min);
        int prod = max;
        /*while(y!=0){
            sum +=1;
            y-=1;
        }
        */
        for (int i = 1; i < min; i++) {
            prod += max;
            SkeletonJava.printConsole("Adding:" + max + " counter:" + i);
        }

        return prod;
    }

}
