package com.dotesthere.test;

import com.microsoft.playwright.*;


public class Popups {
    static Playwright playwright;
    static Page page;
    public static void main(String[] args) {

        playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext browserContext = browser.newContext();
        page = browserContext.newPage();

        page.navigate("https://www.dotesthere.com");

        Page pop = page.waitForPopup(() -> {
            page.click("//a[text()='Click Here']");
        });

        pop.click("//a[text()='A/B Testing']");
        pop.click("//button[text()='Switch Version']");

        pop.close();
        page.close();
        playwright.close();





    }
}
