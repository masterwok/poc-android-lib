package com.styledemo.common.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.styledemo.common.R
import com.styledemo.common.contracts.LibraryDependencyResolver
import com.styledemo.common.dagger.injectors.ActivityInjector
import javax.inject.Inject

class SecondActivity : AppCompatActivity() {

    @Inject
    lateinit var libraryDependencyResolver: LibraryDependencyResolver

    override fun onCreate(savedInstanceState: Bundle?) {
        ActivityInjector.inject(this)

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_second)

        libraryDependencyResolver.configureSecondActivity(this)
    }
}