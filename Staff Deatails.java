import java.util.Scanner;
class staff
{
    String name,phone;
    int sal,sid;
    Scanner scan = new Scanner(System.in);
    void read()
    {
        System.out.println("Staff Id:");
        sid=scan.nextInt();
        System.out.println("Name:");
        name=scan.next();
        System.out.println("Phone:");
        phone=scan.next();
        System.out.println("Salary:");
        sal=scan.nextInt();
        scan.nextLine();
    }
    void display()
    {
        System.out.println("Staff Id: " +sid);
        System.out.println("Name: " +name);
        System.out.println("Phone: " +phone);
        System.out.println("Salary: " +sal);
    }
}
class teaching extends staff
{
    String domain;
    int publication;
    void read()
    {
        super.read();
        System.out.print("Enter the Domain Experties:");
        domain=scan.nextLine();
        System.out.print("Enter the No. of Publication:");
        publication=scan.nextInt();
    }
    void display()
    {
        super.display();
        System.out.println("Domain Experties: " +domain);
        System.out.println("No. of publication: " +publication);
    }
}
class technical extends staff
{
    String[] skills;
    void read()
    {
        super.read();
        System.out.print("Skill (Separated by commas):");
        skills=scan.next().split(",");
    }
    void display()
    {
        super.display();
        System.out.print("Skills: ");
        for(int i=0;i<skills.length;i++)
        {
            System.out.print(skills[i] + " ");
        }
        System.out.println();
    }
}
class contract extends staff
{
    int period;
    void read()
    {
        super.read();
        System.out.print("Enter the contract period:");
        period=scan.nextInt();
    }
    void display()
    {
        super.read();
        System.out.print("Contract Period: " +period);
    }
}
public class Prg2a {
    public static void main(String args[])
    {
        teaching teach[] = new teaching[3];
        technical tech[] = new technical[3];
        contract cont[] = new contract[3];
        System.out.println("Enter the Staff details:");
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter the details of teaching staff # " +(i+1));
            teach[i]=new teaching();
            teach[i].read();
        }
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter the details of technical staff # " +(i+1));
            tech[i]=new technical();
            tech[i].read();
        }
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter the details of contract staff # " +(i+1));
            cont[i]=new contract();
            cont[i].read();
        }
        System.out.println("The details of all three categories of staff:");
        for(int i=0;i<3;i++)
        {
            System.out.println("The details of teaching staff # " +(i+1));
            teach[i].display();
        }
        for(int i=0;i<3;i++)
        {
            System.out.println("The details of teaching staff # " +(i+1));
            tech[i].display();
        }
        for(int i=0;i<3;i++)
        {
            System.out.println("The details of teaching staff # " +(i+1));
            cont[i].display();
        }
    }
}
