import java.util.Scanner;
public class LargestOfThreeNum {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter three Numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a>b && a>c)
        {
            System.out.println("Largest Number is " +a);
        }
        else if(b>c)
        {
            System.out.println("Largest Number is " +b);
        }
        else
        {
            System.out.println("Largest Number is " +c);
        }
        sc.close();
    }
}
