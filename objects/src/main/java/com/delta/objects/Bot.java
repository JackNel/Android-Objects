package com.delta.objects;

import android.util.Log;

/**
 * Created by Jack on 6/25/16.
 */
public class Bot {
    private final String creator = "Jack";

    private String name = "Robot";

    protected void talk (String aString) {
        Log.e(getName(), aString);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
