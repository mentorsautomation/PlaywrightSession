package com.dotesthere.test;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.SelectOption;

import java.util.List;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium()
                .launch(new BrowserType.LaunchOptions()
                        .setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://dotesthere.com");
        List<ElementHandle> selectors = page.querySelectorAll("//select[@id='dropdown']//option");
        for(ElementHandle ele : selectors){
            System.out.println(ele.innerText() +"===="+ele.getAttribute("value"));
        }
        playwright.close();


    }
}
