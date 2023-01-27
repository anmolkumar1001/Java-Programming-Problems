import java.util.Scanner;
public class MiniMaxSum {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        int min = arr[0];
        int max = arr[0];
        for(int i=1; i<n; i++)
        {
            if(arr[i] > max)
              max = arr[i];
            if(arr[i] < min)
              min = arr[i];
        }
        System.out.printf("%d %d" ,sum - min, sum - max);
        
        sc.close();
    }
}
