import java.util.Scanner;
public class Floyds {

    static void floyd(int d[][], int n)
    {
        for(int k=1;k<=n;k++)
           for(int i=1;i<=n;i++)
              for(int j=1;j<=n;j++)
              d[i][j] = min(d[i][j],d[i][k]+d[k][j]);
    }
    static int min(int a,int b)
    {
        return(a<b?a:b);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices: ");
        int n = sc.nextInt();
        int[][] cost = new int[n+1][n+1];
        System.out.println("Enter the cost matrix: ");
        for(int i=1;i<=n;i++)
           for(int j=1;j<=n;j++)
              cost[i][j] = sc.nextInt();
        floyd(cost, n);
        System.out.println("All pairs shortest path: ");
        for(int i=1;i<=n;i++)
        {
           for(int j=1;j<=n;j++)
              System.out.print(cost[i][j] +  " ");
            System.out.println();
        }
        sc.close();
    }
}
