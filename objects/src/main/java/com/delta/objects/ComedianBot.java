package com.delta.objects;

import android.util.Log;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Jack on 6/25/16.
 */
public class ComedianBot extends JokeBot {

    public ComedianBot(String aName) {
        super(null);
        setName(aName);
        myJokes = JokeWriter.getJokeListTwo();
    }

    @Override
    protected void sayJoke(Joke aJoke) {
        talk(aJoke.getJokeSetup() + "..." + aJoke.getJokePunchline());
    }

    public void performShow(){

        talk("Welcome to the Show!, My name is " + getName());

        for (Joke joke : myJokes) {
            sayJoke(joke);
        }

        talk("That's all folks! Thanks and goodnight!");
    }
}
