import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String args[])
    {
        int a,b;
        float res;
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input Dividend(a)");
            a=sc.nextInt();
            System.out.println("Input Divisor(b)4");
            b=sc.nextInt();
            res=a/b;
            System.out.println("Quotient is = " +res);
            sc.close();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by zero error\n" +e);
        }
    }
}
