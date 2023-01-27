public class MatrixSumDiagonal {

    static void Sum_of_Diagonal(int[][] matrix, int N)
    {
        int PrimaryDiag = 0, SecondaryDiag = 0;

        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                if(i==j)
                  PrimaryDiag += matrix[i][j];

                if((i+j)==(N-1))
                  SecondaryDiag += matrix[i][j];
            }
        }
        System.out.println("Sum of Primary Diagonal is: " +PrimaryDiag);
        System.out.println("Sum of Secondary Diagonal is: " +SecondaryDiag);
    }

    public static void main(String args[])
    {
        int[][] matrix = { {1, 1, 1},
                           {2, 2, 2}, 
                           {3, 3, 3} };

        Sum_of_Diagonal(matrix, 3);
    }
}
