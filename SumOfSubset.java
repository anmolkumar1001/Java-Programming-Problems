import java.util.Scanner;
public class SumOfSubset
{
    int[] w;
    int[] x;
    int sum;
    int total;
    public void process()
    {
        getData();
        System.out.println("The Subsets are: ");
        subset(0,1,total);
    }
    private void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        w = new int[n+1];
        x = new int[n+1];
        System.out.println("Enter " + n + " Element");
        for(int i=1; i<n+1; i++)
        {
            w[i] = sc.nextInt();
            total = total + w[i];
        }
        System.out.println("Enter the sum to be obtained: ");
        sum = sc.nextInt();
        if(total < sum)
        {
            System.out.println("No Possible Subsets");
            System.exit(1);
        }
        sc.close();
    }
    private void subset(int s, int k, int r)
    {
        int i=0;
        x[k] = 1;
        if(s+w[k] == sum)
        {
            System.out.print("(");
            for(i=1;i<=k;i++)
            {
                if(x[i] == 1)
                  System.out.print(" " + w[i]);
            }
            System.out.println(")");
        }
        else if((s+w[k]+w[k+1]) <= sum)
        {
            subset(s+w[k], k+1, r-w[k]);
        }
        if((s+r-w[k]) >= sum && (s+w[k+1]) <= sum)
        {
            x[k] = 0;
            subset(s, k+1, r-w[k]);
        }
    }
    public static void main(String args[])
    {
        new SumOfSubset().process();
    }

}