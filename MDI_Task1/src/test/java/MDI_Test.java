

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

    public class MDI_Test {

        /* testing only one end point -> /us/90210            */
        private final String BASE_URL = "https://api.zippopotam.us";
        private final String END_POINT = "/us/90210";
        private Response response;

        @BeforeTest
        public void setup() {
            // Store the response before the tests
            response = given()
                    .baseUri(BASE_URL)
                    .when()
                    .get(END_POINT)
                    .then()
                    .extract()
                    .response();
        }

        @Test (priority = 1)
        public void testValidPostalCode() {
            response = RestAssured.get(BASE_URL + END_POINT);
            Assert.assertEquals(response.getStatusCode(), 200);

            String country = response.jsonPath().getString("country");
            String placeName = response.jsonPath().getString("places[0]['place name']");

            Assert.assertEquals(country, "United States");
            Assert.assertEquals(placeName, "Beverly Hills");


        }

        @Test (priority = 2)
        public void testInvalidCountryCode() {
            Response response = RestAssured.get(BASE_URL + "/xx/90210");
            Assert.assertEquals(response.getStatusCode(), 404);
        }

        @Test (priority = 3)
        public void testInvalidPostalCode() {
            Response response = RestAssured.get(BASE_URL + "/us/99999");
            Assert.assertEquals(response.getStatusCode(), 404);
        }

        @Test (priority = 4)
        public void testEmptyCountryCode() {
            Response response = RestAssured.get(BASE_URL + "//90210");
            Assert.assertEquals(response.getStatusCode(), 404);
        }

        @Test (priority = 5)
        public void testEmptyPostalCode() {
            Response response = RestAssured.get(BASE_URL + "/us/");
            Assert.assertEquals(response.getStatusCode(), 404);
        }

        @Test (priority = 6)
        public void testNonExistentPostalCode() {
            Response response = RestAssured.get(BASE_URL + "/us/00000");
            Assert.assertEquals(response.getStatusCode(), 404);
        }

        @Test (priority = 7)
        public void testResponseTime() {
            Response response = RestAssured.get(BASE_URL + END_POINT);
            Assert.assertEquals(response.getStatusCode(), 200);
            Assert.assertTrue(response.time() < 1000);  // Response time less than 1 seconds
        }

        @Test (priority = 8)
        public void testContentTypeValidation() {
            Response response = RestAssured.get(BASE_URL + END_POINT);
            Assert.assertEquals(response.getStatusCode(), 200);
            Assert.assertEquals(response.contentType(), "application/json");
        }


    }
