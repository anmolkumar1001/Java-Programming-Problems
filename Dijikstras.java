import java.util.Scanner;
public class Dijikstras {
    static int[][] cost;
    static int dist[],n;

    static int min(int m, int n)
    {
        return((m < n) ? m : n);
    }

    static void dijikstras(int source)
    {
        int[] s = new int[n];
        int min,w=0;
        // System.arraycopy(cost[source], 0, dist, 0, n);
        s[source-1] = 1;
        // dist[source] = 0;
        for(int i=0;i<n;i++)
            dist[i] = cost[source-1][i];
        for(int i=0;i<n-1;i++)
        {
            min = 999;
            for(int j=0;j<n;j++)
               if((s[j] == 0) && (min > dist[j]))
               {
                    min = dist[j];
                    w = j;
               }
               s[w] = 1;
               for(int v=0; v < n; v++)
                   if(s[v] == 0 && cost[w][v] != 999)
                   {
                       dist[v] = min(dist[v], dist[w] + cost[w][v]);
                   }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int source;
        System.out.println("Enter the number of vertex: ");
        n = sc.nextInt();
        cost = new int[n][n];
        dist = new int[n];
        System.out.println("Enter the cost matrix: ");
        for(int i=0;i<n;i++)
           for(int j=0;j<n;j++)
              cost[i][j] = sc.nextInt();
        System.out.println("Enter the source vertex: ");
        source = sc.nextInt();
        dijikstras(source);
        System.out.println("The Shortest distance  is: ");
        for(int i=0;i<n;i++){
            if(source-1 == i)
                continue;
           System.out.println("Cost from " + source + " to " + i + " is " + dist[i]);
        } 
        sc.close();
    }
}
