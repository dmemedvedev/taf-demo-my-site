package com.webisite.dmitriymedvedev.apitests;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

    @Nested
    public class AuthLoginTest {

        @Test
        public void testVKLogin() {
            when().
                    post("\n" +
                            "https://login.vk.com/?act=connect_user_info").
                    then().
                    log().all().
                    statusCode(200).
                    body("error_info", equalTo("Некарэктны URL"));
        }

        @Test
        public void testUnLogin() {
            Map<String,String> headers = new HashMap<>();
            headers.put("Accept","application/json, text/plain, */*");
            given().headers(headers).
                    when().
                    get("\n" +
                            "https://passport.skillbox.ru/authapi/v1/user/").
                    then().
                    statusCode(401).
                    body("message",equalTo("Unauthenticated."));

        }

        @Test
        public void testUserInfo() {
            String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiI5YTczZmEyYi0yOTk4LTRlNjEtYWU5YS02N2NmMzdhZmQyZWIiLCJqdGkiOiIyMGQ3OGZmNTVlZjRiOTczYmMyM2ExMDI0ZTMwZmU4NjQ1YjBjYzBmZWJkMWJiZTk2YjJjZmJmMjUyN2NkODUzNzMzNGMzNGI4NzY3MDI4NSIsImlhdCI6MTcyNzMyODE1Mi43Mzg2NDcsIm5iZiI6MTcyNzMyODE1Mi43Mzg2NDksImV4cCI6MTcyNzM3MTM1Mi43MjIxOTYsInN1YiI6IjQwMDk4MzciLCJyb2xlcyI6W10sInJvbGVzX2J5X2NvbXBhbmllcyI6e30sImlzX2Jsb2NrZWQiOmZhbHNlLCJzY29wZXMiOlsib3BlbmlkIiwiZW1haWwiLCJwcm9maWxlIiwicm9sZXMiLCJwZXJtaXNzaW9ucyJdfQ.Fa5Vjvz-bVMLvx0bajYajnD7R9L2i16iPl3_Kco-woMaRMkISfH6AunxQebf5BFQ5aYZDyFB0MxYCQwr0AemxoVTm_IH4bNi1Jo_dcjly0Td5QF16XvQYRyU84qQXYZb2mq3agHLHzhifDY3_xf0azIXI4uQKPjWItFMlDBYP8C-3Jx-iBq1mYs_IvklFWHqfBA4YTccpiG_0mLFlehAN0NWz-jqVtm8adkl-msrgVsf-2JgfN29dH6vYWuv9qz2pxI5riKxydvnHAsUi9tXAaH5kI_dtW0_3e5TXMjg7Iij9KGNeeyumgVMDQy4FmkfFO7gRGVb0yYkIg6mAWTxQWPzvjtod52z7TdU_LLHKkVpG2xPtQXJ0T4nm3w1pvcnyNLuqoRm0zVPEuKOmOGbA5YR19qgnNdu2T1nrPRPy4Oqwa9fx_2RkQWG48jN359HSaZiTIxr4bVe0D3fAGYbr2aRX2wx2XlnIJcm7eV58CFgRJe50R9zU4AetVnvAuOixeYqJN1dOARQtFh6fBhNOw-TfxORLjCs4qmefdWWGub2na21qVhlaTKy9DohJuAMP93yZFQ0kPrrqISe2Yitr0wST0v7n2p7PV39MwQ4bGVmLS3Oo27GWpy8726Vo-_NQP-m0UAadVLIKjgW3LtzsVaHv-utPsWb9wkUjL5n4ic";

            given()
                    .auth().oauth2(token)
                    .get("https://passport.skillbox.ru/api/userinfo")
                    .then()
                    .log().all()
                    .statusCode(200)
                    .body("email", equalTo("dzmitryi.miadzvedzeu@gmail.com"));
        }

        @Test
        public void testApplePageLogin() {
            when().
                    get("\n" +
                            "https://appleid.apple.com/auth/authorize?client_id=skillbox.passport&redirect_uri=https%3A%2F%2Fpassport.skillbox.ru%2Flogin%2Fapple%2Fcallback&scope=name%20email&response_type=code&response_mode=form_post&state=IqCkRmyn9C6iDrUYdnGmt5aAkng9irlHViSEgEWX&nonce=7848ed76-54a3-4113-a3aa-428206f9df8a.IqCkRmyn9C6iDrUYdnGmt5aAkng9irlHViSEgEWX").
                    then().
                    statusCode(200);
        }


        @Test
        public void testCurrentUserNotAuth() {
            when().
                    get("\n" +
                            "https://go.skillbox.ru/api/v3/users/current/").
                    then().
                    log().all().
                    body("data", equalTo("Учетные данные не были предоставлены.")).
                    statusCode(401);
        }

        @Test
        public void testCurrentUserAuth() {
            Map<String, String> headers = new HashMap<>();
            headers.put("X-Auth-Passport", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiI5YTczZmEyYi0yOTk4LTRlNjEtYWU5YS02N2NmMzdhZmQyZWIiLCJqdGkiOiIyMGQ3OGZmNTVlZjRiOTczYmMyM2ExMDI0ZTMwZmU4NjQ1YjBjYzBmZWJkMWJiZTk2YjJjZmJmMjUyN2NkODUzNzMzNGMzNGI4NzY3MDI4NSIsImlhdCI6MTcyNzMyODE1Mi43Mzg2NDcsIm5iZiI6MTcyNzMyODE1Mi43Mzg2NDksImV4cCI6MTcyNzM3MTM1Mi43MjIxOTYsInN1YiI6IjQwMDk4MzciLCJyb2xlcyI6W10sInJvbGVzX2J5X2NvbXBhbmllcyI6e30sImlzX2Jsb2NrZWQiOmZhbHNlLCJzY29wZXMiOlsib3BlbmlkIiwiZW1haWwiLCJwcm9maWxlIiwicm9sZXMiLCJwZXJtaXNzaW9ucyJdfQ.Fa5Vjvz-bVMLvx0bajYajnD7R9L2i16iPl3_Kco-woMaRMkISfH6AunxQebf5BFQ5aYZDyFB0MxYCQwr0AemxoVTm_IH4bNi1Jo_dcjly0Td5QF16XvQYRyU84qQXYZb2mq3agHLHzhifDY3_xf0azIXI4uQKPjWItFMlDBYP8C-3Jx-iBq1mYs_IvklFWHqfBA4YTccpiG_0mLFlehAN0NWz-jqVtm8adkl-msrgVsf-2JgfN29dH6vYWuv9qz2pxI5riKxydvnHAsUi9tXAaH5kI_dtW0_3e5TXMjg7Iij9KGNeeyumgVMDQy4FmkfFO7gRGVb0yYkIg6mAWTxQWPzvjtod52z7TdU_LLHKkVpG2xPtQXJ0T4nm3w1pvcnyNLuqoRm0zVPEuKOmOGbA5YR19qgnNdu2T1nrPRPy4Oqwa9fx_2RkQWG48jN359HSaZiTIxr4bVe0D3fAGYbr2aRX2wx2XlnIJcm7eV58CFgRJe50R9zU4AetVnvAuOixeYqJN1dOARQtFh6fBhNOw-TfxORLjCs4qmefdWWGub2na21qVhlaTKy9DohJuAMP93yZFQ0kPrrqISe2Yitr0wST0v7n2p7PV39MwQ4bGVmLS3Oo27GWpy8726Vo-_NQP-m0UAadVLIKjgW3LtzsVaHv-utPsWb9wkUjL5n4ic");
            given().headers(headers).
                    get("\n" +
                            "https://go.skillbox.ru/api/v3/users/current/").
                    then().
                    log().all().
                    body("first_name", equalTo("Дмитрий")).
                    body("last_name", equalTo("Медведев")).
                    statusCode(200);
        }

        @Test
        public void testLanguagesSupport() {
            when().
                    get("\n" +
                            "https://go.skillbox.ru/api/v3/languages/").
                    then().
                    log().all().
                    body("name", hasItems("Ўзбекча", "Қазақша", "Русский", "English"));
        }

        @Test
        public void testUserSettings() {
            when().
                    get("\n" +
                            "https://go.skillbox.ru/api/v3/system/settings/").
                    then().
                    log().all().
                    body("employment_course_id", equalTo("eb866d28-6439-435f-878f-391775b618a7")).
                    body("onboarding_course_id", equalTo("6cb6e03d-d21c-448a-b491-52e683193fc9")).
                    statusCode(200);
        }
    }
