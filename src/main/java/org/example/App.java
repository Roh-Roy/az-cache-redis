package org.example;

import redis.clients.jedis.DefaultJedisClientConfig;
import redis.clients.jedis.Jedis;

public class App 
{

    private static final String REDIS_HOST = "********.redis.cache.windows.net";
    private static final String REDIS_PASSWORD = "Primary Key under Access Keys";

    public static void main( String[] args )
    {
        Jedis jedis = new Jedis(REDIS_HOST, 6380, DefaultJedisClientConfig.builder()
                .password(REDIS_PASSWORD)
                .ssl(true)
                .build());

        // Remember to close the JedisPool when you're done
        // Simple PING command
        System.out.println( "\nCache Command  : Ping" );
        System.out.println( "Cache Response : " + jedis.ping());

        // Simple get and put of integral data types into the cache
        System.out.println( "\nCache Command  : GET Message" );
        System.out.println( "Cache Response : " + jedis.get("Message"));

        System.out.println( "\nCache Command  : SET Message" );
        System.out.println( "Cache Response : " + jedis.set("Message", "Hello! The cache is working from Java!"));

        // Demonstrate "SET Message" executed as expected...
        System.out.println( "\nCache Command  : GET Message" );
        System.out.println( "Cache Response : " + jedis.get("Message"));

        //Delete cache using key
        //jedis.del("Message");

        // Get the client list, useful to see if connection list is growing...
        System.out.println( "\nCache Command  : CLIENT LIST" );
        System.out.println( "Cache Response : " + jedis.clientList());

        jedis.close();
    }
}
