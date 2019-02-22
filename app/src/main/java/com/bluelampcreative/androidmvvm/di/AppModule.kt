package com.bluelampcreative.androidmvvm.di

import androidx.navigation.navOptions
import com.bluelampcreative.androidmvvm.R
import com.bluelampcreative.androidmvvm.data.local.DataStore
import com.bluelampcreative.androidmvvm.data.remote.DummyDataAPIClient
import com.bluelampcreative.androidmvvm.data.repositories.DataRepositoryImpl
import com.bluelampcreative.androidmvvm.di.DatasourceProperties.BASE_URL
import com.bluelampcreative.androidmvvm.features.MainActivityViewModel
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

val uiModule = module {
    viewModel { MainActivityViewModel(get()) }
    single {
        navOptions {
            anim {
                enter = R.anim.slide_in_right
                exit = R.anim.slide_out_left
                popEnter = R.anim.slide_in_left
                popExit = R.anim.slide_out_right
            }
        }
    }
}

val dataModule = module {
    factory { DataRepositoryImpl(get(), get()) }
    factory { DataStore() }
}

val netWorkModule = module {
    single { DummyDataAPIClient(createDummyApi(createOkHttpClient(), BASE_URL)) }
}

val appModule = listOf(uiModule, dataModule, netWorkModule)

object DatasourceProperties {
    const val BASE_URL = "https://pbdvqn1rw1.execute-api.us-east-1.amazonaws.com"
}

fun createOkHttpClient(): OkHttpClient {
    val httpLoggingInterceptor = HttpLoggingInterceptor()
    httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
    return OkHttpClient.Builder()
        .addInterceptor(httpLoggingInterceptor).build()
}

inline fun <reified T> createDummyApi(okHttpClient: OkHttpClient, url: String): T {
    val retrofit = Retrofit.Builder()
        .baseUrl(url)
        .client(okHttpClient)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()
    return retrofit.create(T::class.java)
}