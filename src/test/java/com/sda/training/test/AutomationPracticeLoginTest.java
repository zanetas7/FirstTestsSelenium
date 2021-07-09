package com.sda.training.test;

import com.sda.training.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.hamcrest.MatcherAssert.assertThat;

public class AutomationPracticeLoginTest extends WebDriverManager {

    @Before
    public void setUp() throws Exception {
        startDriver();
        DRIVER.get("http://automationpractice.com/");
        Thread.sleep(10000);

    }

    @After
    public void tearDown() throws Exception {
        destroyDriver();
    }

    @Test
    public void firstMyTest() {
        System.out.println("This is place to add invalid login tests");





        WebElement errorMessage = DRIVER.findElement(By.id("to be added"));
        assertThat("Error message should be displayed with expected text ", errorMessage.getText().contains("An email address required."));

    }

}
