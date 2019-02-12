package com.bluelampcreative.androidmvvm.data.local

import com.bluelampcreative.androidmvvm.models.Dummy

class DataStore {
    fun getDummyData(): List<Dummy> {
        return listOf(Dummy("Hello, dummy"), Dummy("Another greeting"), Dummy("Once again"))
    }
}