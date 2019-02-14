package com.bluelampcreative.androidmvvm.data.remote

import com.bluelampcreative.androidmvvm.models.Dummy
import kotlinx.coroutines.Deferred
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface DummyAPI {

    @GET("/dev/data")
    fun getDummyData(): Single<List<Dummy>>

}