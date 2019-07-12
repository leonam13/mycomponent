package com.example.mycomponent.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mycomponent.R
import com.example.mycomponent.view.EmotionalFaceView.Companion.HAPPY
import com.example.mycomponent.view.EmotionalFaceView.Companion.SAD
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        emotionalView.setOnClickListener {
            emotionalView.happinessState = if (emotionalView.happinessState == HAPPY) SAD else HAPPY
        }
    }
}
