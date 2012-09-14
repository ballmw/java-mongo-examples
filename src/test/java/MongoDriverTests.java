import com.mongodb.*;
import org.junit.Test;

import java.net.UnknownHostException;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: ballmw
 * Date: 9/9/12
 * Time: 12:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class MongoDriverTests {
    @Test
    public void connectToMongo() throws Exception
    {
       DB db = connect();
       boolean authenticated = db.authenticate("cinjug", "cinjug".toCharArray());
       assertTrue("Could not authenticate", authenticated);
       boolean meetingsCollectionExists = db.collectionExists("meetings");
       DBCollection meetings = null;
       if(!meetingsCollectionExists)
       {
           meetings = db.createCollection("meetings", new BasicDBObject());
       }
       else
       {
           meetings = db.getCollection("meetings");
       }
       assertNotNull("Could not get meetings collection", meetings.getStats());
    }

    private DB connect() throws UnknownHostException
    {
//        Mongo m = new Mongo();
// or
//        Mongo m = new Mongo( "localhost");
// or
        Mongo m = new Mongo( "ds037587.mongolab.com", 37587 );

// or, to connect to a replica set, supply a seed list of members
//        Mongo m = new Mongo(Arrays.asList(new ServerAddress("localhost", 27017),
//                new ServerAddress("localhost", 27018),
//                new ServerAddress("localhost", 27019)));

        return m.getDB( "cinjug" );
    }
}
