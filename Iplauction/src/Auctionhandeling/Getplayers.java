package Auctionhandeling;
import java.util.Iterator;
//import org.bson.Document;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import org.bson.Document;


public class Getplayers {

    static int i = 0;
    static final String url ="mongodb+srv://Singh:0T4px6E8Of7YIisU@singh.rdxxovq.mongodb.net/?retryWrites=true&w=majority"; 
    static  MongoClient mongoClient =  MongoClients.create(url);
     //Func.print("Connected Successfully!!!!!!!!!");
    static  MongoDatabase db = mongoClient.getDatabase("IPLAuction");
   
    public static void getplayer()
    {
        db.getCollection("playerList");
       MongoCollection<Document> collection = db.getCollection("playerList");
      //Retrieving the documents
      FindIterable<Document> iterDoc = collection.find();
      Iterator<Document> it = iterDoc.iterator();
      while (it.hasNext()) {
         System.out.println(it.next());
         System.out.println();
         System.out.println();
      }

    }
    
}
// for document in myCollection.find():
//     print(document) # iterate the cursor
