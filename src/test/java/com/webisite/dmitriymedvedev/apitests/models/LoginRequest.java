package com.webisite.dmitriymedvedev.apitests.models;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

import static com.google.common.base.Predicates.equalTo;


    public class LoginRequest {
        public static final String VK_LOGIN_URL = "https://login.vk.com/?act=connect_user_info";

    }
