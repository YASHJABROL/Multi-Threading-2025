package MulithredingImplementation.extendthreadclass;

public class SampleThread extends Thread {
    SampleThread()
    {
        start();
    }

    @Override
    public void run() {
        try{
            System.out.println("Part2 is print in descending order");
            for(int j=10;j>=1;j--)
            {
                System.out.println("j value is :"+ j);
                Thread.sleep(500);
            }
        }
        catch(Exception e){
            System.out.println("exception occurred :"+e.getMessage());
        }
    }
}
