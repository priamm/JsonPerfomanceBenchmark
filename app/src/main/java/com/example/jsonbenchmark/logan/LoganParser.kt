package com.example.jsonbenchmark.logan

import android.content.Context
import com.bluelinelabs.logansquare.LoganSquare
import com.example.jsonbenchmark.Utils

class LoganParser(context: Context) {

    private val sample1 = Utils.loadJSONFromAsset(context, "sample1.json")
    private val sample2 = Utils.loadJSONFromAsset(context, "sample2.json")
    private val sample3 = Utils.loadJSONFromAsset(context, "sample3.json")


    fun parseSample1(): List<UserLogan> {
        return LoganSquare.parseList(sample1, UserLogan::class.java)
    }

    fun parseSample2(): List<UserLogan> {
        return LoganSquare.parseList(sample2, UserLogan::class.java)
    }

    fun parseSample3(): PhotoLogan {
        return LoganSquare.parse(sample3,PhotoLogan::class.java)
    }
}