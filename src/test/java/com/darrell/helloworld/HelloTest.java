package com.darrell.helloworld;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;



public class HelloTest {
    @Test
    public void testDefaultName() {
        Hello hello = new Hello();
        String name = hello.getName();
        assertEquals("World", name);
    }
    @Test
    public void testPassedInName() {
        Hello hello = new Hello("Shelly McShellface");
        String name = hello.getName();
        assertEquals("Shelly McShellface", name);
    }
    @Test
    public void testSayHello(){
        Hello hello = new Hello();
        assertEquals("Hello, World", hello.sayHello());
    }
}
