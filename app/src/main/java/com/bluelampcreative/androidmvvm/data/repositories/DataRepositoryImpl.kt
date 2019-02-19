package com.bluelampcreative.androidmvvm.data.repositories

import com.bluelampcreative.androidmvvm.data.local.DataStore
import com.bluelampcreative.androidmvvm.data.remote.DummyDataAPIClient
import com.bluelampcreative.androidmvvm.models.Dummy

class DataRepositoryImpl(private val dataStore: DataStore, private val dummyDataAPIClient: DummyDataAPIClient) :
    DataRepository {

    override suspend fun getDummyData(): List<Dummy> {
        return dataStore.getDummyData()
    }

    override suspend fun getRemoteDummyData(): List<Dummy>{
        return dummyDataAPIClient.getDummyData()
    }
}