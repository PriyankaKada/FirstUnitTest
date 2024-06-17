package com.example.firstunittest.utils

class Helper {
    fun isPalindrome(string: String):Boolean{

      var i=0
        var j=string.length-1
        while(i<=j){
            if(string[i]!=string[j]){
                return false

            }
            i+=1;
            j-=1;
        }
        return true

    }
}