package com.template.daggerhiltsample.ui.sub

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ActivityContext
import javax.inject.Qualifier

@Module
@InstallIn(ActivityComponent::class)
class SubActivityModule {

    @Qualifier
    @Retention(AnnotationRetention.RUNTIME)
    internal annotation class Text

    @Text
    @Provides
    fun provideText(@ActivityContext context: Context): String {
        return (context as SubActivity).text
    }
}