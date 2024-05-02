package ru.datagile.web.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class GazIsPage {
    SelenideElement
            ITEM_PRODUCTS = $$(".main-nav__item-link").get(1),
            ANKEY_LINK = $("[href='/produkty/upravlenie-ib/ankey-idm']");


    @Step("Click to item Products")
    public GazIsPage clickToItemProducts() {
        ITEM_PRODUCTS.click();
        return this;
    }

    @Step("Click to Ankey IDM")
    public void clickToAnkeyLink() {
        ANKEY_LINK.click();
    }
}
