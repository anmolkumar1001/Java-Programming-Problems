import java.util.Scanner;
public class Fibonnaci {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int f = 0,g = 1;
        int n;

        System.out.println("Enter the number for fibonnaci series: ");
        n = sc.nextInt();

        for(int i=0;i<=n;i++)
        {
            System.out.println(f);
            f = f + g;
            g = f - g;

        }
        sc.close();
    }
    
}
