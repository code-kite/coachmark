package com.codebox.sample

import android.graphics.Rect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SampleActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample2)

        CoachMarkHelper().showCoachMarks(this, "Your feature box", Rect(100,100,100,100))
    }
}