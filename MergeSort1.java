import java.util.*;
class Merge
{
    static void simplemerge(int a[], int low, int mid, int high)
    {
        int n = high-low+1;
        int t_a[] = new int [n];
        int k = 0 ,i=low,j=mid+1;
        while(i<=mid && j<=high)
        {
            if(a[i] < a[j])
            {
                t_a[k] = a[i] ;
                i++;
            }
            else{
                t_a[k] = a[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            t_a[k] = a[i];
            i++;k++;
        }
        while(j<=high){
            t_a[k] = a[j];
            j++;k++;
        }
        for(i = 0;i < k;i++)
            a[low+i] = t_a[i];
    }
    //     int n2 = high-mid;
    //     int l[] = new int[n1];
    //     int r[] = new int[n2];
    //     for(int i=0;i<n1;i++)
    //         l[i] = a[low + i];
    //     for(int j=0;j<n2;j++)
    //         r[j] = a[mid + 1 + j];
    //     int i=0,j=0;
    //     int k = low;
    //     while(j<n1 && j<n2)
    //     {
    //         if(l[i]<=r[j])
    //         {
    //             a[k]=l[i];
    //             i++;
    //         }
    //         else
    //         {
    //             a[k]=r[j];
    //             j++;
    //         }
    //         k++;
    //     }
    //     while(i<n1)
    //     {
    //         a[k]=l[i];
    //         i++;
    //         k++;
    //     }
    //     while(j<n2)
    //     {
    //         a[k]=r[j];
    //         j++;
    //         k++;
    //     }
    //}
    static void sorting(int a[], int low, int high)
    {
        if(low<high)
        {
            int mid = (low+high)/2;
            sorting(a, low, mid);
            sorting(a, mid+1, high);
            simplemerge(a, low, mid, high);
        }
    }
    static void display(int a[], int low, int high)
    {
        System.out.println("Sorted elemets are: ");
        for(int i=low;i<=high;i++)
           System.out.println(a[i]);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int n,ch,i;
        System.out.println("Enter the length of array: ");
        n = sc.nextInt();
        int a[] = new int[n];
        while(true)
        {
            System.out.println("Enter your choice\n 1. Best Case\n 2. Average Case\n 3. Wrost Case");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:System.out.println("Best Case: ");
                       for(i=0;i<n;i++)
                           a[i]=i+1;
                           break;
                case 2:System.out.println("Average Case: ");
                        for(i=0;i<n;i++)
                           a[i]=rand.nextInt();
                           break;
                case 3:System.out.println("Wrost Case: ");
                        for(i=0;i<n;i++)
                           a[i]=n-i;
                           break;
                case 4:System.out.println("Exiting");
                       return;
            }
            long start,stop;
            start=System.nanoTime();
            sorting(a, 0, n-1);
            stop=System.nanoTime();
            System.out.println(stop-start);
            // display(a, 0, n-1);
            sc.close();
        }
    }
}