package net.blf2.util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by blf2 on 17-1-6.
 */
public class Consts {
    private static Properties properties;
    static{
        properties = new Properties();
        try{
            InputStream in = new BufferedInputStream(new FileInputStream("/webconfig.properties"));
            properties.load(in);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public static int CONNECTIONS_PER_HOST = properties.getProperty("CONNECTIONS_PER_HOST") != null ? Integer.parseInt(properties.getProperty("CONNECTIONS_PER_HOST")) : 50;
    public static int THREADS_ALLOWED_TO_BLOCK_FOR_CONNECTION_MULTIPLIER = properties.getProperty("THREADS_ALLOWED_TO_BLOCK_FOR_CONNECTION_MULTIPLIER") != null ? Integer.parseInt(properties.getProperty("THREADS_ALLOWED_TO_BLOCK_FOR_CONNECTION_MULTIPLIER")) : 50;
    public static int CONNECT_TIMEOUT = properties.getProperty("CONNECT_TIMEOUT") != null ? Integer.parseInt(properties.getProperty("CONNECT_TIMEOUT")) : 60000;
    public static int MAX_WAIT_TIME = properties.getProperty("MAX_WAIT_TIME") != null ? Integer.parseInt(properties.getProperty("MAX_WAIT_TIME")) : 120000;
}
