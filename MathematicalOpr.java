import java.util.Scanner;
public class MathematicalOpr {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b,res;
        System.out.println("Enter two number: ");
        a = sc.nextInt();
        b = sc.nextInt();

        res = a+b;
        System.out.println("Addition is: " +res);

        res = a-b;
        System.out.println("Substraction is: " +res);

        res = a*b;
        System.out.println("Multiplication is: " +res);

        res = a/b;
        System.out.println("Division is: " +res);
        sc.close();
    }
}
