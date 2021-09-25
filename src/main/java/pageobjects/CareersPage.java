package pageobjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selectors.*;

public class CareersPage {
    SelenideElement locationSelectorBtn = $(byXpath("//button[@class='location-selector__button']"));
    ElementsCollection listCountryForLocation = $$(byXpath("//li[@class='location-selector__item']"));
    SelenideElement keywordField = $(byXpath("//input[@id='new_form_job_search_1445745853_copy-keyword']"));
    SelenideElement locationSelector = $(byXpath("//span[@class='select2-selection__rendered']"));
    SelenideElement skillsField = $(byXpath("//div[@class='selected-params ']"));
    SelenideElement remoteCheckBox = $(byXpath("//input[@id='id-ce1e74aa-e69b-3bd2-9f9f-41628029ec68-remote']"));
    SelenideElement findBtn = $(byXpath("//button[@class='recruiting-search__submit']"));

    public void clickLocationSelectorBtn() {
        locationSelectorBtn.click();
    }

    public void setKeywordField(String text) {
        keywordField.sendKeys(text);
    }

    public void setLocationSelector(String text) {
        locationSelector.sendKeys(text);
    }

    public void setSkillsField(SelenideElement skillsField) {
        this.skillsField = skillsField;
    }

    public void setRemoteCheckBox(SelenideElement remoteCheckBox) {
        this.remoteCheckBox = remoteCheckBox;
    }

    public void setFindBtn(SelenideElement findBtn) {
        this.findBtn = findBtn;
    }
}
