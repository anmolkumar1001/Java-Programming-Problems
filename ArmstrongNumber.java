import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int rem;
        int result = 0;
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        
        int num = n;
        while(num > 0)
        {
            rem = num % 10;
            result = result + rem*rem*rem;
            num = num / 10;
        }

        if(result == n)
           System.out.println("Armstrong Number");
        else
           System.out.println("Not Armstrong Number");
        sc.close();
    }
}
