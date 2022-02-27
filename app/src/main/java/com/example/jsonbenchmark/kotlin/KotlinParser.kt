package com.example.jsonbenchmark.kotlin

import android.content.Context
import com.example.jsonbenchmark.Utils
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json


class KotlinParser(context: Context) {

    private val sample1 = Utils.loadJSONFromAsset(context, "sample1.json")
    private val sample2 = Utils.loadJSONFromAsset(context, "sample2.json")
    private val sample3 = Utils.loadJSONFromAsset(context, "sample3.json")

    fun parseSample1(): List<UserKotlin> {
        return Json.decodeFromString(sample1)
    }

    fun parseSample2(): List<UserKotlin> {
        return Json.decodeFromString(sample2)
    }

    fun parseSample3(): PhotosKotlin {
        return Json.decodeFromString(sample3)
    }
}