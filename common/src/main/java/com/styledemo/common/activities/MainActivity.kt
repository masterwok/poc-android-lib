package com.styledemo.common.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.styledemo.common.R
import contracts.Foo
import dagger.LibraryClient
import dagger.injectors.ActivityInjector
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    @JvmField
    var test: Foo? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        ActivityInjector.inject(this)
        verifyInjection()

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        subscribeToViewComponents()
    }

    private fun verifyInjection() {
        if(test == null) {
            Log.w("activity_main", "Dependency shouldn't have been null.")
            return
        }

        for (n in 1..100) {
            Log.d("activity_main", test!!.bar() + "_" + n)
        }
    }

    private fun subscribeToViewComponents() {
        buttonStartSecondActivity.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }
}

