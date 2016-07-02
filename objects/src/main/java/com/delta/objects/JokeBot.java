package com.delta.objects;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Jack on 6/25/16.
 */
public class JokeBot extends Bot {

    private ArrayList<Joke> myJokes = null;

    public ArrayList<Joke> getMyJokes() {
        Random r = new Random();
        int i = r.nextInt(1);
        if(i == 0){
            myJokes = JokeWriter.getJokeListOne();
        }
        else {
            myJokes = JokeWriter.getJokeListTwo();
        }
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

//    public void tellJoke () {
//        Random r = new Random();
//        int i = r.nextInt(myJokes.size() + 1);
//        Joke jokeToTell = myJokes.get(i);
//        sayJoke(jokeToTell.getJokeSetup(), jokeToTell.getJokePunchline());
//    }
}
