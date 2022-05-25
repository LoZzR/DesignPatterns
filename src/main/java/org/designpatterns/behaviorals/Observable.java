package org.designpatterns.behaviorals;

import java.util.List;

public class Observable{

    protected int state = 0;
    protected int additionalState = 0;
    protected String lastNews;

    protected List<Subscriber> subscribers;

    public final void updateState(int increment){
        doUpdateState(increment);
        notifyObservers();
    }

    public void doUpdateState(int increment){
        state = state + increment;
    }

    public void notifyObservers(){
        subscribers.forEach((subscriber)->subscriber.update(this));
    }
}
