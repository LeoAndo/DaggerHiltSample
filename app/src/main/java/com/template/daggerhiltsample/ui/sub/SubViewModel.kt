package com.template.daggerhiltsample.ui.sub

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import dagger.hilt.android.qualifiers.ActivityContext

class SubViewModel @ViewModelInject constructor(
    @ActivityContext private val activityContext: Context,
    @SubActivityModule.Text private val text: String
) : ViewModel() {
    fun getText() {
        Log.w("andoleo", "text: $text")
    }
    init {
        Log.w("andoleo", "init")
        Toast.makeText(activityContext, text, Toast.LENGTH_LONG).show()
    }
    /*
    2020-07-09 19:31:57.455 7252-7252/com.template.daggerhiltsample W/andoleo: init
    2020-07-09 19:31:57.457 7252-7252/com.template.daggerhiltsample W/andoleo: text: Hello Dagger Hilt
     */
}