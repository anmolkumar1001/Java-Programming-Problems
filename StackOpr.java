import java.util.Scanner;
class Stack
{
    Scanner sc=new Scanner(System.in);
    int s[],top,size;
    Stack(int n)
    {
        size=n;
        s=new int[size];
        top=-1;
    }
    void push()
    {
        if(top==size-1)
          System.out.println("Stack is full");
        else
        {
            System.out.println("Enter element to push:");
            int element=sc.nextInt();
            s[++top]=element;
        }
    }
    int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else
            return(s[top--]);
    }
    void display()
    {
        if(top==-1)
          System.out.println("Stack is empty");
        else
        {
            System.out.println("Stack element are:");
            for(int i=top;i>=0;i--)
               System.out.println(s[i]);
        }
    }
}
class StackOpr {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter stack size:");
            int n=sc.nextInt();
            int choice;
            Stack stkOb=new Stack(n);
            do
            {
                System.out.println("Stack Operations:");
                System.out.println("1.Push");
                System.out.println("2.Pop");
                System.out.println("3.Display");
                System.out.println("4.Exit");
                System.out.println("Enter your choice:");
                choice=sc.nextInt();
                switch(choice)
                {
                    case 1:stkOb.push();break;
                    case 2:int popped=stkOb.pop();
                           if(popped!=-1)
                             System.out.println("Popped element is:" +popped);
                           break;
                    case 3:stkOb.display();break;
                    case 4:System.out.println("Thank You");break;
                }

            }while(choice!=4);
        }
    }
    
}
