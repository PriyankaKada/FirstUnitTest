package com.example.firstunittest.utils

import android.content.Context

class ResourceComparer
{

    fun isEqual(context: Context,  resourseId:Int,  string:String):Boolean{
        return context.getString(resourseId)==string
    }
}