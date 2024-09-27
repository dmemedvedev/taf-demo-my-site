package com.webisite.dmitriymedvedev.apitests.models;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import static com.google.common.base.Predicates.equalTo;


    public class LoginRequest {
        public static final String VK_LOGIN_URL = "https://login.vk.com/?act=connect_user_info";

        public static String[] getVKLoginErrorInfo() {
            return new String[] { "error_info", "Некарэктны URL" };
        }
    }

