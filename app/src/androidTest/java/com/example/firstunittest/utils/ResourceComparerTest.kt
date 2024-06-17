package com.example.firstunittest.utils

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.example.firstunittest.R


import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class ResourceComparerTest {
    private lateinit var resourseComparer:ResourceComparer
    @Before
    fun setUp() {
        resourseComparer= ResourceComparer()
    }

    @After
    fun tearDown() {
    }
    @Test
    fun stringResourceSameAsGivenStringReturnsTrue(){
        val context=ApplicationProvider.getApplicationContext<Context>()
        val result= resourseComparer.isEqual(context, R.string.app_name,"FirstUnitTest")
        assertEquals(result,true)
    }
    @Test
    fun stringResourceDifferentAsGivenStringReturnsFalse(){
        val context=ApplicationProvider.getApplicationContext<Context>()
        val result= resourseComparer.isEqual(context, R.string.app_name,"FirstUnitTestTest")
        assertEquals(result,false)
    }
}