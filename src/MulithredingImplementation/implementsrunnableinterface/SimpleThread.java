package MulithredingImplementation.implementsrunnableinterface;

public class SimpleThread implements Runnable{
     SimpleThread()
     {
         Thread t = new Thread(this ,"Simple Thread");
         t.start();

     }
    @Override
    public void run() {
        try{
            for (int j=10;j>=1;j--)
            {
                System.out.println("j value is :"+j);
                Thread.sleep(500);
            }

        }
        catch (Exception e)
        {
            System.out.println("exception occurred :"+e.getMessage());
        }
    }
}
