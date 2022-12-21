package com.codebox.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SampleActiviy1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_activiy1)
        CoachMarkHelper().showCoachMarks(this, "YOUR BUTTON", findViewById(R.id.button6))
    }
}