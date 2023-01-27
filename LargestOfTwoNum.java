import java.util.Scanner;
public class LargestOfTwoNum {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b;

        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        if(a==b)
           System.out.println("Numbers are same");
        else if(a>b)
           System.out.println(a + " is largest");
        else
           System.out.println(b + " is largest");
        sc.close();
    }
}
