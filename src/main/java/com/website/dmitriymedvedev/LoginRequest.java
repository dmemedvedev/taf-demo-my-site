package com.website.dmitriymedvedev;

import static com.google.common.base.Predicates.equalTo;

public class LoginRequest {
    public static final String VK_LOGIN_URL = "https://login.vk.com/?act=connect_user_info";

    public static io.restassured.response.ValidatableResponse getVKBody(io.restassured.response.ValidatableResponse response) {
        return response.body("error_info", equalTo("Некарэктны URL"));
    }

}
