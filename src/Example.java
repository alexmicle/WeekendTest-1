/**
 * @author flo
 * @since 25/02/2017.
 */
public class Example {
    public static void main(String[] thisIsAnArgument) {
        System.out.println("Good bye!");

        int suma = Calc.add(2, 3);
        System.out.println(suma);  //5

        int x = SkeletonJava.readIntConsole("x=");
        int y = SkeletonJava.readIntConsole("y=");

        int sum = x ;
        /*while(y!=0){
            sum +=1;
            y-=1;
        }
        */
        for(int i = 1; i<=y; i++)
        {
            sum +=1;
        }

        SkeletonJava.printConsole(x + "+" + y + "=" + sum);
    }

}




