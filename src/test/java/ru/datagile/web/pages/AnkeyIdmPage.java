package ru.datagile.web.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class AnkeyIdmPage {
    SelenideElement
            H1 = $("h1");

    public void checkH1(){
        Selenide.sleep(5000);
        H1.shouldBe(visible).shouldHave(text("Ankey IDM"));
    }
}
