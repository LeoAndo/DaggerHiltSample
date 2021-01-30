package com.template.daggerhiltsample.ui.home

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.template.daggerhiltsample.TestService
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.qualifiers.ApplicationContext

// https://developer.android.com/training/dependency-injection/hilt-android#predefined-qualifiers
// @ApplicationContext , @ActivityContext については上記参照.
class HomeViewModel @ViewModelInject constructor(
    @ApplicationContext private val applicationContext: Context,
    @ActivityContext private val activityContext: Context,
    testService: TestService
) : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    init {
        Log.w(
            "andoleo",
            "applicationContext: $applicationContext activityContext: $activityContext"
        )
        Toast.makeText(activityContext, testService.getText(), Toast.LENGTH_LONG).show()
    }
}