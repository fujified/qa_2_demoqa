package tests;

import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeForm extends Config {

    @Test
    void dataInPracticeForm() {

        open("https://demoqa.com/automation-practice-form");
        $(".main-header").shouldHave(text("Practice Form"));

        $("#firstName").setValue(firstname);
        $("#lastName").setValue(lastname);
        $("#userEmail").setValue(email);
        $("[for='gender-radio-1']").click();
        $("#userNumber").setValue(mobile);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionByValue("4");
        $(".react-datepicker__year-select").selectOptionByValue("1985");
        $(".react-datepicker__day.react-datepicker__day--013").click();
        $("#subjectsInput").setValue(subjects).pressEnter();
        $("[for='hobbies-checkbox-1']").click();
        $("[for='hobbies-checkbox-2']").click();
        $(byText("Select picture")).click();
        $("#uploadPicture").uploadFile(new File(String.valueOf(image)));
        $("#currentAddress").setValue(address);
        $("#react-select-3-input").setValue(state).pressEnter();
        $("#react-select-4-input").setValue(city).pressEnter();
        $("#submit").click();

        $(".table-responsive").shouldHave(text(firstname), text(lastname), text(email), text(mobile),
                text("Male"), text(mobile), text("13 May,1985"), text("Hindi"), text("Sports, Reading"),
                text("spock.jpg"), text(address), text(state), text(city));
        $("#closeLargeModal").click();
    }
  }