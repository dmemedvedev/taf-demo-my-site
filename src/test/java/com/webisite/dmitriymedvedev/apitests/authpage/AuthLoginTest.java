package com.webisite.dmitriymedvedev.apitests.authpage;


import com.webisite.dmitriymedvedev.apitests.models.LoginRequest;
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
                post(LoginRequest.VK_LOGIN_URL).
                then().
                log().all().
                statusCode(200).
                body(LoginRequest.getVKLoginErrorInfo()[0], equalTo(LoginRequest.getVKLoginErrorInfo()[1]));
    }

    @Test
    public void testUnLogin() {
        given().headers(LoginRequest.getHeaders()).
                when().
                get(LoginRequest.NOT_LOGIN_URL).
                then().
                statusCode(401).
                body(LoginRequest.notLoginResponse()[0], equalTo(LoginRequest.notLoginResponse()[1]));
    }

    @Test
    public void testUserInfo() {
        given()
                .auth().oauth2(LoginRequest.BEARER_TOKEN)
                .get(LoginRequest.VK_USER_INFO_URL)
                .then()
                .log().all()
                .statusCode(200)
                .body(LoginRequest.userInfoResponse()[0], equalTo(LoginRequest.userInfoResponse()[1]));
    }

    @Test
    public void testApplePageLogin() {
        when().
                get(LoginRequest.APPLE_LOGIN_URL).
                then().
                statusCode(200);
    }


    @Test
    public void testCurrentUserNotAuth() {
        when().
                get(LoginRequest.NOT_AUTH_CURRENT_URL).
                then().
                log().all().
                body(LoginRequest.notAuthCurrentResponse()[0], equalTo(LoginRequest.notAuthCurrentResponse()[1])).
                statusCode(401);
    }

    @Test
    public void testCurrentUserAuth() {
        given().headers(LoginRequest.getHeadersAuth()).
                get(LoginRequest.CURRENT_USER_AUTH_URL).
                then().
                log().all().
                body(LoginRequest.authCurrentResponse()[0], equalTo(LoginRequest.authCurrentResponse()[1])).
                body(LoginRequest.authCurrentResponse()[2], equalTo(LoginRequest.authCurrentResponse()[3])).
                statusCode(200);
    }

    @Test
    public void testLanguagesSupport() {
        when().
                get(LoginRequest.SUPPORT_LANGUAGE_URL).
                then().
                log().all().
                body(LoginRequest.langSupportResponse()[0], hasItems(LoginRequest.langSupportResponse()[1], LoginRequest.langSupportResponse()[2], LoginRequest.langSupportResponse()[3], LoginRequest.langSupportResponse()[4]));
    }

    @Test
    public void testUserSettings() {
        when().
                get(LoginRequest.CURRENT_SETTINGS_URL).
                then().
                log().all().
                body(LoginRequest.currentSettingsResponse()[0], equalTo(LoginRequest.currentSettingsResponse()[1])).
                body(LoginRequest.currentSettingsResponse()[2], equalTo(LoginRequest.currentSettingsResponse()[3])).
                statusCode(200);
    }
}
