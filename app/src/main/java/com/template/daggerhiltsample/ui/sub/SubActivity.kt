package com.template.daggerhiltsample.ui.sub

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.template.daggerhiltsample.R
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class SubActivity : AppCompatActivity(R.layout.activity_sub) {
    val text: String by lazy(LazyThreadSafetyMode.NONE) {
        intent?.getStringExtra(TEXT).orEmpty()
    }
    private val viewModel by viewModels<SubViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.getText() // viewModelが使われていないと、initが呼ばれない.
    }

    companion object {
        private const val TEXT = "TEXT"
        fun start(context: Context, text: String) {
            context.startActivity(
                Intent(context, SubActivity::class.java).putExtra(
                    TEXT, text
                )
            )
        }
    }
}