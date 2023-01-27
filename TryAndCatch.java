import java.util.*;

public class TryAndCatch {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int x,y;
        int res;
        Scanner sc = new Scanner(System.in);
        try
        {
            x = sc.nextInt();
            y = sc.nextInt();
            res = x/y;
            System.out.println(res);
        }
        catch(InputMismatchException e)
        {
            System.out.println("java.util.InputMismatchException");
        }
        catch(ArithmeticException e)
        {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
        sc.close();
        
    }
}
