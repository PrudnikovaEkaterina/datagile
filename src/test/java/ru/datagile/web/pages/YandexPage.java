package ru.datagile.web.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class YandexPage {
    private final SelenideElement
            INPUT_SEARCH = $(".HeaderDesktopForm-Input.mini-suggest__input"),
            TITLE_CONTENT = $$(".OrganicTitleContentSpan.organic__title").first(),
            CLOSE_BUTTON_OUTER = $(".Button2.Button2_pin_circle-circle.Button2_size_l.DistributionSplashScreenModal-CloseButtonOuter");


    @Step("Open Yandex Page")
    public YandexPage openYandexPage() {
        open("https://yandex.ru/search/");
        return this;
    }

    @Step("Set search value")
    public YandexPage setSearchValue(String value) {
        INPUT_SEARCH.setValue(value).pressEnter();
        return this;
    }

    @Step("Close modal")
    public void closeModalContent() {
        CLOSE_BUTTON_OUTER.click();
        TITLE_CONTENT.click();
        Selenide.switchTo().window(1);
    }
}
