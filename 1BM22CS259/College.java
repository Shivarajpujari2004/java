class Thread1 implements Runnable{
    Thread t;
    public Thread1()
    {
        t=new Thread(this, "NThread");

        System.out.println("CT:"+t);

        t.start();

    }
    public void run()

    {

        try
        {

            for(int n=5;n>0;n--)

            {

                System.out.println("CSE "+n);
                Thread.sleep(2000);

            } 
        }
        catch(InterruptedException ie) {
            System.out.println("CSE Interrupted"); }
        System.out.println("CSE quitting");
    
    }

}



public class College {
    
    public static void main(String ss[])
    {
        new Thread1();
        System.out.println("Back in main");
        try
        {
            for(int n=2;n>0;n--)

            {

                System.out.println("BMSCE "+n);

                Thread.sleep(10000); }
            }
            catch(InterruptedException ie){
    
                System.out.println("BMSCE interrupted");
    
            }
            System.out.println("BMSCE quitting");
        } 
    }