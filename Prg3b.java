import java.util.Random;
class Prg3b {
    static int randomInteger;
    public static void main(String args[])
    {
        System.out.println("For 10 Random Numbers");
        MyThread thread1=new MyThread();
        thread1.start();
    }
}
class MyThread extends Thread
{
    public void run()
    {
        int i=0;
        try
        {
            while(i<10)
            {
                Random random=new Random();
                Prg3b.randomInteger=random.nextInt(10);
                System.out.println((i+1)+ " Random Integer is "+Prg3b.randomInteger);
                new MyThread2().start();
                new MyThread3().start();
                Thread.sleep(1000*1);
                System.out.println("\n");
                i++;
            }
        }
        catch(InterruptedException exception)
        {
            exception.printStackTrace();
        }
    }
}
class MyThread2 extends Thread
{
    public void run()
    {
        System.out.println("Square of "+Prg3b.randomInteger+" is "+Prg3b.randomInteger*Prg3b.randomInteger);
    }
}
class MyThread3 extends Thread
{
    public void run()
    {
        System.out.println("Cube of "+Prg3b.randomInteger+" is "+Prg3b.randomInteger*Prg3b.randomInteger*Prg3b.randomInteger);
    }
}