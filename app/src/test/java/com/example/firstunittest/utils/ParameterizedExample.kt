package com.example.firstunittest.utils

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
@RunWith(value = Parameterized::class)
class ParameterizedExample(val input: String, val output:Boolean) {
@Test
fun test(){
    val helper=Helper()
    val result=helper.isPalindrome(input)
    assertEquals(output,result)
}
    companion object{
        @JvmStatic
        @Parameterized.Parameters(name = "{index}:{0} is palindrome - {1}")
        fun data():List<Array<Any>>{
            return listOf(
                arrayOf("level",true),
                arrayOf("Hello",false),
                arrayOf("",true),
                arrayOf("a",true)


            )
        }
    }


}