package com.example.firstunittest.utils

import org.junit.Assert.*
import org.junit.Test

/** Arrange--> Create classes
    Act--> Test Logic
    Assert--> given this input this is expected output
* */
class HelperTest{
    //Arrange
    val helper=Helper()

    @Test
    fun isPalindrome()
    {
        // Arrange
        val result=helper.isPalindrome("Hello")
        // Assert
        assertEquals(false,result)

    }
    @Test
    fun isPalindrome_input_value_level()
    {
        // Arrange
        val result=helper.isPalindrome("level")
        // Assert
        assertEquals(true,result)

    }

}
