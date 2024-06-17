package com.example.firstunittest

import android.content.Context
import com.google.gson.Gson

class QuoteManager {
    var quoteList= emptyArray<Quote>()
    fun populateQuoteFromAssets(context: Context, fileName:String){
        val inputStream=context.assets.open(fileName)
        val size:Int = inputStream.available()
        val buffer = ByteArray(size = size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, Charsets.UTF_8)
        val gson = Gson()
        quoteList= gson.fromJson(json, Array<Quote>::class.java)

    }

}