package databasehandling;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoClient;
import java.util.ArrayList;

import org.bson.Document;
public class userdata {

    static  String url =Upload.url;
    static MongoClient mongoClient =  MongoClients.create(url);
    static MongoDatabase db = mongoClient.getDatabase("IPLAuction");
    public static void addTeam(ArrayList<String> list)
    {
            
            db.getCollection("IPLTeams");
            MongoCollection<org.bson.Document> collection = db.getCollection("IPLTeams");
            //System.out.println("collection is ready");
            Document docs = new Document();
            docs.put("Teamname",list.get(2));
            docs.put("TeamManagerName",list.get(3) );
            docs.put("TeamID",list.get(4) );
            docs.put("Email", list.get(0));
            docs.put("password",  list.get(1));
            docs.put("Amount",  list.get(5));
            collection.insertOne(docs);
            Createuser(list, "team");
    }
    public static void Createuser(ArrayList<String> list , String role)
    {
            db.getCollection("Users");
            MongoCollection<org.bson.Document> collection = db.getCollection("Users");
            Document docs = new Document();
            docs.put("Email", list.get(0));
            docs.put("password",list.get(1));
            docs.put("Role", role);
            collection.insertOne(docs);
            

    }
    
}
