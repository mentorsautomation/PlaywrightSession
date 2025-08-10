package com.dotesthere.test;

import com.microsoft.playwright.*;

public class IframeTest {
    public static void main(String[] args) {

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext browserContext = browser.newContext();
        Page page = browserContext.newPage();

        page.navigate("https://www.dotesthere.com");

        System.out.println("Frame 1 Heading: " + page.frameLocator("#frame1")
                .locator("h3").innerText());
        System.out.println("Frame 1 Body: " + page.frameLocator("#frame1")
                .locator("p").innerText());

    }
}
