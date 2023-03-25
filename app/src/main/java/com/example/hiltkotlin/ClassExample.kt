package com.example.hiltkotlin

import javax.inject.Inject

class ClassExample @Inject constructor(
    @FirstImplementor private val myInterfaceImplementor: MyInterface,
    @SecondImplementor private val mySecondInterfaceImplementor: MyInterface)
{

    fun myFunction(): String {
        return "Working: ${myInterfaceImplementor.myPrintFunction()}"
    }

    fun secondFunction(): String{
        return "Working: ${mySecondInterfaceImplementor.myPrintFunction()}"
    }
}