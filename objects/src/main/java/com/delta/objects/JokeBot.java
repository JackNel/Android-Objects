package com.delta.objects;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Jack on 6/25/16.
 */
public class JokeBot extends Bot {

    public static ArrayList<Joke> myJokes = null;

    public ArrayList<Joke> getMyJokes() {
        return myJokes;
    }

    public void setMyJokes(ArrayList<Joke> myJokes) {
        this.myJokes = myJokes;
    }

    public JokeBot(ArrayList<Joke> myJokes) {
        this.myJokes = myJokes;
    }

    protected void sayJoke (Joke aJoke){
        talk(aJoke.getJokeSetup());
        talk(aJoke.getJokePunchline());
    }

    protected void tellJoke() {
        Double randomDub = new Double(Math.random() * myJokes.size());
        int randomInt = randomDub.intValue();

        Joke myJoke = myJokes.get(randomInt);
        sayJoke(myJoke);
    }

}
