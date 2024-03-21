package org.example;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class StringsUtilsTest {

    @Test
    public void is_not_UniqueChars(){

        Assertions.assertFalse(StringUtils.areUniqueChars("29s2"));
        Assertions.assertFalse(StringUtils.areUniqueChars("1903aio9p"));
    }

    @Test
    public void is_UniqueChars(){
        Assertions.assertTrue(StringUtils.areUniqueChars("29s13"));
        Assertions.assertTrue(StringUtils.areUniqueChars("2813450769"));
    }
}
