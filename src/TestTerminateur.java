/**
 * Created by Razma on 2015-02-19.
 */
import java.io.*;
public class TestTerminateur{

    public static void main(String args[])
    {
        Terminateur termi = new Terminateur();
        Thread t = new Thread(termi);
        t.start();
        while(t.isAlive())
        {
            try{
               
                System.out.print('.');
                Thread.sleep(500);
            }catch (InterruptedException e){

                System.out.println(e);
                System.exit( 1 );
            }
        }

    }
}
