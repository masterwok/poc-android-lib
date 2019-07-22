package dagger.components

import com.styledemo.common.activities.MainActivity
import com.styledemo.common.activities.SecondActivity
import dagger.Component
import dagger.LibraryClient
import dagger.modules.LibraryModule

@Component(
    modules = [LibraryModule::class]
    , dependencies = [LibraryClient.DependencyResolver::class]
)
internal interface LibraryComponent {
    fun inject(activity: MainActivity)
    fun inject(activity: SecondActivity)
}
