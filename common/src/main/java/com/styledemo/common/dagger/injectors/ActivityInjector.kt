package com.styledemo.common.dagger.injectors

import com.styledemo.common.activities.MainActivity
import com.styledemo.common.activities.SecondActivity
import com.styledemo.common.contracts.LibraryDependencyResolver
import com.styledemo.common.dagger.components.DaggerLibraryComponent
import com.styledemo.common.dagger.components.LibraryComponent

internal class ActivityInjector {
    companion object {

        private var libraryComponent: LibraryComponent? = null

        fun inject(activity: MainActivity) = libraryComponent?.inject(activity)
        fun inject(activity: SecondActivity) = libraryComponent?.inject(activity)

        fun init(dependencyResolver: LibraryDependencyResolver) {
            libraryComponent = DaggerLibraryComponent
                .builder()
                .libraryDependencyResolver(dependencyResolver)
                .build()
        }
    }
}