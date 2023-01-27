import java.util.Scanner;
public class HarmonicSeries {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            double i,sum=0.0;
            System.out.println("Enter the Value of n");
            n = sc.nextInt();
            for(i=1;i<=n;i++)
            {
                sum=sum+1/i;
            }
            System.out.println("Sum of Harmonic is " + sum);
        }
        
    }
    
}
