package com.sapient.WEEK1;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    private CheckEven app;

    @Before
    public void setup() {
        app = new CheckEven();
    }

    @Test
    public void testEvenNum() {
        System.out.println("Tests for even Numbers");
        assertTrue("Checking Even no.", app.check(4));
        assertTrue("Checking Even no.", app.check(6));
    }

    @Test
    public void testOddNum() {
        System.out.println("Tests for odd Numbers");
        assertFalse("Checking Odd no.", app.check(7));
        assertFalse("Checking Odd no.", app.check(3));
    }

    
}