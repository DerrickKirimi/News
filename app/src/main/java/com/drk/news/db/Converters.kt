package com.drk.news.db

import androidx.room.TypeConverter
import com.drk.news.models.Source

class Converters {
    @TypeConverter

    fun fromSource(source: Source) : String {
        return source.name
    }

    fun toSource(name: String): Source {
        return Source(name,name)
    }
}