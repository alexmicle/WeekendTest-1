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


        int max,min;
        if(x>y) {
            max = x;
            min = y;
        }
        else{
            max =y;
            min = x;
        }
        System.out.println(max + "|" + min);
        int sum = max ;
        /*while(y!=0){
            sum +=1;
            y-=1;
        }
        */
        for(int i = 1; i<=min; i++)
        {
            sum +=1;
            SkeletonJava.printConsole("Adding 1 to sum");
        }

        SkeletonJava.printConsole(max + "+" + min + "=" + sum);
    }

}




