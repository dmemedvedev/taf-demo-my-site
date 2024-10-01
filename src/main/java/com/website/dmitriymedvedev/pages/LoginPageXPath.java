package com.website.dmitriymedvedev.pages;

public class LoginPageXPath {

    public static final String INPUT_EMAIL_XPATH = "//input[@type = 'email']";
    public static final String INPUT_PASSWORD_XPATH = "//input[@name = 'password']";
    public static final String BUTTON_ENTER_XPATH = "//button[@class='form-base-submit form-base-submit__login ui-button ui-button--filled-main ui-button--big ui-button--stretch']";
    public static final String BUTTON_PASSWORD_RESET_XPATH = "//a[@href = '/password-reset/']";
    public static final String HEADER_PASSWORD_RESET_XPATH = "//h1[@class = 'form-header__title t t--1']";
    public static final String BUTTON_PROFILE_CREATE_XPATH = "//a[@href = '/register/']";
    public static final String HEADER_REGISTRATION_PAGE_XPATH = "//h1[@class = 'form-header__title t t--1']";

    public static final String FOOTER_VK_AUTH_XPATH = "//a[@href = 'https://id.vk.com/promo']";
    public static final String FOOTER_GOOGLE_AUTH_XPATH = "//a[@href = 'https://accounts.google.com/TOS?loc=BY&hl=ru']";
    public static final String FOOTER_YANDEX_AUTH_XPATH = "(//a[@href = 'https://ya.ru'])[2]";
    public static final String FOOTER_APPLE_AUTH_XPATH = "//div[@class = 'ac-gf-footer-legal-copyright']";

    public static final String BUTTON_VK_XPATH = "//div[@id = 'VKIDSDKAuthButton']";
    public static final String BUTTON_GOOGLE_XPATH = "(//button[@class = 'form-social-list__item-button ui-logged-button ui-logged-button--circle'])[1]";
    public static final String BUTTON_YANDEX_XPATH = "(//button[@class = 'form-social-list__item-button ui-logged-button ui-logged-button--circle'])[2]";
    public static final String BUTTON_APPLE_XPATH = "(//button[@class = 'form-social-list__item-button ui-logged-button ui-logged-button--circle'])[3]";

    public static final String ERROR_EMAIL_XPATH = "//span[@class = 'ui-field__desc ui-field__desc--error']";
    public static final String ERROR_LOGIN_XPATH = "//span[@class = 'ui-snackbar__text f f--12']";


}
