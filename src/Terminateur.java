/**
 * Created by Francis on 2015-02-19.
 */
import java.io.*;
public class Terminateur implements Runnable {
    public void run()
    {
        String str="";
        BufferedReader reader;
        reader = new BufferedReader(
            new InputStreamReader( System.in ) );
        while(!str.toLowerCase().equals("q"))
        {
            try
            {
                str = reader.readLine();
            }
            catch( IOException e )
            {
                System.err.println( e );
                System.exit( 1 );
            }
        }
    }
    public static void main(String args[])
    {
        Terminateur termi = new Terminateur();
        Thread t = new Thread(termi);
        t.start();
        while(t.isAlive())
        {
            try{
                Thread.sleep(500);
                System.out.print('.');
            }catch (InterruptedException e){

            }
        }

    }
}
