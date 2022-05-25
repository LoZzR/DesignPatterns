package org.designpatterns.behaviorals;

public class ConcreteObservable extends Observable{

    @Override
    public void doUpdateState(int increment){
        super.doUpdateState(increment); // the observers are notified
        additionalState = additionalState + increment; // the state is changed after the notifiers are updated
    }
}
