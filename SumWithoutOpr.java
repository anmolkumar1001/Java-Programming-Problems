import java.util.Scanner;
public class SumWithoutOpr {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int a,b;
        a=scan.nextInt();
        b=scan.nextInt();
        
        while(b!=0) //repeat first step untill b becomes zero
        {
            //first step
            a++;
            b--;
        }
        System.out.println(a);
        scan.close();
    }
}
