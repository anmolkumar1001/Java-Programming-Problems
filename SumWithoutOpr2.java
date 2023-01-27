import java.util.Scanner;

//find Sum without using operator
class SumWithoutOpr {
    static int Add(int a, int b) {
       while(b!=0)
       {
           int carry = a & b;
           a = a ^ b;
           b = carry << 1;
       }
       return a;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Add(a,b));
        sc.close();
    } 
}