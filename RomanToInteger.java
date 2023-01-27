import java.util.Scanner;

public class RomanToInteger {

    int value(char p)
    {
        if(p == 'I')
          return 1;
        if(p == 'V')
          return 5;
        if(p == 'X')
          return 10;
        if(p == 'L')
          return 50;
        if(p == 'C')
          return 100;
        if(p == 'D')
          return 500;
        if(p == 'M')
          return 1000;
        return -1;
    }

    int RomanToDecimal(String str)
    {
        int res=0;
        for(int i=0;i<str.length();i++)
        {
            int s1=value(str.charAt(i));

            if(i+1 < str.length())
            {
                int s2=value(str.charAt(i+1));

                if(s1>=s2)
                {
                    res=res+s1;
                }
                else
                {
                    res=res+s2-s1;
                    i++;
                }
            }
            else
            {
                res=res+s1;
            }
        }
        return res;
    }
    public static void main(String args[])
    {
       RomanToInteger ob = new RomanToInteger();
       Scanner sc = new Scanner(System.in);
       String s=sc.next();
       System.out.println(ob.RomanToDecimal(s));
       sc.close();
    }
}
