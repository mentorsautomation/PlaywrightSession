package com.dotesthere.test;

import com.microsoft.playwright.*;

public class AlertBoxTest {
    public static void main ( String [] args) throws InterruptedException {

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext browserContext = browser.newContext();
        Page page = browserContext.newPage();

        page.navigate("https://www.dotesthere.com");
        page.click("//div//button[text()='Click for JS Alert']");
        Thread.sleep(5000);
        page.onDialog(dialog -> {
            System.out.println(dialog.message());
            dialog.accept(); });

    }

}
