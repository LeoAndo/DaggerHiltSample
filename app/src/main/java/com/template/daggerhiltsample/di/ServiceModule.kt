package com.template.daggerhiltsample.di

import com.template.daggerhiltsample.TestService
import com.template.daggerhiltsample.TestServiceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

// https://developer.android.com/training/dependency-injection/hilt-android#inject-interfaces
// @Binds を使用してインターフェース インスタンスを注入する
// https://developer.android.com/training/dependency-injection/hilt-android#component-lifetimes
// 各コンポーネントの生存期間については上記参照.
@Module
@InstallIn(SingletonComponent::class) // アプリケーションスコープ
abstract class ServiceModule {
    @Binds
    abstract fun bindTestService(testServiceImpl: TestServiceImpl): TestService
}