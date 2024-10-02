package com.webisite.dmitriymedvedev.apitests.models;

import java.util.HashMap;
import java.util.Map;

public class LoginRequest {
    public static final String BEARER_TOKEN = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiI5YTczZmEyYi0yOTk4LTRlNjEtYWU5YS02N2NmMzdhZmQyZWIiLCJqdGkiOiJhYzFlZmM0ZTI0ZTJjZWQyMTU2ZTA0Zjk4MDI2N2E2OTk2YmY3OTM3NzEyNGEzMTE4ZjJlOTQ0MDc3ZjAyYjkyZTQwMzZmNDdlNzQzYTQ5NiIsImlhdCI6MTcyNzg0ODI3Mi4yMjI2NjksIm5iZiI6MTcyNzg0ODI3Mi4yMjI2NzIsImV4cCI6MTcyNzg5MTQ3Mi4yMDQ5NzUsInN1YiI6IjQwMDk4MzciLCJyb2xlcyI6W10sInJvbGVzX2J5X2NvbXBhbmllcyI6e30sImlzX2Jsb2NrZWQiOmZhbHNlLCJzY29wZXMiOlsib3BlbmlkIiwiZW1haWwiLCJwcm9maWxlIiwicm9sZXMiLCJwZXJtaXNzaW9ucyJdfQ.mUGGF80JTObwE772FFAwMq4DetMPP_B19AYgB43mRHynBSn0ZIu9Lgg3oNJznhhI4APYowZ0w_KT1xKSUUDwBUlUUm6Cil_r8m6NODqpPbIvyRZkimjAS8JFGxhlG2WInu9Z5j7YZh_-JpXOeiLcPQKWKax60oma_nyGsdDVC3Onl9uCLHMV0TJfoijwNqBIwcrTNZzL75IyaJVu4_e7GXwRaz74prM8XtfPUSxLWM6IZNehI4RAcF4EUEps5WYmFffFLR4sLxRVZE4BYawKf6RdXvT4w3kx-7zyJtlIo4VVPC7mzBsL71kshhu6mGPdm4vfHRAfJ30cTB_51KYms2i_pQ2tBaBaHMHebCzaOQJgt9gfZQM1jWxKjxUZsKjWASsbzfVVCOXgjzBNb2Zf-_TFEc3QamOmnzeE0k2rpILyo15LHkZ7F7TPZ2rYpEFLyQ6E5f6hHvju_6hykb1ew6ct2Eg4H-9Ji3TTaji8Moz4m7W6zZmbSfPOhyQhpIXHU5gHFI1vY9UeODeTW1aEP4FO5ryAUpbbqz2lsVnZ0VOha6eW-8-m1my6QpfPXkHiEMqLo0XR5R_FlDzMkTzo8-i67bo5v5jFKnR7WJjgYEWknxa3yVIny8z_kBWKkDgV80iwdIAHq2GBCheak-geORtBo-ycnOZTDVkvgZNeNFk";
    public static final String VK_LOGIN_URL = "https://login.vk.com/?act=connect_user_info";
    public static final String VK_USER_INFO_URL = "https://passport.skillbox.ru/api/userinfo";
    public static final String APPLE_LOGIN_URL = "https://passport.skillbox.ru/login/apple/";
    public static final String NOT_LOGIN_URL = "https://passport.skillbox.ru/authapi/v1/user/";
    public static final String NOT_AUTH_CURRENT_URL = "https://go.skillbox.ru/api/v3/users/current/";
    public static final String CURRENT_USER_AUTH_URL = "https://go.skillbox.ru/api/v3/users/current";
    public static final String SUPPORT_LANGUAGE_URL = "https://go.skillbox.ru/api/v3/languages/";
    public static final String CURRENT_SETTINGS_URL = "https://go.skillbox.ru/api/v3/system/settings/";

    public static String[] getVKLoginErrorInfo() {
        return new String[]{"error_info", "Некарэктны URL"};
    }

