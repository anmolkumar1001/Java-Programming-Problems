import java.util.Scanner;
public class Exercise1_3 {
       public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	  int sum=0;
      sc.close();

    for(int i=0;i<n;i++)
{
    //for even
    int num = 2*i; 
  if(num%3==0)
  {
      sum = sum + num;
  }
}
System.out.print(sum);
}
}
