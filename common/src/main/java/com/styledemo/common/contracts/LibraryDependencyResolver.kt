package com.styledemo.common.contracts

import androidx.appcompat.app.AppCompatActivity

interface LibraryDependencyResolver {

    fun configureFirstActivity(activity: AppCompatActivity)

    fun configureSecondActivity(activity: AppCompatActivity)

}