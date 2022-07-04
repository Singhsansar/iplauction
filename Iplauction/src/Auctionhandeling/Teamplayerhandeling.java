package Auctionhandeling;
import java.util.ArrayList;
import java.util.Stack;
import screens.Myplayers;
import screens.TeamHome;
import screens.popup;
public class Teamplayerhandeling 
{
    static Stack<ArrayList<String>> stack = new Stack<ArrayList<String>>();

    public static void addplayer(ArrayList<String> player)
    {
       
        stack.add(player);
    }

    public static  void getplayer()
    {
        ArrayList<String> arr = new ArrayList<String>();
        if(stack.empty())
        {
            popup.popup_sreen("No more players");
            try {
                // Delay for 1 seonds
                Thread.sleep(2000);   
              }
              catch (InterruptedException ex)
              {
                  ex.printStackTrace();
              }
            Myplayers.backhome();
        }
        else
        {
            arr = stack.pop();
            Myplayers.player_list(arr);
        }
    }
    
}
