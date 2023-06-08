package com.example.androidsplashtutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val screenSplash = installSplashScreen()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //screenSplash.setKeepOnScreenCondition{true} ->le dice que nunca se valla el splash, con lo cual para dejar de ver el Splash tendriamos que indicar en el codigo pasar a otra Activity
//        val intent = Intent(this,NewScreen::class.java)
//        startActivity(intent)
//        finish()

        //screenSplash.setKeepOnScreenCondition{false} -> indica que haga el splash y cuando haya cargado la Activity que desaparezca el Splash
        screenSplash.setKeepOnScreenCondition{false}
    }
}