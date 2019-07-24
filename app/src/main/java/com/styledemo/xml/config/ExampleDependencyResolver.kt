package com.styledemo.xml.config

import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.styledemo.common.contracts.LibraryDependencyResolver


class ExampleDependencyResolver : LibraryDependencyResolver {
    override fun configureSecondActivity(activity: AppCompatActivity) {
        Log.d("app", "Hello, second activity")
    }

    override fun configureFirstActivity(activity: AppCompatActivity) {
        Log.d("app", "Hello, first activity")
    }
}