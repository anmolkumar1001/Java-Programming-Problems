import java.util.Scanner;
public class CodeChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=1;i<=T;i++)
        {
            int N = sc.nextInt();
            if(N<10)
            {
                System.out.println("Thanks for helping Chef!");
            } 
            else
               System.out.println("-1");
        }

        sc.close();
    }
}
