package com.template.daggerhiltsample.ui.sub

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SubViewModel @Inject constructor() : ViewModel() {
    var text: String? = null
    set(value) {
        Log.d("SubViewModel", "before field: $field value: $value")
        field = value
        Log.d("SubViewModel", "after field: $field value: $value")
    }
}