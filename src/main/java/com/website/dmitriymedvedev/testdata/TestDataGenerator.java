package com.website.dmitriymedvedev.testdata;

import com.github.javafaker.Faker;

public class TestDataGenerator {
    private static final Faker faker = new Faker();

    public static String generateEmail() {
        return faker.internet().emailAddress();
    }

    public static String generateInvalidEmail() {
        String validEmail = faker.internet().emailAddress();
        return validEmail.replaceFirst("@", "@@");
    }

    public static String generatePassword() {
        return faker.internet().password();
    }
}
