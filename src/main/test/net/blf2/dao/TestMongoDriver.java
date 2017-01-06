package net.blf2.dao;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by blf2 on 17-1-6.
 */
public class TestMongoDriver {
    private MongoClient mongoClient;
    private MongoDatabase mongoDatabase;
    private MongoCollection<Document> mongoCollection;
    @Before
    public void createMongo(){
        mongoClient = MongoDriver.getMongoClient();
        mongoDatabase = mongoClient.getDatabase("testdatabase");
        mongoCollection = mongoDatabase.getCollection("testcollection");
    }
    @Test
    public void TestMongoDb()
    {
        Document document = new Document();
        document.append("testId","2");
        document.append("testiid", "3");
        mongoCollection.insertOne(document);
        Assert.assertTrue(mongoCollection.find(document) == null ? Boolean.FALSE : Boolean.TRUE);
    }
}
