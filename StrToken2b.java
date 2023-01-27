import java.util.Scanner;
import java.util.StringTokenizer;
public class StrToken2b {
    private String name,date_of_birth;
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        name=sc.nextLine();
        System.out.println("Enter the date of birth in format dd/mm/yyyy");
        date_of_birth=sc.nextLine();
        sc.close();
    }
    public void display()
    {
        System.out.print("Name and ");
        StringTokenizer st = new StringTokenizer(date_of_birth,"/");
        System.out.print("Date of birth is: " + "<" + name + ",");
        int n=st.countTokens();
        while(st.hasMoreTokens())
        {
            if(n>1)
              System.out.print(st.nextToken("/") + ",");
            else
              System.out.println(st.nextToken("/") + ">");
              n--;
        }
    }
    public static void main(String args[])
    {
        StrToken2b st = new StrToken2b();
        st.input();
        st.display();
    }
}
