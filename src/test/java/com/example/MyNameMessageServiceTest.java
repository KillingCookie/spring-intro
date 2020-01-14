package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyNameMessageServiceTest {

    @Test
    public void shouldReturnMyNameAsMessage() {
        String expectedMessage = "Ihor Uhorchuk";
        MyNameMessageService myNameMessageService = new MyNameMessageService();

        assertEquals(expectedMessage, myNameMessageService.getMessage());
    }
}
