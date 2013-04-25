package com.jayway.gradledemo;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DemoTest {

    @Test
    public void verifySuccess() {
        assertTrue(new Demo().success());
    }

    @Test
    public void verifyIsSuccess() {
        assertTrue(new Demo().success());
    }

    @Test
    public void verifyFailure() {
        assertFalse(new Demo().fail());
    }
}
