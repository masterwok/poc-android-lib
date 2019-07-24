package com.styledemo.common.dagger.components

import com.styledemo.common.activities.MainActivity
import com.styledemo.common.activities.SecondActivity
import com.styledemo.common.contracts.LibraryDependencyResolver
import dagger.Component
import com.styledemo.common.dagger.LibraryClient
import com.styledemo.common.dagger.modules.LibraryModule

@Component(
    modules = [LibraryModule::class]
    , dependencies = [LibraryDependencyResolver::class]
)
internal interface LibraryComponent {
    fun inject(activity: MainActivity)
    fun inject(activity: SecondActivity)
}
