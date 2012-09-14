Working with Mongo and Java
===========================

##About Mongo
*   "hu-mongo-us"
*   open source
*   C++
*   Document oriented storage (BSON)
*   easy replication
*   auto sharding
*   more

##Installing
*   Brew
*   Juju (for aws)
*   Hosted (mongolabs)
*   Windows on your own

##Running
*   mongod ##dbpath ~/data/db

##References
[mongodb.org](http://docs.mongodb.org/manual/applications/)

##Command Line
*   mongo
*   use 'cinjug'
*   a={ b:'c'};
*   db.things.save(j);
*   db.things.find();
*   db.things.find({b:'c'});
*   db.things.findOne();

##Inserting
*   a={ b:'c'};
*   db.things.save(j);
*   db.things.save(j);
*   db.things.find();

##Searching
*   db.things.find({b:'c'});
*   db.things.find({'_id':new ObjectId('abc')});
*   more

##Updating
*   db.things.update({b:'c'}, {"$set" : {e:'f'}});
*   db.things.update({b:'c'}, {"$set" : {count:0}});
*   db.things.update({b:'c'}, {"$inc" : {count:1}});
*   db.things.update({b:'c'}, {"$unset" : {count:1}});
*   db.things.update({b:'c'}, {"$push" : {stuff:'a'}});
*   db.things.update({b:'c'}, {"$push" : {stuff:'b'}});  
*   $pop
*   $push
*   $pull

##More Updating
*   $ operator for arrays
*   upserts (insert and update at the same time)

        db.things.update( { b:'d' }, { $inc: { count:1 } }, true );
        db.things.update( { b:'d' }, { $inc: { count:1 } }, true );

##Removing
*   db.things.remove({}); //remove everything
*   db.things.remove({b:'d'});

##Connecting with Java
*   MongoDriverTests

##Spring Data and MongoTemplate
*

##Modeling Pojo's with SpringData
*   Annotations:
*   @Id - applied at the field level to mark the field used for identiy purpose.
*   @Document - applied at the class level to indicate this class is a candidate for mapping to the database. You can specify the name of the collection where the database will be stored.
*   @DBRef - applied at the field to indicate it is to be stored using a com.mongodb.DBRef.
*   @Indexed - applied at the field level to describe how to index the field.
*   @CompoundIndex - applied at the type level to declare Compound Indexes
*   @GeoSpatialIndexed - applied at the field level to describe how to geoindex the field.
*   @Transient - by default all private fields are mapped to the document, this annotation excludes the field where it is applied from being stored in the database
*   @PersistenceConstructor - marks a given constructor - even a package protected one - to use when instantiating the object from the database. Constructor arguments are mapped by name to the key values in the retrieved DBObject.
*   @Value - this annotation is part of the Spring Framework . Within the mapping framework it can be applied to constructor arguments. This lets you use a Spring Expression Language statement to transform a key's value retrieved in the database before it is used to construct a domain object.
*   @Field - applied at the field level and described the name of the field as it will be represented in the MongoDB BSON document thus allowing the name to be different than the fieldname of the class.

##About Spring Data
*   SpringDataTests

##Searching with Spring Data
*   MeetingRespoitory

##Geospatial searching
*   http://blog.codecentric.de/en/2012/02/spring-data-mongodb-geospatial-queries/
*   add position:[long, lat]
*   db.location.ensureIndex( {position: "2d"} )
*   private double[] position;
*   Add to repository
        List<Location> findByPositionWithin(Circle c);
        List<Location> findByPositionWithin(Box b);

##Updating
*   full update

##Partial Updates
*   partial updates
*   $inc
*   $ (positional) operator

##Spring Data Cross-Store Persistence

##Reporting
*   Simple queries
*   Map/Reduce 

##Play, Scala and Mongo Rogue

##Summary