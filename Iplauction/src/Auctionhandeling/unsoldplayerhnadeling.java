package Auctionhandeling;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import screens.AuctionDisplay;
public class unsoldplayerhnadeling 
{
    static Queue<ArrayList<String> > q = new LinkedList<ArrayList<String>>();
    public static void add_unsold(ArrayList<String> player  )
    {
        
        q.add(player);
        try {
            // Delay for 1 seonds
            Thread.sleep(2000);   
          }
          catch (InterruptedException ex)
          {
              ex.printStackTrace();
          }
        Getplayers.get_next();
    }

    public static void get_unsold( )
    {
        
       ArrayList<String> arr = new ArrayList<String>();
       arr = q.remove();
      AuctionDisplay.enter_auction(arr);
    }
    
     
}
