package com.bluelampcreative.androidmvvm.data.repositories

import com.bluelampcreative.androidmvvm.models.Dummy

interface DataRepository {
    suspend fun getDummyData(): List<Dummy>
    suspend fun getRemoteDummyData(): List<Dummy>
}