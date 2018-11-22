package com.example.demo.utils;

import java.util.UUID;

public class UUIDGenerator {
    public static String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
