package cma;

import org.junit.Test;

public class HelloWorldTest {

  private final HelloWorld helloWorld = new HelloWorld();

  @Test
  public void sayHi() {
    org.junit.Assert.assertEquals("Hi, Cristi", helloWorld.sayHi("Cristi"));
  }
}
