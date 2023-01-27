import java.util.Scanner;
public class PlusMinus {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
           arr[i] = sc.nextInt();
        sc.close();

        double positive = 0;
        double negative = 0;
        double zero = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] > 0)
            {
                positive = positive + 1;
            }
            else if(arr[i] < 0)
            {
                negative = negative + 1;
            }
            else
            {
                zero = zero + 1;
            }
        }
        System.out.printf("%.6f\n", positive/n);
        System.out.printf("%.6f\n", negative/n);
        System.out.printf("%.6f\n", zero/n);
    }
}
