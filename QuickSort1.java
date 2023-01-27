import java.util.Scanner;
import java.util.Random;
public class QuickSort1 {
    static int partition(int a[], int low, int high)
    {
        int key=a[low],i=low,j=high,temp;
        while(i<j)
        {
            while(i<=high && key>=a[i])
                i=i+1;
            while(key<=a[j] && j>low)
                j=j-1;
            if(i<j)
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        a[low]=a[j];
        a[j]=key;
        return j;
    }
    static void quicksort(int a[], int low, int high)
    {
        if(low>high)
          return;
        int k=partition(a, low, high);
        quicksort(a, low, k-1);
        quicksort(a, k+1, high);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int n,ch,i;
        System.out.println("Enter the length of the array: ");
        n=sc.nextInt();
        int a[] = new int[50000];
        // sc.close();
        while(true)
        {
            System.out.println("Enter the choice\n 1.Best Case\n2.Average Case\n3.Wrost Case");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1: System.out.println("Best Case: ");
                for(i=0;i<n;i++)
                   a[i]=i+1;
                   break;
                case 2: System.out.println("Average Case: ");
                for(i=0;i<n;i++)
                   a[i]=ran.nextInt();
                   break;
                case 3: System.out.println("Wrost Case: ");
                for(i=0;i<n;i++)
                   a[i]=n-1;
                   break;
                case 4:System.out.println("Exit");
                    System.exit(0);
            }
        
        
        long start=System.nanoTime();
        quicksort(a, 0, n);
        long stop=System.nanoTime();
        System.out.println(stop-start);
        sc.close();
        }
    }
    
}
