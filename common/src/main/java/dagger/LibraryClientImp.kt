package dagger

import android.content.Context
import android.content.Intent
import com.styledemo.common.activities.MainActivity

class LibraryClientImp : LibraryClient {
    override fun startActivity(context: Context) {
        context.startActivity(Intent(context, MainActivity::class.java))
    }
}