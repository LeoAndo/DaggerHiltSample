package com.template.daggerhiltsample.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.template.daggerhiltsample.TestService
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

// https://developer.android.com/training/dependency-injection/hilt-android#predefined-qualifiers
// @ApplicationContext , @ActivityContext については上記参照.
@HiltViewModel
class HomeViewModel @Inject constructor(testService: TestService) : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    init {
        Log.d("HomeViewModel", "testService.getText(): ${testService.getText()}")
    }
}