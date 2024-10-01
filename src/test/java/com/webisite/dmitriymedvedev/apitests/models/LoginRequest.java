package com.webisite.dmitriymedvedev.apitests.models;

import java.util.HashMap;
import java.util.Map;

public class LoginRequest {
    public static final String BEARER_TOKEN = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiI5YTczZmEyYi0yOTk4LTRlNjEtYWU5YS02N2NmMzdhZmQyZWIiLCJqdGkiOiI4MTFmM2IyZTZkOTlhMzBiYTVlYzAxNzBkMWYzMTg4YzQwMzI2NWU0MGQwNWMzMzY3YjRjMjk1YWVlMzkzMzlmNTMzNTNjMTIyMWM0Y2IyMyIsImlhdCI6MTcyNzc5MDcyOC42NDYxOTksIm5iZiI6MTcyNzc5MDcyOC42NDYyMDIsImV4cCI6MTcyNzgzMzkyOC42MTE3NDQsInN1YiI6IjQwMDk4MzciLCJyb2xlcyI6W10sInJvbGVzX2J5X2NvbXBhbmllcyI6e30sImlzX2Jsb2NrZWQiOmZhbHNlLCJzY29wZXMiOlsib3BlbmlkIiwiZW1haWwiLCJwcm9maWxlIiwicm9sZXMiLCJwZXJtaXNzaW9ucyJdfQ.HQ0R5hY2rrz_aT1PttNUj61ak6Ha6D3jBvfS3X0b8Dqi8ScNOiEaV9190TPvezsrd_uTfeQftmdKd10whH2Qn8ISyGtHbfp4GDr2k53-MwbOsTJD9IoOexA9RascTveDoOkQcpspxav8_N5tIDjy1hSRPmWLVjNcJ_Bnu0p2q-cc0ekWV40qD0SoM9dYyo-lRDZ09bskPiJ_JkaHNC4eYVEDd3S4rS3WHKnhbtL7n9UyTuXY-SVNZgtezYQiRBfh3l5NsksD5sbk2q8djq7zgwjvDJVxPwxKopMKfFadVGP4OYoTw5ZkxF6qWyTLjYjG-rcex8QkkbKMzTw2HS3sxG94a0ytn4f7VjVtn5lt1KVKM1t5gcsJPQ31sPL79NJUzRkGpcEVSnTsnwQhF5r0RsvsL8cgJ4njuhNOnbkSmFugr-5BAmoapUpbjtUjVzRg_WO4HWgb2PHRtr4O5Mea_nmSMfhiP2rnpODDAk7YkU_PlSHHCQP98q9rEWHGwpkNaOck6GIawCm0Zy8cnfuUWtS0H7bBKaSEFnMX0tRsZ_3EOdHGamWYmopRo5q20zYGRy9tEHwDRG1LTSqUysr1BF6ODOKrjwogT38lnUmzoBU8bQ3V5S1kuqiIs37cBLk8gjU-kyDWtfBNe1RWj5LoLCmImJ3oUXD7sx2O6kvXJlQ";
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
        headers.put("X-Auth-Passport", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiI5YTczZmEyYi0yOTk4LTRlNjEtYWU5YS02N2NmMzdhZmQyZWIiLCJqdGkiOiIyMGQ3OGZmNTVlZjRiOTczYmMyM2ExMDI0ZTMwZmU4NjQ1YjBjYzBmZWJkMWJiZTk2YjJjZmJmMjUyN2NkODUzNzMzNGMzNGI4NzY3MDI4NSIsImlhdCI6MTcyNzMyODE1Mi43Mzg2NDcsIm5iZiI6MTcyNzMyODE1Mi43Mzg2NDksImV4cCI6MTcyNzM3MTM1Mi43MjIxOTYsInN1YiI6IjQwMDk4MzciLCJyb2xlcyI6W10sInJvbGVzX2J5X2NvbXBhbmllcyI6e30sImlzX2Jsb2NrZWQiOmZhbHNlLCJzY29wZXMiOlsib3BlbmlkIiwiZW1haWwiLCJwcm9maWxlIiwicm9sZXMiLCJwZXJtaXNzaW9ucyJdfQ.Fa5Vjvz-bVMLvx0bajYajnD7R9L2i16iPl3_Kco-woMaRMkISfH6AunxQebf5BFQ5aYZDyFB0MxYCQwr0AemxoVTm_IH4bNi1Jo_dcjly0Td5QF16XvQYRyU84qQXYZb2mq3agHLHzhifDY3_xf0azIXI4uQKPjWItFMlDBYP8C-3Jx-iBq1mYs_IvklFWHqfBA4YTccpiG_0mLFlehAN0NWz-jqVtm8adkl-msrgVsf-2JgfN29dH6vYWuv9qz2pxI5riKxydvnHAsUi9tXAaH5kI_dtW0_3e5TXMjg7Iij9KGNeeyumgVMDQy4FmkfFO7gRGVb0yYkIg6mAWTxQWPzvjtod52z7TdU_LLHKkVpG2xPtQXJ0T4nm3w1pvcnyNLuqoRm0zVPEuKOmOGbA5YR19qgnNdu2T1nrPRPy4Oqwa9fx_2RkQWG48jN359HSaZiTIxr4bVe0D3fAGYbr2aRX2wx2XlnIJcm7eV58CFgRJe50R9zU4AetVnvAuOixeYqJN1dOARQtFh6fBhNOw-TfxORLjCs4qmefdWWGub2na21qVhlaTKy9DohJuAMP93yZFQ0kPrrqISe2Yitr0wST0v7n2p7PV39MwQ4bGVmLS3Oo27GWpy8726Vo-_NQP-m0UAadVLIKjgW3LtzsVaHv-utPsWb9wkUjL5n4ic");
        return headers;
    }
}
