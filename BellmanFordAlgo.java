import java.util.Scanner;
public class BellmanFordAlgo {
	static int n,dest;
	static double [] prevDistanceVector, distanceVector;
	static double [][] adjencyMatrix;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of nodes: ");
		n = sc.nextInt();
		adjencyMatrix = new double[n][n];
		System.out.println("Enter the adjacency Matrix: ");
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				adjencyMatrix[i][j] = sc.nextDouble();
		
		System.out.println("Enter destination vector: ");
		dest = sc.nextInt();
		
		distanceVector = new double[n];
		for(int i=0;i<n;i++)
			distanceVector[i] = Double.POSITIVE_INFINITY;
		distanceVector[dest - 1] = 0;
		
		bellmanfordAlgorithm();
		
		System.out.println("Distance Vector");
		for(int i=0;i<n;i++)
		{
			if(i == dest - 1)
			{
				continue;
			}
			System.out.println("Distance from " + (i+1) + " is " + distanceVector[i]);
		}
		System.out.println();
	}
	
	static void bellmanfordAlgorithm()
	{
		for(int i=0;i<n-1;i++)
		{
			prevDistanceVector = distanceVector.clone();
			for(int j=0;j<n;j++)
			{
				double min = Double.POSITIVE_INFINITY;
				for(int k=0;k<n;k++)
				{
					if(min > adjencyMatrix[j][k] + prevDistanceVector[k])
					{
						min = adjencyMatrix[j][k] + prevDistanceVector[k];
					}
				}
				distanceVector[j] = min;
			}
		}
	}

}
