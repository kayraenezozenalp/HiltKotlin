package com.example.hiltkotlin

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier
import javax.inject.Singleton

interface MyInterface {

    fun myPrintFunction() : String

}

@InstallIn(SingletonComponent::class)
@Module
class MyModule{

    @FirstImplementor
    @Singleton
    @Provides
    fun providerFunction() : MyInterface{
        return InterfaceImplementor()
    }

    @SecondImplementor
    @Singleton
    @Provides
    fun secondProvicerFunction() : MyInterface{
        return SecondInterfaceImplementor()
    }

}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FirstImplementor

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SecondImplementor