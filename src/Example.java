/**
 * @author flo
 * @since 25/02/2017.
 */
public class Example {
    public static void main(String[] thisIsAnArgument) {
        System.out.println("Good bye!");

        int suma = Calc.add(2, 3);
        System.out.println(suma);  //5

        double x = SkeletonJava.readIntConsole("x=");
        //int y = SkeletonJava.readIntConsole("y=");

        //int sum = Calc.add2(x, y);
        //int dif = Substract.sub(x,y);
        //int prod = Multy.prod(x,y);
        //SkeletonJava.printConsole(x + "+" + y + "=" + sum);
        //SkeletonJava.printConsole(x + "-" + y + "=" + dif);
        //SkeletonJava.printConsole(x + "*" + y + "=" + prod);

        //SkeletonJava.printConsole(Conversion.conv(x));
        SkeletonJava.printConsole(Conversion.fToc(x));
    }

}




