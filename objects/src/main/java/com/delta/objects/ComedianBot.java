package com.delta.objects;

import android.util.Log;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Jack on 6/25/16.
 */
public class ComedianBot extends JokeBot {

    public ComedianBot(ArrayList<Joke> myJokes) {
        super(myJokes);
    }

    public ComedianBot() {
    }

    public void performShow(){
        Random r = new Random();
        int i = r.nextInt(1);
        if(i == 0){
            myJokes = JokeWriter.getJokeListOne();
        }
        else {
            myJokes = JokeWriter.getJokeListTwo();
        }

        talk("Welcome to the Show!");
        super.tellJoke();
        super.tellJoke();
        super.tellJoke();
        talk("That's all folks! Thanks and goodnight!");
    }
}
