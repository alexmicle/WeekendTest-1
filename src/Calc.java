/**
 * @author flo
 * @since 25/02/2017.
 */
public class Calc {
    public static int add(int cucurigu, int b) {
        return cucurigu + b;
    }


    public static int add2(int x, int y) {

        int max, min;
        if (x > y) {
            max = x;
            min = y;
        } else {
            max = y;
            min = x;
        }
        System.out.println(max + "|" + min);
        int sum = max;
        /*while(y!=0){
            sum +=1;
            y-=1;
        }
        */
        for (int i = 1; i <= min; i++) {
            sum += 1;
            SkeletonJava.printConsole("Adding 1 to sum");
        }

        return sum;
    }

}
