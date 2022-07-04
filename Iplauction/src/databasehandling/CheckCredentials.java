package databasehandling;
import org.bson.Document;
import com.mongodb.BasicDBObject;
import com.mongodb.client.*;

import Auctionhandeling.Getplayers;
import screens.Adminhomepage;
import screens.Login;
import screens.TeamHome;
import screens.popup;





//Check data base for lgetting the password 
public class CheckCredentials
{
     static  String url =userRegister.url;
     static  MongoClient mongoClient =  MongoClients.create(url);
     static MongoDatabase db = mongoClient.getDatabase("IPLAuction");

    public static void  validate(String email , String password)
    {
        String Email = "";
        String pass = "";
        String Role ="";
        db.getCollection("Users");
        MongoCollection<org.bson.Document> collection = db.getCollection("Users");
        BasicDBObject searchQuery = new BasicDBObject();
        searchQuery.put("Email", email);
        MongoCursor<org.bson.Document> cursor = collection.find(searchQuery).iterator();
        
        while (cursor.hasNext()) {
           Document data =  cursor.next();
            Email =(String) data.get("Email"); //return the email
            pass = (String) data.get("password");
            Role = (String) data.get("Role");
        }
        System.out.println(Email);
        System.out.println(pass);
        
        if(Email.equals(email) && pass.equals(password))
        {
            Login.dispose_frame();
            if(Role.equals("admin"))
            {
                
                Adminhomepage.Admin_home();
            } 
            
            else if (Role.equals("Player")) 
            TeamHome.Team_home();

        }
        else
        {
            popup.popup_sreen("Invalid Credentials");
        }

        
    }
}

