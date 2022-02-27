package com.example.jsonbenchmark.gson

import android.content.Context
import com.example.jsonbenchmark.Utils
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class GsonParser(context: Context) {

    private var gson = Gson()

    private val sample1 = Utils.loadJSONFromAsset(context, "sample1.json")
    private val sample2 = Utils.loadJSONFromAsset(context, "sample2.json")
    private val sample3 = Utils.loadJSONFromAsset(context, "sample3.json")

    private val userTypeToken = object : TypeToken<List<UserGson>>() {}.type

    fun parseSample1(): List<UserGson> {
        return gson.fromJson(sample1, userTypeToken)
    }

    fun parseSample2(): List<UserGson> {
        return gson.fromJson(sample2, userTypeToken)
    }

    fun parseSample3(): PhotosGson {
        return gson.fromJson(sample3, PhotosGson::class.java)
    }
}