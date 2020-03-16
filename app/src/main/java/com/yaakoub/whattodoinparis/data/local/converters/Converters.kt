package com.yaakoub.whattodoinparis.data.local.converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type
import java.util.*

class Converters {
    @TypeConverter
    fun calendarToTimestamp(calendar: Calendar): Long = calendar.timeInMillis

    @TypeConverter fun timestampToCalendar(value: Long): Calendar =
        Calendar.getInstance().apply { timeInMillis = value }

    @TypeConverter
    fun fromString(value: String?): ArrayList<String?>? {
        val listType: Type = object : TypeToken<ArrayList<String?>?>() {}.type
        return Gson().fromJson(value, listType)
    }

    @TypeConverter
    fun fromStringList(list: ArrayList<String?>?): String? {
        return Gson().toJson(list)
    }

    @TypeConverter
    fun fromJson(value: String?): ArrayList<Double?>? {
        val listType: Type = object : TypeToken<ArrayList<Double?>?>() {}.type
        return Gson().fromJson(value, listType)
    }

    @TypeConverter
    fun fromDoubleList(list: ArrayList<Double?>?): String? {
        return Gson().toJson(list)
    }
}