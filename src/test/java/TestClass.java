import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TestClass extends TestBaseClass{
    @DisplayName("First Test")
    @Test
    void firstTest(){
        // given().when().get("").then().statusCode(0);
        System.out.println("firstTest");
    }
    @DisplayName("Second Test")
    @Test
    void secondTest(){
        // given().when().post("").then().statusCode(0);
        System.out.println("SecondTest");
    }
    @DisplayName("Third Test")
    @Test
    void thirdTest(){
        // given().when().put("").then().statusCode(0);
        System.out.println("ThirdTest");
    }
    @DisplayName("Fourth Test")
    @Test
    void fourthTest(){
        // given().when().delete("").then().statusCode(0);
        System.out.println("FourthTest");
    }
}
