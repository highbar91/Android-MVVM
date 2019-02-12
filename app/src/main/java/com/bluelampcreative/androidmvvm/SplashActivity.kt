package com.bluelampcreative.androidmvvm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bluelampcreative.androidmvvm.features.MainActivity
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class SplashActivity : AppCompatActivity(), CoroutineScope {

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main + Job()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        launch {
            delay(1000)
            startActivity(MainActivity.create(this@SplashActivity))
        }

    }
}