import java.util.Scanner;
public class Array {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int[] myArray=new int[n];
        for(int i=0;i<n;i++)
           myArray[i]=scan.nextInt();

        for(int i=0;i<myArray.length;i++)
           System.out.println(myArray[i]);

        scan.close();
    }
}
