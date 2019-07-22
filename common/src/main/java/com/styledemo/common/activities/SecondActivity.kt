package com.styledemo.common.activities

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.styledemo.common.R
import contracts.Foo
import dagger.injectors.ActivityInjector
import javax.inject.Inject

class SecondActivity : AppCompatActivity() {

    @Inject
    @JvmField
    var test: Foo? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        ActivityInjector.inject(this)
        verifyInjection()

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_second)
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
}