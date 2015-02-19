/**
 * Created by Razma on 2015-02-19.
 */
import java.io.*;
public class Terminateur implements Runnable
{
    public void run()
    {
        String str= new String();
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

            }

        }
    }
}
