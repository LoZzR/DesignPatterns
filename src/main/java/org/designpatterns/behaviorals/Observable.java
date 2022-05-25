package org.designpatterns.behaviorals;

import java.util.List;

public class Observable{

    protected int state = 0;
    protected int additionalState = 0;
    protected String lastNews;

    protected List<Subscriber> subscribers;

    public void updateState(int increment){
        state = state + increment;
        notifyObservers();
    }

    public void notifyObservers(){
        subscribers.forEach((subscriber)->subscriber.update(this));
    }
}
