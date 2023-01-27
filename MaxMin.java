import java.util.Scanner;
public class MaxMin {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array element: ");
        for(int i=0;i<n;i++)
           arr[i] = sc.nextInt();

        int min = arr[0];
        int max = arr[0];
        for(int i=1;i<=n-1;i++)
        {
            if(arr[i]>max)
               max = arr[i];
            else if(arr[i]<min)
               min = arr[i];
        }
        System.out.println("Min is: " +min);
        System.out.println("Max is: " +max);

        sc.close();
    }
}
