package com.shashank.weatherapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.shashank.weatherapp.util.AppUtils
import keyur.diwan.project.waterReminder.helpers.SqliteHelper
import kotlinx.android.synthetic.main.activity_stats.*


class WorkoutPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.coming_soon)
    }

}
