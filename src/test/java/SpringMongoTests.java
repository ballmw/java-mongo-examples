import com.sourcemain.mongo.domain.Meeting;
import com.sourcemain.mongo.repository.MeetingRepository;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ContextConfiguration;

/**
 * Created with IntelliJ IDEA.
 * User: ballmw
 * Date: 9/9/12
 * Time: 12:40 PM
 * To change this template use File | Settings | File Templates.
 */
@ContextConfiguration( locations={"/applicationContext.xml"})
public class SpringMongoTests {

    @Autowired
    MongoTemplate mongoTemplate;

    private static final String collection = "meetings";

    @Autowired
    private MeetingRepository repository;

    @Before
    public void setup()
    {
        mongoTemplate.dropCollection(collection);
        Meeting meeting1 = new Meeting();
        Meeting meeting2 = new Meeting();
        Meeting meeting3 = new Meeting();
        repository.save(meeting1);
        repository.save(meeting2);
        repository.save(meeting3);
    }

    @Test
    public void searching()
    {

    }

    @Test
    public void update()
    {

    }

    @Test void remove()
    {

    }

}
