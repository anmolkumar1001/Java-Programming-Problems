import java.util.Scanner;
public class Hamiltonian {

    static int x[] = new int[25];

    static void Next_Vertex(int g[][], int n, int k)
    {
        int j;
        while(true)
        {
            x[k] = (x[k]+1)%(n+1);
            if(x[k]==0)
              return;
            if(g[x[k-1]][x[k]] != 0)
            {
                for(j=1;j<=k-1;j++)
                {
                    if(x[j]==x[k])
                      break;
                }
                if(j==k)
                {
                    if((k<n) || (k==n) && (g[x[n]][x[1]] != 0))
                       return;
                }
            }
        }
    }
    static void H_Cycle(int g[][], int n, int k)
    {
        int i;
        while(true)
        {
            Next_Vertex(g, n, k);
            if(x[k] == 0)
              return;
            if(k == n)
            {
                for(i=1;i<=n;i++)
                  System.out.print(x[i] + "-->");
                System.out.print(x[1]);
                System.out.println();
            }
            else
                H_Cycle(g, n, k+1);
        }
    }
    public static void main(String args[])
    {
        int i,j,n;
        int g[][] = new int [25][25];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertex: ");
        n = sc.nextInt();
        System.out.println("Enter the adjacency matrix: ");
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                g[i][j] = sc.nextInt();
                x[i] = 0;
            }   
        }
        x[1] = 1;
        System.out.println("Hamiltonian cycle: ");
        H_Cycle(g, n, 2);
           
        sc.close();
    }
    
}
