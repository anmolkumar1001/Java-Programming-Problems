import java.util.Scanner;
public class CircleArea {
    public static void main(String args[])
    {
        double radius,area,circumference;
        double pi = 3.14;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        radius = sc.nextDouble();

        area = pi*radius*radius;
        System.out.println("Area is: " +area);

        circumference = 2*pi*radius;
        System.out.println("Circumference is: " +circumference);
        sc.close();
    }
}


