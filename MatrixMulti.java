import java.util.Scanner;
public class MatrixMulti {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int r1,c1,r2,c2;
        System.out.println("Enter the row of Matrix1: ");
        r1 = sc.nextInt();
        System.out.println("Enter the column of Matrix1: ");
        c1 = sc.nextInt();
        System.out.println("Enter the row of Matrix2: ");
        r2 = sc.nextInt();
        System.out.println("Enter the column of Matrix2: ");
        c2 = sc.nextInt();

        if(c1==c2)
        {
            int mat1[][] = new int[r1][c1];
            int mat2[][] = new int[r2][c2];
            int res[][] = new int[r1][c2];
            System.out.println("Enter the element of matrix1: ");
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                   mat1[i][j] = sc.nextInt();
            }

            System.out.println("Enter the element of matrix2: ");
            for(int i=0;i<r2;i++)
            {
                for(int j=0;j<c2;j++)
                   mat2[i][j] = sc.nextInt();
            }
            System.out.println("Matrix Multiplication is:\n ");
            for(int i=0;i<r1;i++)
            for(int j=0;j<c2;j++)
            {
               int sum=0;
               for(int k=0;k<r2;k++)
               {
                    sum = sum + mat1[i][k]*mat2[k][j];
               }
               res[i][j] = sum;
            }
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c2;j++)
                   System.out.print(res[i][j] + " ");
                System.out.println();
            }
               
        }
        else
           System.out.println("Multiplication does't exits");
        sc.close();
    }
}
