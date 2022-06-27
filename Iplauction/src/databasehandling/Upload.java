//For adding a user and Creating a players profile
package databasehandling;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import functions.Func;
import com.mongodb.client.MongoClient;
import java.util.ArrayList;
import org.bson.Document;
import screens.*;
public class Upload
{
       static String url ="mongodb+srv://Singh:0T4px6E8Of7YIisU@singh.rdxxovq.mongodb.net/?retryWrites=true&w=majority"; 
       static  MongoClient mongoClient =  MongoClients.create(url);
        //Func.print("Connected Successfully!!!!!!!!!");
       static  MongoDatabase db = mongoClient.getDatabase("IPLAuction");
    public static void addplalyer(ArrayList<String> list)
    {
            db.getCollection("playerList");
            MongoCollection<org.bson.Document> collection = db.getCollection("playerList");
            //System.out.println("collection is ready");
            Document docs = new Document();
            //Func.delay(1000);
            docs.put("Email", list.get(0));
            docs.put("Password",  list.get(1));
            docs.put("Name",  list.get(2));
            docs.put("Age",list.get(3)  );
            docs.put("Country", list.get(4));
            docs.put("Specialism", list.get(6));
            docs.put("Batting", list.get(7));
            docs.put("Bowling", list.get(8));
            docs.put("No of Ipl matches", list.get(9));
            docs.put("C/U/A",  Func.input("capped/uncapped: "));
            docs.put("Base Price",  list.get(10));
            collection.insertOne(docs);
            Func.print("-----------------player Added Successfully---------------------------------");
            userdata.Createuser(list, "Player");
            Login.login();
    }

    //Search the player to show the profile 
    public void searchplayer()
    {
        //String name = Func.input("Enter the Name of the player : ");
        //String country = Func.input("Enter the country of the player : ");
    }
   
}