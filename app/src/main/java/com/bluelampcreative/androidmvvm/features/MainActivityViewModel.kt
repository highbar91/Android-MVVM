package com.bluelampcreative.androidmvvm.features

import androidx.lifecycle.MutableLiveData
import com.bluelampcreative.androidmvvm.core.BaseViewModel
import com.bluelampcreative.androidmvvm.data.repositories.DataRepositoryImpl
import com.bluelampcreative.androidmvvm.models.Dummy
import kotlinx.coroutines.launch

class MainActivityViewModel(private val dataRepositoryImpl: DataRepositoryImpl) : BaseViewModel() {

    val result = MutableLiveData<List<Dummy>>()
    val remoteResult = MutableLiveData<List<Dummy>?>()

    fun getDummyData() {
        launch {
            result.value = dataRepositoryImpl.getDummyData()
        }
    }

    fun getRemoteDummyData() {
        launch {
            remoteResult.value = dataRepositoryImpl.getRemoteDummyData()
        }
    }
}