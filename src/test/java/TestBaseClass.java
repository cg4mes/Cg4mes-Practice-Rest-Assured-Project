import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class TestBaseClass {
    @BeforeAll
    public static void init(){
        RestAssured.baseURI = "";
        RestAssured.port = 0;
        RestAssured.basePath = "";
    }
}
