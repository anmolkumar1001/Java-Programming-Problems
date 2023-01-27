import java.util.Scanner;
public class CmpTheTriplet {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int alice,bob;
        int[] a = new int[3];
        int[] b = new int[3];

        for(int i=0;i<3;i++)
           a[i] = sc.nextInt();
        for(int i=0;i<3;i++)
           b[i] = sc.nextInt();

        alice = bob = 0;
        for(int i=0;i<3;i++)
        {
            if(a[i] > b[i])
              alice++;
            else if(b[i] > a[i])
              bob++;
        }
        System.out.printf("%d %d" ,alice,bob);

        sc.close();
    }
}
