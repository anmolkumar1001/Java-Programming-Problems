import java.io.DataInputStream;
public class Reading {
    public static void main(String args[])
    {
        DataInputStream in = new DataInputStream(System.in);
        int intNumber=0;
        float floatNumber=0.0f;
        try
        {
            System.out.println("Enter an Integer: ");
            intNumber=in.readInt();
            System.out.println("Enter a float number: ");
            floatNumber=in.readFloat();
        }
        catch (Exception e){ }
        System.out.println("intNumber = " + intNumber);
        System.out.println("floatNumber = " + floatNumber);
    }
}
