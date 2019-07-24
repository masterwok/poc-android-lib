package dagger

import android.content.Context
import android.content.Intent
import com.styledemo.common.activities.MainActivity
import com.styledemo.common.activities.SecondActivity

class LibraryClientImp : LibraryClient {
    override fun startSecondActivity(context: Context) {
        context.startActivity(Intent(context, SecondActivity::class.java))
    }

    override fun startFirstActivity(context: Context) {
        context.startActivity(Intent(context, MainActivity::class.java))
    }
}