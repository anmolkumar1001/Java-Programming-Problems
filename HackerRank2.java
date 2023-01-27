import java.util.Scanner;
import java.lang.Math;
public class HackerRank2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        { 
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int c = a;
            for(int j=0;j<n;j++)
            {
                c += Math.pow(2,j)*b;
                System.out.printf("%d ",c);
            }
            System.out.println();
        }
        sc.close();  
    }
}
