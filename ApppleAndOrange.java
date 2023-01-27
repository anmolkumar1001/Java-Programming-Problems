import java.util.Scanner;
public class ApppleAndOrange {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();

        int apple = 0;
        for (int i = 0; i < m; i++) {
            int applePosition = a + sc.nextInt();
            if (applePosition >= s && applePosition <= t) {
                apple++;
            }
        }
        System.out.println(apple);

        int orange = 0;
        for (int i = 0; i < n; i++) {
            int orangePosition = b + sc.nextInt();
            if (orangePosition >= s && orangePosition <= t) {
                orange++;
            }
        }
        System.out.println(orange);

        sc.close();
    }
    
}
