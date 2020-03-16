package com.yaakoub.whattodoinparis.ui.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.yaakoub.whattodoinparis.R
import com.yaakoub.whattodoinparis.databinding.ActivitySplashScreenBinding
import com.yaakoub.whattodoinparis.ui.home.HomeActivity

class SplashScreenActivity : AppCompatActivity() {

    private val mHideHandler = Handler()
    private val mRunnable = Runnable {
        startActivity(Intent(this, HomeActivity::class.java))
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivitySplashScreenBinding>(this, R.layout.activity_splash_screen)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        mHideHandler.postDelayed(mRunnable, 2000)
    }

}
