package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidationTest {
    @Test
    void thePasswordShouldBeValid() {
        Boolean password = false;

        Boolean actual = PasswordValidation.validPassword(String.valueOf(password));

        assertEquals(false, actual);
    }
    @Test
    void theCheckedPasswordShouldBeInvalid() {
        Boolean badpass = true;

        Boolean actual = PasswordValidation.checkBadPassword(String.valueOf(badpass));

        assertEquals(true, actual);
    }
}