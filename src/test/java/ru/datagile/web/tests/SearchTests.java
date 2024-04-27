package ru.datagile.web.tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.datagile.web.helpers.Attach;
import ru.datagile.web.pages.AnkeyIdmPage;
import ru.datagile.web.pages.GazIsPage;
import ru.datagile.web.pages.YandexPage;

public class SearchTests {
    YandexPage yandexSearchPage = new YandexPage();
    GazIsPage gazIsPage = new GazIsPage();
    AnkeyIdmPage ankeyIdmPage = new AnkeyIdmPage();

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Selenide.closeWebDriver();
    }

    @Test
    @DisplayName("Execution of test script")
    void executionTestScript() {
        String searchValue = "Газинформсервис";
        yandexSearchPage
                .openYandexPage()
                .setSearchValue(searchValue)
                .closeModalContent();
        gazIsPage
                .clickToItemProducts()
                .clickToAnkeyLink();

        ankeyIdmPage.checkH1();
    }
}
