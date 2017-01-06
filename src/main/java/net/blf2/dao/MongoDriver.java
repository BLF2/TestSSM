package net.blf2.dao;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;

/**
 * Created by blf2 on 17-1-6.
 */
public class MongoDriver {
    private static MongoClientOptions.Builder builder;

    static {
        builder = new MongoClientOptions.Builder();
        builder.connectionsPerHost(50);
        builder.threadsAllowedToBlockForConnectionMultiplier(50);
        builder.connectTimeout(1*60*1000);
        builder.maxWaitTime(2*60*1000);
        MongoClientOptions options = builder.build();
    }

    public static MongoClient getMongoClient(){
        return null;
    }

}
