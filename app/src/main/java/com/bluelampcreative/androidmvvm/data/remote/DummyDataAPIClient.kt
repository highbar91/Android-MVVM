package com.bluelampcreative.androidmvvm.data.remote

import com.bluelampcreative.androidmvvm.models.Dummy

class DummyDataAPIClient(private val dummyAPI: DummyAPI) {

    suspend fun getDummyData(): List<Dummy> {
        val response = dummyAPI.getDummyData()
        println(response.code())
        return response.body() ?: emptyList()
    }
}