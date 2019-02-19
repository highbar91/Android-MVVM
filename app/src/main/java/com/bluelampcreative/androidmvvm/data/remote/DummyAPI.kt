package com.bluelampcreative.androidmvvm.data.remote

import com.bluelampcreative.androidmvvm.models.Dummy
import retrofit2.Response
import retrofit2.http.GET

interface DummyAPI {

    @GET("/dev/data")
    suspend fun getDummyData(): Response<List<Dummy>>

}