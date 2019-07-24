package com.styledemo.common.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.styledemo.common.R
import com.styledemo.common.contracts.LibraryDependencyResolver
import com.styledemo.common.dagger.injectors.ActivityInjector
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var libraryDependencyResolver: LibraryDependencyResolver

    override fun onCreate(savedInstanceState: Bundle?) {
        ActivityInjector.inject(this)

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        subscribeToViewComponents()

        libraryDependencyResolver.configureFirstActivity(this)
    }

    private fun subscribeToViewComponents() {
        buttonStartSecondActivity.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }
}

