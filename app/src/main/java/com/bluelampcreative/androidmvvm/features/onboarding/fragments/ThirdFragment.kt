package com.bluelampcreative.androidmvvm.features.onboarding.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bluelampcreative.androidmvvm.R
import com.bluelampcreative.androidmvvm.core.BaseFragment
import kotlinx.android.synthetic.main.fragment_home.*

class ThirdFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_next.setOnClickListener {
            findNavController().navigate(R.id.secondFragment, null, navOptions)
        }
    }
}