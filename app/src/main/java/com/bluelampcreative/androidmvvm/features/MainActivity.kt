package com.bluelampcreative.androidmvvm.features

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.bluelampcreative.androidmvvm.R
import org.koin.androidx.viewmodel.ext.viewModel
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private val mainActivityViewModel: MainActivityViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainActivityViewModel.getDummyData()
        mainActivityViewModel.getRemoteDummyData()

        mainActivityViewModel.result.observe(this, Observer {
            for (item in it) {
                Timber.e("This is a dummy item: $item")
            }
        })

        mainActivityViewModel.remoteResult.observe(this, Observer {
            it?.let {
                for (item in it) {
                    Timber.e("This is dummy data from the API $item")
                }
            }
        })
    }

    companion object {
        fun create(context: Context) = Intent(context, MainActivity::class.java)
    }
}
