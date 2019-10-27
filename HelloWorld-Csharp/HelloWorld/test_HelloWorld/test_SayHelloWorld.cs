using System;
using HelloWorld;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace test_HelloWorld
{
    [TestClass]
    public class Test_SayHelloWorld
    {
        [TestMethod]
        public void TestInteger()
        {

            String[] testArgs = { "5", "2" };

            Assert.AreEqual(5, HelloWorld.HelloWorld.SayHelloWorld(testArgs));
        }

        [TestMethod]
        public void TestZero()
        {

            String[] testArgs = { "0", "2" };

            Assert.AreEqual(0, HelloWorld.HelloWorld.SayHelloWorld(testArgs));
        }

        [TestMethod]
        public void TestFloat()
        {

            String[] testArgs = { "8.45", "2" };

            Assert.AreEqual(3, HelloWorld.HelloWorld.SayHelloWorld(testArgs));
        }

        [TestMethod]
        public void TestNegative()
        {

            String[] testArgs = { "-7", "2" };

            Assert.AreEqual(3, HelloWorld.HelloWorld.SayHelloWorld(testArgs));
        }

        [TestMethod]
        public void TestAlpha()
        {

            String[] testArgs = { "b", "2" };

            Assert.AreEqual(3, HelloWorld.HelloWorld.SayHelloWorld(testArgs));
        }

        [TestMethod]
        public void TestNoArgs()
        {

            // String[] testArgs = { null };
            String[] testArgs = null;

            Assert.AreEqual(3, HelloWorld.HelloWorld.SayHelloWorld(testArgs));
        }
    }
}
