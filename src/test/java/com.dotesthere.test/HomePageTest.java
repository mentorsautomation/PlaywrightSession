package com.dotesthere.test;
import com.microsoft.playwright.*;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;


public class HomePageTest {
    public static void main(String[] args) {
       Playwright playwright = Playwright.create();
       Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://www.dotesthere.com");
        page.fill("//input[@id='username']","ankur",new Page.FillOptions().setTimeout(10000));
        page.fill("//input[@id='password']","automation",new Page.FillOptions().setTimeout(1000));
        page.click("//button[text()='Login']");
    }
}
