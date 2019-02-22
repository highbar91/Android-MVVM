package com.bluelampcreative.androidmvvm.core

import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import org.koin.android.ext.android.inject

abstract class BaseFragment : Fragment() {

    val navOptions: NavOptions by inject()
}