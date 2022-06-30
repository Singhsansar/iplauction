package Auctionhandeling;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import screens.AuctionDisplay;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import org.bson.Document;


public class Getplayers {

  static LinkedList<ArrayList<String>> linklist = new LinkedList<ArrayList<String>>();
  static int i = 0 ;
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
          ArrayList<String> list = new ArrayList<String>();
        Document data =  it.next();
       String name=(String)data.get("Name");
       String age=(String)data.get("Age");
       String country=(String)data.get("Country");
       String specialism=(String)data.get("Specialism");
       String batting=(String)data.get("Batting");
       String bowling=(String)data.get("Bowling");
       String matches=(String)data.get("No of Ipl matches");
       String cua=(String)data.get("C/U/A");
       String  bp=(String)data.get("Base Price"); 
       list.add(name);
       list.add(age);
       list.add(country);
       list.add(specialism);
       list.add(batting);
       list.add(bowling);
       list.add(matches);
       list.add(cua);
       list.add(bp); 
       linklist.add(list);
       System.out.println(); 
        
      }

    }
    public static void get_next()
    {
     ArrayList<String> abc= linklist.get(i);
      i = i+1; 
      AuctionDisplay.enter_auction(abc);
    }
    
}
