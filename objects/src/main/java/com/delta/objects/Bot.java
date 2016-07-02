package com.delta.objects;

import android.util.Log;

/**
 * Created by Jack on 6/25/16.
 */
public class Bot {

    public final static String creator = "Jack";

    private String name = "Robot";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void talk (String aString) {
        Log.e(getName()+ ": ", aString);
    }
}
