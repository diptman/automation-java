package org.example;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstFileWithTest {
    @Test
    private void firstTest() {
        Reporter.log("Writing first sample test ", true);
    }
}
