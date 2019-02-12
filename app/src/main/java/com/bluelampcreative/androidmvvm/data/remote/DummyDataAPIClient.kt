package com.bluelampcreative.androidmvvm.data.remote

import com.bluelampcreative.androidmvvm.models.Dummy

class DummyDataAPIClient(private val dummyAPI: DummyAPI) {

    fun getDummyData(): List<Dummy>? {
        return dummyAPI.getDummyData().body()
    }
}