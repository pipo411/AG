package org.gradle.sample;

import org.junit.Test;
import static org.junit.Assert.*;

public class GreeterTest {
    @Test
    public void getGreetingTest() {
        Greeter greeter = new Greeter();
        try {
            assertEquals("task12---Hello Ariel...!!!!!!", greeter.getGreeting());
        }catch(Exception e) {}
    }
}
