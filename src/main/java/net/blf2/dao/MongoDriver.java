package net.blf2.dao;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.ServerAddress;
import net.blf2.util.Consts;

/**
 * Created by blf2 on 17-1-6.
 */
public class MongoDriver {
    private static MongoClientOptions.Builder builder;
    private static MongoClientOptions options;
    private static MongoClient mongoClient;

    static {
        builder = new MongoClientOptions.Builder();
        builder.connectionsPerHost(Consts.CONNECTIONS_PER_HOST);
        builder.threadsAllowedToBlockForConnectionMultiplier(Consts.THREADS_ALLOWED_TO_BLOCK_FOR_CONNECTION_MULTIPLIER);
        builder.connectTimeout(Consts.CONNECT_TIMEOUT);
        builder.maxWaitTime(Consts.MAX_WAIT_TIME);
        options = builder.build();
        mongoClient = new MongoClient(new ServerAddress(Consts.MONGODB_HOST,Consts.MONGODB_PORT),options);
    }

    public static MongoClient getMongoClient(){
        return mongoClient;
    }

}
