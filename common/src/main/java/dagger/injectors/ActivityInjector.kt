package dagger.injectors

import com.styledemo.common.activities.MainActivity
import com.styledemo.common.activities.SecondActivity
import dagger.LibraryClient
import dagger.components.DaggerLibraryComponent
import dagger.components.LibraryComponent

internal class ActivityInjector {
    companion object {

        private var libraryComponent: LibraryComponent? = null

        fun inject(activity: MainActivity) = libraryComponent?.inject(activity)
        fun inject(activity: SecondActivity) = libraryComponent?.inject(activity)

        fun init(dependencyResolver: LibraryClient.DependencyResolver) {
            libraryComponent = DaggerLibraryComponent
                .builder()
                .dependencyResolver(dependencyResolver)
                .build()
        }
    }
}