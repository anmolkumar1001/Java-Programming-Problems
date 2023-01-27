import java.util.*;


public class HackerRank11 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String B="";
        for(int i=A.length()-1;i>=0;i--)
        {
            B+=A.charAt(i);
        }
        if(A.equals(B))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        sc.close();
        
    }
}
