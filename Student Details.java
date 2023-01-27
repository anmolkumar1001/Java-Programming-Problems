import java.util.Scanner;
class Stud
{
    String USN,Name,Branch,Phone;
    void read()
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the USN: ");
            USN=sc.next();
            System.out.println("Enter the Name: ");
            Name=sc.next();
            System.out.println("Enter the Branch: ");
            Branch=sc.next();
            System.out.println("Enter the Phone No: ");
            Phone=sc.next();
        }
        
    }
    void display()
    {
        System.out.println("\nStudent details");
        System.out.println("USN = " +this.USN);
        System.out.println("Name = " +this.Name);
        System.out.println("Branch = " +this.Branch);
        System.out.println("Phone = " +this.Phone);
    }

}
class Prg1a {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Student:");
        int nos=sc.nextInt();
        Stud[] s=new Stud[nos];
        for(int i=0;i<nos;i++)
        {
            System.out.println("Enter the details for student" +(i+1));
            s[i]=new Stud();
            s[i].read();
        }
        System.out.println("The Student details are: ");
        for(int i=0;i<nos;i++)
        {
            System.out.println("Enter the details for student" +(i+1));
            s[i].display();
        }
        sc.close();
    }
}
