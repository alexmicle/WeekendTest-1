/**
 * Created by alexm on 2/25/2017.
 */
public class MaxFromRead {


    public static void main(String[] args) {

        int n = SkeletonJava.readIntConsole("How many numbers?");

        int max = SkeletonJava.readIntConsole("Give me a number!");
        for(int i =0; i<n-1; i++)
        {

            int read = SkeletonJava.readIntConsole("Give me a number!");
            if(read > max){
                max = read;
            }


        }

        System.out.println(max);
    }
}
