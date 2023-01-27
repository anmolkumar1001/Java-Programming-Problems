public class MatrixSum {
    static  int N = 3;

    static void addition(int mat1[][],int mat2[][],int res[][])
    {
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                res[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
    }

    public static void main(String args[])
    {
        int mat1[][] = { { 1, 1, 1 },
                         { 2, 2, 2 },
                         { 3, 3, 3 },
                         { 4, 4, 4 } };
        int mat2[][] = { { 1, 1, 1 },
                         { 2, 2, 2 },
                         { 3, 3, 3 },
                         { 4, 4, 4 } };

        int res[][] = new int[N][N];
        addition(mat1, mat2, res);
        System.out.println("Matrix Additon is: ");
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
               System.out.print(res[i][j] + " ");
               System.out.println();
        }
    }
}





