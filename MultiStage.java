// Multi-Stage graph for Forward Approach

import java.util.*;
public class MultiStage
{
    public static void main(String args[])
    {
        System.out.println("-----Multi-Stage Graph Using Forward Approach-----");
        Scanner sc = new Scanner(System.in);
        int min;
        System.out.println("Enter the number of vertex: ");
        int n = sc.nextInt();
        
        // Array collection for store path.
        ArrayList<Integer> path = new ArrayList<>();

        System.out.println("Enter the destination of the graph: ");
        int dest = sc.nextInt();
        int c[][] = new int[n+1][n+1];
        System.out.println("Enter the cost Matrix: ");
        for(int i = 0; i <= n; i++)
        {
            // For first row and first column because array index start with 0.
            c[0][i] = 0;
            c[i][0] = 0;
        }

        // For cost Matrix from the graph.
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                c[i][j] = sc.nextInt();
            }
        }
        System.out.println("Optimal Path is: ");
        sc.close();

        int cost = 0;
        int v = dest;
        path.add(v);
        int k = 0;
        min = 32767;
        for(int i = n - 1; i >= 1; i--)
        {
            if(c[i][v] != 0 && c[i][v] < min)
            {
                min = c[i][v];
                k = i;
            }
            else if(c[i][v] == 9999)
            {
                v = k;
                path.add(v);
                cost += min;
                min = 32767;
                i++;
            }
        }
        path.add(k);
        cost += min;
        // Find minimum path
        for(int i = path.size() - 1; i >= 0; i--)
            System.out.println(path.get(i) + " ");
        
        // Cost
        System.out.println("Cost is: " + cost);
    }
    
}