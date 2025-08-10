package test.java.com.example;

import main.java.com.example.HelloWorld;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void testGreet() {
        HelloWorld hello = new HelloWorld();
        assertEquals("Hello, Test!", hello.greet("Test"));
    }
}