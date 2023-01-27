import java.util.Scanner;
public class TempConverter {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            float fah, cel;
            System.out.println("Enter the temp in fahr");
            fah=sc.nextFloat();
            cel=Math.round((fah-32)/1.8);
            System.out.println("Temp in Celsius is " + cel);
        }
       
    }
}
