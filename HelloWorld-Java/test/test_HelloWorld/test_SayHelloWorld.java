package test_HelloWorld;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import HelloWorld.HelloWorld;

public class test_SayHelloWorld {

    @Test
    public void testInteger() {

	String[] testArgs = { "5", "2" };

	// HelloWorld myTest = new HelloWorld();
	assertEquals(5, HelloWorld.SayHelloWorld(testArgs));
    }

    @Test
    public void testZero() {

	String[] testArgs = { "0", "2" };

	// HelloWorld myTest = new HelloWorld();
	assertEquals(0, HelloWorld.SayHelloWorld(testArgs));
    }

    @Test
    public void testFloat() {

	String[] testArgs = { "8.45", "2" };

	// HelloWorld myTest = new HelloWorld();
	assertEquals(3, HelloWorld.SayHelloWorld(testArgs));
    }

    @Test
    public void testNegative() {

	String[] testArgs = { "-7", "2" };

	// HelloWorld myTest = new HelloWorld();
	assertEquals(3, HelloWorld.SayHelloWorld(testArgs));
    }

    @Test
    public void testAlpha() {

	String[] testArgs = { "b", "2" };

	// HelloWorld myTest = new HelloWorld();
	assertEquals(3, HelloWorld.SayHelloWorld(testArgs));
    }

    @Test
    public void testNoArgs() {

	// String[] testArgs = { null };
	String[] testArgs = null;

	// HelloWorld myTest = new HelloWorld();
	assertEquals(3, HelloWorld.SayHelloWorld(testArgs));
    }

}
