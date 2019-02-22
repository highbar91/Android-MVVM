package com.bluelampcreative.androidmvvm.features.onboarding

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bluelampcreative.androidmvvm.R

class OnboardingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_onboarding)
    }

    companion object {
        fun create(context: Context) = Intent(context, OnboardingActivity::class.java)
    }
}