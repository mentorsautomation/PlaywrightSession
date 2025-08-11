package com.dotesthere.test;

import com.microsoft.playwright.*;

public class CheckBoxes {
    public static void main(String[] args) {
        Playwright playwrite = Playwright.create();
        Browser browser = playwrite.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext browserContext = browser.newContext();
        Page page = browserContext.newPage();
        page.navigate("https://www.dotesthere.com");
        page.click("//input[@id='checkbox1']");

    }
}