    public static String[] userInfoResponse() {
        return new String[]{"email", "dzmitryi.miadzvedzeu@gmail.com"};
    }

    public static String[] notLoginResponse() {
        return new String[]{"message", "Unauthenticated."};
    }

    public static String[] notAuthCurrentResponse() {
        return new String[]{"data", "Учетные данные не были предоставлены."};
    }

    public static String[] authCurrentResponse() {
        return new String[]{"first_name", "Дмитрий", "last_name", "Медведев"};
    }

    public static String[] langSupportResponse() {
        return new String[]{"name", "Ўзбекча", "Қазақша", "Русский", "English"};
    }

    public static String[] currentSettingsResponse() {
        return new String[]{"employment_course_id", "eb866d28-6439-435f-878f-391775b618a7", "onboarding_course_id", "6cb6e03d-d21c-448a-b491-52e683193fc9"};
    }

    public static Map<String, String> getHeaders() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Accept", "application/json, text/plain, */*");
        return headers;
    }

    public static Map<String, String> getHeadersAuth() {
        Map<String, String> headers = new HashMap<>();
        headers.put("X-Auth-Passport", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiI5YTczZmEyYi0yOTk4LTRlNjEtYWU5YS02N2NmMzdhZmQyZWIiLCJqdGkiOiJhYzFlZmM0ZTI0ZTJjZWQyMTU2ZTA0Zjk4MDI2N2E2OTk2YmY3OTM3NzEyNGEzMTE4ZjJlOTQ0MDc3ZjAyYjkyZTQwMzZmNDdlNzQzYTQ5NiIsImlhdCI6MTcyNzg0ODI3Mi4yMjI2NjksIm5iZiI6MTcyNzg0ODI3Mi4yMjI2NzIsImV4cCI6MTcyNzg5MTQ3Mi4yMDQ5NzUsInN1YiI6IjQwMDk4MzciLCJyb2xlcyI6W10sInJvbGVzX2J5X2NvbXBhbmllcyI6e30sImlzX2Jsb2NrZWQiOmZhbHNlLCJzY29wZXMiOlsib3BlbmlkIiwiZW1haWwiLCJwcm9maWxlIiwicm9sZXMiLCJwZXJtaXNzaW9ucyJdfQ.mUGGF80JTObwE772FFAwMq4DetMPP_B19AYgB43mRHynBSn0ZIu9Lgg3oNJznhhI4APYowZ0w_KT1xKSUUDwBUlUUm6Cil_r8m6NODqpPbIvyRZkimjAS8JFGxhlG2WInu9Z5j7YZh_-JpXOeiLcPQKWKax60oma_nyGsdDVC3Onl9uCLHMV0TJfoijwNqBIwcrTNZzL75IyaJVu4_e7GXwRaz74prM8XtfPUSxLWM6IZNehI4RAcF4EUEps5WYmFffFLR4sLxRVZE4BYawKf6RdXvT4w3kx-7zyJtlIo4VVPC7mzBsL71kshhu6mGPdm4vfHRAfJ30cTB_51KYms2i_pQ2tBaBaHMHebCzaOQJgt9gfZQM1jWxKjxUZsKjWASsbzfVVCOXgjzBNb2Zf-_TFEc3QamOmnzeE0k2rpILyo15LHkZ7F7TPZ2rYpEFLyQ6E5f6hHvju_6hykb1ew6ct2Eg4H-9Ji3TTaji8Moz4m7W6zZmbSfPOhyQhpIXHU5gHFI1vY9UeODeTW1aEP4FO5ryAUpbbqz2lsVnZ0VOha6eW-8-m1my6QpfPXkHiEMqLo0XR5R_FlDzMkTzo8-i67bo5v5jFKnR7WJjgYEWknxa3yVIny8z_kBWKkDgV80iwdIAHq2GBCheak-geORtBo-ycnOZTDVkvgZNeNFk");
        return headers;
    }
}
