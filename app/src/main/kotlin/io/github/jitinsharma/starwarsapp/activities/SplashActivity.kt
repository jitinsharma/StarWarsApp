package io.github.jitinsharma.starwarsapp.activities

import android.app.ActivityOptions
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import io.github.jitinsharma.starwarsapp.MainActivity
import io.github.jitinsharma.starwarsapp.R
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide()
        val handler = Handler()
        handler.postDelayed({
            val intent  = Intent(baseContext, MainActivity::class.java)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                val options = ActivityOptions.makeSceneTransitionAnimation(this, splashLogo, "logo")
                startActivity(intent, options.toBundle())
            }
            else{
                startActivity(intent)
            }
        }, 1000)

        handler.postDelayed({
            finish()
        }, 1500)
    }
}