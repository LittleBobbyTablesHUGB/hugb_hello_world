package com.bangsapabbi.helloworld;
import net.joningi.icndb.ICNDBClient;
import net.joningi.icndb.Joke;

public class World {

    //private String greeting = "Hello world!";
    
    //Initialize the client
    final ICNDBClient client = new ICNDBClient();
    //Get random joke
    private Joke randomJoke = client.getRandom();
    public String greet() {
        return randomJoke.getJoke();
    }
}
