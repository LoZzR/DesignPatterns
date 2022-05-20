package org.designpatterns.creationals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;
import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SingletonTests {

  @BeforeEach
  public void setUp(){

  }

  @Test
  public void shouldGetSameInstanceOneThread(){
    Singleton instance1 = Singleton.getInstance();
    Singleton instance2 = Singleton.getInstance();
    assertEquals(instance1, instance2);
  }

  @Test
  public void shouldGetSameInstanceMultipleThread() throws Exception{
    ExecutorService service = null;
    try {
      service = Executors.newFixedThreadPool(2);
      List<Future<Singleton>> result = service.invokeAll(List.of(() ->Singleton.getInstance(), ()->Singleton.getInstance()));
      assertEquals(result.get(0).get(), result.get(1).get());
      System.out.println("Reached!");
    }
    finally {
      if(service != null) service.shutdown();
    }
  }
}
