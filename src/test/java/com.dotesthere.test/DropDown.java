package com.dotesthere.test;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.SelectOption;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium()
                .launch(new BrowserType.LaunchOptions()
                        .setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://dotesthere.com");
        page.goBack();
        page.goForward();
        page.reload();
        Locator select = page.locator("//select[@id='dropdown']");
        //select by value
        select.selectOption("1");
        Thread.sleep(3000);
        //select by Text
        select.selectOption(new SelectOption().setLabel("Option 1"));
        Thread.sleep(3000);
        //select by Index
        select.selectOption(new SelectOption().setIndex(2));

//        playwright.close();


    }
}
