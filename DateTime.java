import java.time.LocalDate;
import java.util.Scanner;
public class DateTime {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        sc.close();

        LocalDate date = LocalDate.of(year, month, day);
        System.out.print(date.getDayOfWeek());
        
    }
}
