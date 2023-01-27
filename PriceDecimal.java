import java.util.Scanner;
public class PriceDecimal {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            float n;
            int sum;
            System.out.println("Enter the Value of n in Decimal");
            n=sc.nextFloat();
            sum=Math.round(100*n);
            System.out.println("The value in Paise are " + sum);
        }
    }
}
