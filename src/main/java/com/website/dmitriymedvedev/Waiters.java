package com.website.dmitriymedvedev;

public class Waiters {
        public static void waitFor(int seconds) {
            try {
                Thread.sleep(seconds * 1000);
            } catch (Exception e){
            }
        }
    }
