package com.shashank.weatherapp.util

import android.annotation.SuppressLint
import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import java.text.SimpleDateFormat
import java.util.*


object AppUtils {

    fun showProgressBar(requireContext: Context) {
        if (!ProgressBar.getInstance().isDialogShowing()) {
            ProgressBar.getInstance().showProgress(requireContext, false)
        }
    }

    fun hideProgressBar() {
        ProgressBar.getInstance().dismissProgress()
    }

    fun setGlideImage(image: ImageView, url: String) {

        Glide.with(image).load(url)
            .thumbnail(0.5f)
            .into(image)

    }
    fun getCurrentDate(): String? {
        val c = Calendar.getInstance().time
        val df = SimpleDateFormat("dd-MM-yyyy")
        return df.format(c)
    }
    fun calculateIntake(weight: Int, workTime: Int): Double {

        return ((weight * 100 / 3.0) + (workTime / 6 * 7))

    }
    @SuppressLint("SimpleDateFormat")
    fun getCurrentDateTime(dateFormat: String): String =
        SimpleDateFormat(dateFormat).format(Date())

    @SuppressLint("SimpleDateFormat")
    fun isTimeExpired(dateTimeSavedWeather: String?): Boolean {
        dateTimeSavedWeather?.let {
            val currentDateTime = Date()
            val savedWeatherDateTime =
                SimpleDateFormat(AppConstants.DATE_FORMAT_1).parse(it)
            val diff: Long = currentDateTime.time - savedWeatherDateTime.time
            val seconds = diff / 1000
            val minutes = seconds / 60
            if (minutes > 10)
                return true
        }

        return false
    }

    val USERS_SHARED_PREF = "user_pref"
    val PRIVATE_MODE = 0
    val WEIGHT_KEY = "weight"
    val WORK_TIME_KEY = "worktime"
    val TOTAL_INTAKE = "totalintake"
    val NOTIFICATION_STATUS_KEY = "notificationstatus"
    val NOTIFICATION_FREQUENCY_KEY = "notificationfrequency"
    val NOTIFICATION_MSG_KEY = "notificationmsg"
    val SLEEPING_TIME_KEY = "sleepingtime"
    val WAKEUP_TIME = "wakeuptime"
    val NOTIFICATION_TONE_URI_KEY = "notificationtone"
    val FIRST_RUN_KEY = "firstrun"

}