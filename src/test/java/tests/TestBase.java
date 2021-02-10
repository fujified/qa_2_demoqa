package tests;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeAll;

import java.io.File;

public class TestBase {
    Faker faker = new Faker();

    String randomNumber = RandomStringUtils.randomNumeric(6);

    File image = new File("/Users/r/IdeaProjects/qa_2_demoqa/src/test/java/resources/spock.jpg");

    String firstname = faker.name().firstName();
    String lastname = faker.name().lastName();
    String email = faker.internet().emailAddress("helloworld");
    String mobile = 7812 + randomNumber;
//    String mobile = faker.phoneNumber().subscriberNumber(10);
    String subjects = "Hindi";
    String address = faker.address().fullAddress();
    String state = "Rajasthan";
    String city = "Jaipur";

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }
}
