Mike's a career application developer specializing who's worked primarly with Java.  
A few years back Mike got hooked on Javascript, mainly for the front end building HTML5 apps.
Since then he discovered MongoDB's rich javascript support and Mike quickly took a contract at a startup that was building an app harnessing the power of MongoDB.
He's been working with MongoDB for about a year now and took great notes.
Mike is a resident of Cincinnati where he runs the Cincinnati Java User's Group and attends other groups including CincyJS and MongoDB meetups.

At first glance Java and MongoDB can seem diametrically opposed because of Java's type safety and MongoDB's schemaless design.
In this talk we'll explore integrating MongoDB into your Java app using various APIs.  
First we'll go over MongoDB basics then visit the MongoDB driver for Java.  
After that we'll do an introduction to Spring Data and look at examples using Spring Mongo.  
We'll wrap up the session by looking at solutions using alternative JVM languages like Groovy and Scala.


Working with Mongo and Java
--Mike Ball
--Working with Mongo
--About Mongo
  --"hu-mongo-us"
  --open source
  --C++
  --Document oriented storage
    --BSON
  --easy replication
  --auto sharding
  --more
--Installing
  --Brew
  --Juju (for aws)
  --Hosted (mongolabs)
  --Windows on your own
--Running
  --mongod --dbpath ~/data/db
  --
--References
  --http://docs.mongodb.org/manual/applications/
  --
--Command Line
  --mongo
  --use 'cinjug'
  --a={ b:'c'};
  --db.things.save(j);
  --db.things.find();
  --db.things.find({b:'c'});
  --db.things.findOne();
--Inserting
  --a={ b:'c'};
  --db.things.save(j);
  --db.things.save(j);
  --db.things.find();
--Searching
  --db.things.find({b:'c'});
  --db.things.find({'_id':new ObjectId('abc')});
  --more
--Updating
  --db.things.update({b:'c'}, {"$set" : {e:'f'}});
  --db.things.update({b:'c'}, {"$set" : {count:0}});
  --db.things.update({b:'c'}, {"$inc" : {count:1}});
  --db.things.update({b:'c'}, {"$unset" : {count:1}});
  --db.things.update({b:'c'}, {"$push" : {stuff:'a'}});
  --db.things.update({b:'c'}, {"$push" : {stuff:'b'}});  
  --$pop
  --$push
  --$pull
--More Updating
  --$ operator for arrays
  --upserts (insert and update at the same time)
    --db.things.update( { b:'d' }, { $inc: { count:1 } }, true );
    --db.things.update( { b:'d' }, { $inc: { count:1 } }, true );
--Removing
  --db.things.remove({}); //remove everything
  --db.things.remove({b:'d'});
--Connecting with Java
  --MongoDriverTests
--Modeling Pojo's with Mongo
  --
--About Spring Data
  --SpringDataTests
--Searching with Spring Data
  --MeetingRespoitory
--Geospatial searching
  --http://blog.codecentric.de/en/2012/02/spring-data-mongodb-geospatial-queries/
  --add position:[long, lat]
  --db.location.ensureIndex( {position: "2d"} )
  --private double[] position;
  --Add to repository
    --List<Location> findByPositionWithin(Circle c);
    --List<Location> findByPositionWithin(Box b);
--Updating
  --full update
--Partial Updates
  --partial updates
  --$inc
  --$ (positional) operator
--Spring Data Cross-Store Persistence
--Reporting
  --Simple queries
  --Map/Reduce 
--Play, Scala and Mongo Rogue
--Summary