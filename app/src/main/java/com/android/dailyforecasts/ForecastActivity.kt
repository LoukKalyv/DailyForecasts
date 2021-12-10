package com.android.dailyforecasts


import android.os.Bundle
import android.view.MenuItem
import android.view.Menu
import android.webkit.WebView
import android.webkit.WebViewClient
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import android.app.Dialog
import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import android.provider.Settings

import androidx.appcompat.app.AppCompatActivity


class ForecastActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.forecastlayout)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)

        val zwdiophoto = findViewById<ImageView>(R.id.zwdioPhoto)
        // val zwdioname = findViewById<TextView>(R.id.zwdioname)
        //val forecastType = findViewById<TextView>(R.id.typeOfForecast)
        val forecastText = findViewById<TextView>(R.id.forecastText)

        val backButton = findViewById<ImageView>(R.id.backButton)

        backButton.setOnClickListener {
            onBackPressed()
        }

        val zwdioname = intent.extras?.getString("zwdioSelected") ?: getString(R.string.zwdiotitle)
        val zwdioname2 = findViewById<TextView>(R.id.zwdioname)
        zwdioname2.setText(zwdioname.toString())

        val forecastType =
            intent.extras?.getString("forecastType") ?: getString(R.string.zwdioforecast)
        val forecastType2 = findViewById<TextView>(R.id.typeOfForecast)
        forecastType2.setText(forecastType.toString())

        when (zwdioname) {
            getString(R.string.krios) -> {
                zwdiophoto.setImageResource(R.drawable.krios)
            }
            getString(R.string.tavros) -> {
                zwdiophoto.setImageResource(R.drawable.tavros)
            }
            getString(R.string.didymoi) -> {
                zwdiophoto.setImageResource(R.drawable.didymoi)
            }
            getString(R.string.karkinos) -> {
                zwdiophoto.setImageResource(R.drawable.karkinos)
            }
            getString(R.string.leon) -> {
                zwdiophoto.setImageResource(R.drawable.leon)
            }
            getString(R.string.parthenos) -> {
                zwdiophoto.setImageResource(R.drawable.parthenos)
            }
            getString(R.string.zygos) -> {
                zwdiophoto.setImageResource(R.drawable.zygos)
            }
            getString(R.string.skorpios) -> {
                zwdiophoto.setImageResource(R.drawable.skorpios)
            }
            getString(R.string.toxotis) -> {
                zwdiophoto.setImageResource(R.drawable.toxotis)
            }
            getString(R.string.aigokerws) -> {
                zwdiophoto.setImageResource(R.drawable.aigokerws)
            }
            getString(R.string.ydroxoos) -> {
                zwdiophoto.setImageResource(R.drawable.ydroxoos)
            }
            getString(R.string.ixthys) -> {
                zwdiophoto.setImageResource(R.drawable.ixthyes)
            }
        }


        //val webv = findViewById<WebView>(R.id.webView1)
        //  webv.getSettings().setJavaScriptEnabled(true)

        forecastText.setOnClickListener {

            val intent = Intent(this@ForecastActivity, WebViewActivity::class.java)
            intent.putExtra("zwdioSelected", zwdioname)
            when (forecastType) {
                getString(R.string.dailyforecast) -> intent.putExtra(
                    "forecastType",
                    "Daily Forecast"
                )
                getString(R.string.weeklyforecast) -> intent.putExtra(
                    "forecastType",
                    "Weekly Forecast"
                )
                getString(R.string.monthlyforecast) -> intent.putExtra(
                    "forecastType",
                    "Monthly Forecast"
                )
                getString(R.string.yearlyforecast) -> intent.putExtra(
                    "forecastType",
                    "Yearly Forecast"
                )
            }
            startActivity(intent)

        }


    }


}


