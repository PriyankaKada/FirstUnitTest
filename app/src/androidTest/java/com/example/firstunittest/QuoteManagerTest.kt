package com.example.firstunittest

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.gson.JsonSyntaxException
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test
import java.io.FileNotFoundException

class QuoteManagerTest {

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test(expected = FileNotFoundException::class)
    fun populateQuoteFromAssets() {
        val quoteManager=QuoteManager()
        val context=ApplicationProvider.getApplicationContext<Context>()
        quoteManager.populateQuoteFromAssets(context,"")
    }
    @Test(expected = JsonSyntaxException::class)
    fun populateQuoteFromAssetsInvalidJson() {
        val quoteManager=QuoteManager()
        val context=ApplicationProvider.getApplicationContext<Context>()
        quoteManager.populateQuoteFromAssets(context,"malformed.json")
    }
    @Test()
    fun populateQuoteFromAssetsValidJson() {
        val quoteManager=QuoteManager()
        val context=ApplicationProvider.getApplicationContext<Context>()
        quoteManager.populateQuoteFromAssets(context,"quotes.json")
    }
}