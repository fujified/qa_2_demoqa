package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import java.io.File;

public class Config {
    File image = new File("/Users/r/IdeaProjects/qa_2_demoqa/src/test/java/resources/spock.jpg");

    String firstname = "mr";
    String lastname = "spock";
    String email = "mrspock@mac.com";
    String mobile = "8125705666";
    String address = "nevsky";
    String state = "Rajasthan";
    String city = "Jaipur";

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }
}
