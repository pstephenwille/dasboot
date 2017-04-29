package me.dasboot;

import org.junit.Test;

import me.dasboot.controller.HomeController;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testApp() {
        HomeController hc = new HomeController();
        String result = hc.home();
        assertEquals(result, "Das bmoot, reporting for duty!");
    }
}
