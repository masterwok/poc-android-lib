package com.styledemo.xml.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.styledemo.common.dagger.LibraryClient
import com.styledemo.xml.R
import com.styledemo.xml.config.ExampleDependencyResolver
import kotlinx.android.synthetic.main.activity_demo.*

class DemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_demo)

        subscribeToViewComponents()
    }

    private fun subscribeToViewComponents() {
        buttonStartLibrary.setOnClickListener {
            startLibraryActivity()
        }
    }

    private fun startLibraryActivity() {
        LibraryClient
            .getInstance(ExampleDependencyResolver())
    //        .startSecondActivity(this);
            .startFirstActivity(this)
    }
}