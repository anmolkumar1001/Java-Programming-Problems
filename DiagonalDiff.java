import java.util.Scanner;
public class DiagonalDiff {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[][] = new int[100][100];
        int digonal1 = 0, digonal2 = 0;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = sc.nextInt();
                if(i==j)
                  digonal1 = digonal1 + arr[i][j];
                if((i+j) == n - 1)
                  digonal2 = digonal2 + arr[i][j];
            }
        }
        int digonalDiff = Math.abs(digonal1 - digonal2);
        System.out.print(digonalDiff);

        sc.close();

    }
    
}
