package com.android.dailyforecasts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ZwdioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.zwdiolayout)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)

        val zwdiophoto = findViewById<ImageView>(R.id.zwdioPhoto)
        val dailyForecast = findViewById<TextView>(R.id.dailyForecast)
        val weeklyForecast = findViewById<TextView>(R.id.weeklyForecast)
        val monthlyForecast = findViewById<TextView>(R.id.monthlyForecast)
        val yearlyForecast = findViewById<TextView>(R.id.yearlyForecast)

        val zwdioname = intent.extras?.getString("zwdioSelected") ?: getString(R.string.zwdiotitle)
        val zwdioname2 = findViewById<TextView>(R.id.zwdioname)
        zwdioname2.setText(zwdioname.toString())

        val backButton = findViewById<ImageView>(R.id.backButton)
        backButton.setOnClickListener {
            finish()
        }

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

        dailyForecast.setOnClickListener {
            val intent = Intent(this@ZwdioActivity, ForecastActivity::class.java)
            intent.putExtra("zwdioSelected", zwdioname2.text)
            intent.putExtra("forecastType", "Daily Forecast")
            startActivity(intent)
        }

        weeklyForecast.setOnClickListener {
            val intent = Intent(this@ZwdioActivity, ForecastActivity::class.java)
            intent.putExtra("zwdioSelected", zwdioname2.text)
            intent.putExtra("forecastType", "Weekly Forecast")
            startActivity(intent)
        }

        monthlyForecast.setOnClickListener {
            val intent = Intent(this@ZwdioActivity, ForecastActivity::class.java)
            intent.putExtra("zwdioSelected", zwdioname2.text)
            intent.putExtra("forecastType", "Monthly Forecast")
            startActivity(intent)
        }

        yearlyForecast.setOnClickListener {
            val intent = Intent(this@ZwdioActivity, ForecastActivity::class.java)
            intent.putExtra("zwdioSelected", zwdioname2.text)
            intent.putExtra("forecastType", "Yearly Forecast")
            startActivity(intent)
        }


    }


}