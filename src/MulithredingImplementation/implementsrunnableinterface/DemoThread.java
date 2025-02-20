package MulithredingImplementation.implementsrunnableinterface;

public class DemoThread implements Runnable{

    DemoThread()
    {
        Thread t = new Thread(this,"Demo Thread");
        t.start();
    }

    @Override
    public void run() {
        try{
            for(int i =1;i<=10;i++)
            {
                System.out.println("i value is :"+i);
                Thread.sleep(500);
            }

        }
        catch (Exception e)
        {
            System.out.println("exception occurred :"+e.getMessage());
        }
    }

}
