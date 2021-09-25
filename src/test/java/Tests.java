import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class Tests {

    @BeforeAll
    static void setup(){
        open("https://www.epam.com/careers");
    }
    
    @Test
    public void openCareersPage(){

    }
}
