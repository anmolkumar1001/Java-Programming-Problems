public class ReverseString
{
    public static void main(String[] args) 
    {
      String a[] = "Welcome to DBMS Lab".split(" ");
      String ans = "";
      for(int i=a.length-1;i>=0;i--)
      {
        ans+=a[i]+" ";
      }  
      System.out.println("Reversed String: ");
      System.out.println(ans.substring(0,ans.length()-1));
    }
}
// import java.util.Scanner;
// public class ReverseString
// {
//   public static void main(String args[])
//   {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter String: ");
//     String s = sc.nextLine();
//     int i = s.length()-1;
//     String ans = "";
//     while(i>=0)
//     {
//       while(i>=0 && s.charAt(i) == ' ')
//           i--;
//       int j = i;

//       if(i<0)
//       break;

//       while(i>=0 && s.charAt(i)!=' ')
//       i--;
      
//       if(ans.isEmpty())
//       {
//         ans.concat(s.substring(i+1, j+1));
//       }
//       else
//       {
//         ans.concat(" " + s.substring(i+1, j+1));
//       }
//     }
//     System.out.print(ans);  
//   }
// }
