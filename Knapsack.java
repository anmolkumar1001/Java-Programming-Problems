import java.util.Scanner;
public class Knapsack {
    double weight[];
    double benefit[];
    double ratio[];
    double w;
    Knapsack()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of objects: ");
        int n = sc.nextInt();
        weight=new double[n];
        ratio=new double[n];
        benefit=new double[n];
        System.out.println("Enter the object weight: ");
        for(int i=0;i<n;i++)
            weight[i]=sc.nextInt();
        System.out.println("Enter the object profit: ");
        for(int i=0;i<n;i++)
           benefit[i]=sc.nextInt();
        for(int i=0;i<n;i++)
           ratio[i]=benefit[i]/weight[i];
        System.out.println("Enter the capacity of the knapsack: ");
        w=sc.nextInt();

        sc.close();
    }
    int getNext()
    {
        double highest=0;
        int index=-1;
        for(int i=0;i<benefit.length;i++)
        {
            if(ratio[i]>highest)
            {
                highest=ratio[i];
                index=i;
            }
        }
        return index;
    }
    void fill()
    {
        double cw=0;
        double cb=0;
        System.out.println("Objects considerd: ");
        while(cw<w)
        {
            int item=getNext();
            if(item==-1)
            {
                break;
            }
            System.out.println((item+1) + " ");
            if(cw + weight[item]<=w)
            {
                cw += weight[item];
                cb += benefit[item];
                ratio[item]=0;
            }
            else
            {
                cb += (ratio[item]*(w-cw));
                cw += (w-cw);
                break;
            }
        }
        System.out.println("The optimal solution = " +cb);
    }
    public static void main(String args[])
    {
        Knapsack ks = new Knapsack();
        ks.fill();
    }
}
