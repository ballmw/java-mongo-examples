import com.mongodb.DBCollection;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ContextConfiguration;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created with IntelliJ IDEA.
 * User: ballmw
 * Date: 9/9/12
 * Time: 1:28 PM
 * To change this template use File | Settings | File Templates.
 */
@ContextConfiguration( locations={"/applicationContext.xml"})
public class MongoTemplateTests {

    @Autowired
    MongoTemplate mongoTemplate;

    @Before
    public void setup()
    {
        mongoTemplate.dropCollection("empty_collection");
        mongoTemplate.createCollection("empty_collection");
    }

    @Test
    public void test()
    {
        DBCollection collection = mongoTemplate.getCollection("empty_collection");
        assertNotNull("Couldn't find collection 'empty_collection'", collection);
        assertEquals("Collection size is not 0", collection.count(), 0);
    }
}
