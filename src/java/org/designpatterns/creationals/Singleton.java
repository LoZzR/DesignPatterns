package org.designpatterns.creationals;

//Lazy instantiation using double locking mechanism.
//The standard implementation shown in the above code 
//is a thread safe implementation, but it's not the best 
//thread-safe implementation beacuse synchronization is 
//very expensive when we are talking about the performance.
//We can see that the synchronized method getInstance does
//not need to be checked for syncronization after the object
//is initialized. If we see that the singleton object is already
//created we just have to return it without using any syncronizedblock.
//This optimization consist in checking in an unsynchronized block
//if the object is null and if not to check again and create it in
//an syncronized block. This is called double locking mechanism.
//In this case case the singleton instance is created when the getInstance()
//method is called for the first time. This is called lazy instantiation and
//it ensures that the singleton instance is created only when it is needed.

import java.io.Serializable;

public class Singleton implements Serializable{
  
  private static Singleton instance;
  
  private Singleton(){
    System.out.println("Singleton(): Initializing Instance");
  }
  
  public static Singleton getInstance(){
    if (instance == null){
      synchronized(Singleton.class){
        if (instance == null){
          System.out.println("getInstance(): First time getInstance was invoked!");
          instance = new Singleton();
        }
      }
    }
    
    return instance;
  }
  
  public void doAction(){
    System.out.println("doAction(): Singleton does some action !");
  }
  
  //Used because when someone reads the data from the disk, it deserializes it into a new object, not the one in memory 
  // This method is called immediately after an object of this class is deserialized.
  // This method returns the singleton instance.
  protected Object readResolve(){
    return getInstance();
  }
}
