package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class StringsUtilsTest {

    @Test
    public void is_not_UniqueChars(){

        assertFalse(StringUtils.areUniqueChars("29s2"));
        assertFalse(StringUtils.areUniqueChars("1903aio9p"));
    }

    @Test
    public void is_UniqueChars(){
        assertTrue(StringUtils.areUniqueChars("29s13"));
        assertTrue(StringUtils.areUniqueChars("2813450769"));
    }
}
