package io.arrogantprogrammer;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class AffirmationResourceTest {

    @Test
    void testHelloEndpoint() {
        given()
                .header("Accept", "application/json")
                .when().get("/affirmation")
                .then()
                .statusCode(200)
                .body("text", is("You are amazing!"));
    }
}
