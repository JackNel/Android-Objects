package com.delta.objects;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Jack on 6/25/16.
 */
public class JokeBot extends Bot {
    private ArrayList<Joke> myJokes = null;

    protected void sayJoke (String setup, String punchline){
        super.talk(setup);
        super.talk(punchline);
    }

    private void tellJoke () {
        Random r = new Random();
        int i = r.nextInt(myJokes.size() + 1);
        Joke jokeToTell = myJokes.get(i);
        sayJoke(jokeToTell.getJokeSetup(), jokeToTell.getJokePunchline());
    }

    public JokeBot(ArrayList<Joke> myJokes) {
        this.myJokes = myJokes;
    }
}
