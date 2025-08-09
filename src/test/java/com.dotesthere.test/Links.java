package com.dotesthere.test;

import com.microsoft.playwright.*;

import java.util.List;

public class Links {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext browserContext = browser.newContext();
        Page page = browserContext.newPage();
        page.navigate("https://dotesthere.com");
        List<ElementHandle> links = page.querySelectorAll("//a");
        for(ElementHandle l : links){
            System.out.println(l.getAttribute("href"));
        }


    }
}
