package dagger

import android.content.Context
import contracts.Foo
import dagger.injectors.ActivityInjector

interface LibraryClient {

    interface DependencyResolver {
        fun foo(): Foo
    }

    fun startActivity(context: Context)

    companion object {
        fun getInstance(dependencyResolver: DependencyResolver): LibraryClient {

            ActivityInjector.init(dependencyResolver)

            return LibraryClientImp()
        }
    }
}