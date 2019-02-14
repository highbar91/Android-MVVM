package com.bluelampcreative.androidmvvm.data.remote

import com.bluelampcreative.androidmvvm.models.Dummy

class DummyDataAPIClient(private val dummyAPI: DummyAPI) {

    suspend fun getDummyData(): List<Dummy>? {
        val result =  dummyAPI.getDummyData().await()
        return result.map {

        }
    }
}