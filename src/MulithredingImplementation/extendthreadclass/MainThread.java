package MulithredingImplementation.extendthreadclass;

public class MainThread extends Thread{

    MainThread(){
        start();
    }

    @Override
    public void run() {
        try{
            System.out.println("Part1 is print in ascending order");
            for(int i=0;i<=10;i++)
            {
                System.out.println("i value is :"+i);
                Thread.sleep(500);
            }
        }
        catch(Exception e)
        {
            System.out.println("exception occurred :"+e.getMessage());
        }
    }
}
