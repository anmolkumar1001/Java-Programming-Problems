import java.util.Scanner;
public class RotateArray {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
        
        int k = sc.nextInt();
        for(k=1;k<=n;k++)
        {
            for(int i=k;i<n;i++)
            {
                System.out.print(arr[i] + " ");
            }
            for(int i=0;i<k;i++)
            {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
