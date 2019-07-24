package com.styledemo.common.dagger

import android.content.Context
import com.styledemo.common.contracts.LibraryDependencyResolver
import com.styledemo.common.dagger.injectors.ActivityInjector

interface LibraryClient {

    fun startFirstActivity(context: Context)
    fun startSecondActivity(context: Context)

    companion object {
        fun getInstance(dependencyResolver: LibraryDependencyResolver): LibraryClient {

            ActivityInjector.init(dependencyResolver)

            return LibraryClientImp()
        }
    }
}