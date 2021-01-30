package com.template.daggerhiltsample

import javax.inject.Inject

interface TestService {
    fun getText(): String
}

class TestServiceImpl @Inject constructor(
) : TestService {

    override fun getText(): String {
        return "Hello Dagger Hilt"
    }
}