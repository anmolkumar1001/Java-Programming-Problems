import java.util.Scanner;
public class NumberLineJump {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int v1 = sc.nextInt();
        int x2 = sc.nextInt();
        int v2 = sc.nextInt();
        int rem = (x1 - x2) % (v2 - v1);

        if(v1 > v2)
        {
            if(rem == 0)
              System.out.println("Yes");
            else
              System.out.println("No");       
        }
        sc.close();
    }
}
