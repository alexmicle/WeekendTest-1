/**
 * Created by alexm on 2/25/2017.
 */
public class Conversion {


    public static String conv(int x){

        String a = "";

        int d= x;
        while(d!=0){

            int c = d/2;
            int r = d%2;
            d = c;
            a = a.concat(Integer.toString(r));
        }

        a = new StringBuilder(a).reverse().toString();

        return a;
    }

    public static double fToc(double x){

        double c = (5/9) * (x - 32);

        return c;
    }


}
