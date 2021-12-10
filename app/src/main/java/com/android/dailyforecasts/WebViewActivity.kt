package com.android.dailyforecasts

import android.app.Application
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.android.dailyforecasts.databinding.ActivityMainBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
//import com.android.dailyforecasts.databinding.WebViewActivityBinding

class WebViewActivity : AppCompatActivity() {
    // private val webView: WebView? = null
    private var webView: WebView? = null
    lateinit var progressBar: ProgressBar

    lateinit var btnShowBottomSheet: Button

   // private lateinit var binding: WebViewActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_web_view)

        val webv = findViewById<WebView>(R.id.webView1)
        webv.getSettings().setJavaScriptEnabled(true)
        progressBar = findViewById(R.id.progressBar1)
        //webv.loadUrl(getString(R.string.kriosdaily))
        // WebViewClient allows you to handle
        // onPageFinished and override Url loading.
        webv.webViewClient = WebViewClient()

        val zwdioname = intent.extras?.getString("zwdioSelected") ?: getString(R.string.zwdiotitle)
        val forecastType =
            intent.extras?.getString("forecastType") ?: getString(R.string.zwdioforecast)

        // if you want to enable zoom feature
        webv.settings.setSupportZoom(true)

        val myViewModel: ForecastViewModel = ViewModelProvider(this).get(ForecastViewModel::class.java)
        myViewModel.loadUrl(zwdioname,forecastType)
        myViewModel.url.observe(this, {url->
            url?.let { webv.loadUrl(it) }

            /*if (it != null) {
                webv.loadUrl(it)
            }*/
        })
       // var myViewModel = ForecastViewModel(this.applicationContext as Application)

     /*   when (zwdioname) {
            getString(R.string.krios) -> {
                when (forecastType) {
                    getString(R.string.dailyforecast) -> webv.loadUrl(getString(R.string.kriosdaily))
                    getString(R.string.weeklyforecast) -> webv.loadUrl(getString(R.string.kriosweekly))
                    getString(R.string.monthlyforecast) -> webv.loadUrl(getString(R.string.kriosmonthly))
                    getString(R.string.yearlyforecast) -> webv.loadUrl(getString(R.string.kriosyearly))
                }
            }
            getString(R.string.tavros) -> {
                when (forecastType) {
                    getString(R.string.dailyforecast) -> webv.loadUrl(getString(R.string.tavrosdaily))
                    getString(R.string.weeklyforecast) -> webv.loadUrl(getString(R.string.tavrosweekly))
                    getString(R.string.monthlyforecast) -> webv.loadUrl(getString(R.string.tavrosmonthly))
                    getString(R.string.yearlyforecast) -> webv.loadUrl(getString(R.string.tavrosyearly))
                }
            }
            getString(R.string.didymoi) -> {
                when (forecastType) {
                    getString(R.string.dailyforecast) -> webv.loadUrl(getString(R.string.didymoidaily))
                    getString(R.string.weeklyforecast) -> webv.loadUrl(getString(R.string.didymosweekly))
                    getString(R.string.monthlyforecast) -> webv.loadUrl(getString(R.string.didymosmonthly))
                    getString(R.string.yearlyforecast) -> webv.loadUrl(getString(R.string.didymosyearly))
                }
            }
            getString(R.string.karkinos) -> {
                when (forecastType) {
                    getString(R.string.dailyforecast) -> webv.loadUrl(getString(R.string.karkinosdaily))
                    getString(R.string.weeklyforecast) -> webv.loadUrl(getString(R.string.karkinosweekly))
                    getString(R.string.monthlyforecast) -> webv.loadUrl(getString(R.string.karkinosmonthly))
                    getString(R.string.yearlyforecast) -> webv.loadUrl(getString(R.string.karkinosyearly))
                }
            }
            getString(R.string.leon) -> {
                when (forecastType) {
                    getString(R.string.dailyforecast) -> webv.loadUrl(getString(R.string.leondaily))
                    getString(R.string.weeklyforecast) -> webv.loadUrl(getString(R.string.leonweekly))
                    getString(R.string.monthlyforecast) -> webv.loadUrl(getString(R.string.leonmonthly))
                    getString(R.string.yearlyforecast) -> webv.loadUrl(getString(R.string.leonyearly))
                }
            }
            getString(R.string.parthenos) -> {
                when (forecastType) {
                    getString(R.string.dailyforecast) -> webv.loadUrl(getString(R.string.parthenosdaily))
                    getString(R.string.weeklyforecast) -> webv.loadUrl(getString(R.string.parthenosweekly))
                    getString(R.string.monthlyforecast) -> webv.loadUrl(getString(R.string.parthenosmonthly))
                    getString(R.string.yearlyforecast) -> webv.loadUrl(getString(R.string.parthenosyearly))
                }
            }
            getString(R.string.zygos) -> {
                when (forecastType) {
                    getString(R.string.dailyforecast) -> webv.loadUrl(getString(R.string.zygosdaily))
                    getString(R.string.weeklyforecast) -> webv.loadUrl(getString(R.string.zygosweekly))
                    getString(R.string.monthlyforecast) -> webv.loadUrl(getString(R.string.zygosmonthly))
                    getString(R.string.yearlyforecast) -> webv.loadUrl(getString(R.string.zygosyearly))
                }
            }
            getString(R.string.skorpios) -> {
                when (forecastType) {
                    getString(R.string.dailyforecast) -> webv.loadUrl(getString(R.string.skorpiosdaily))
                    getString(R.string.weeklyforecast) -> webv.loadUrl(getString(R.string.skorpiosweekly))
                    getString(R.string.monthlyforecast) -> webv.loadUrl(getString(R.string.skorpiosmonthly))
                    getString(R.string.yearlyforecast) -> webv.loadUrl(getString(R.string.skorpiosyearly))
                }
            }
            getString(R.string.toxotis) -> {
                when (forecastType) {
                    getString(R.string.dailyforecast) -> webv.loadUrl(getString(R.string.toxotisdaily))
                    getString(R.string.weeklyforecast) -> webv.loadUrl(getString(R.string.toxotisweekly))
                    getString(R.string.monthlyforecast) -> webv.loadUrl(getString(R.string.toxotismonthly))
                    getString(R.string.yearlyforecast) -> webv.loadUrl(getString(R.string.toxotisyearly))
                }
            }
            getString(R.string.aigokerws) -> {
                when (forecastType) {
                    getString(R.string.dailyforecast) -> webv.loadUrl(getString(R.string.aigokerwsdaily))
                    getString(R.string.weeklyforecast) -> webv.loadUrl(getString(R.string.aigokerwsweekly))
                    getString(R.string.monthlyforecast) -> webv.loadUrl(getString(R.string.aigokerwsmonthly))
                    getString(R.string.yearlyforecast) -> webv.loadUrl(getString(R.string.aigokerwsyearly))
                }
            }
            getString(R.string.ydroxoos) -> {
                when (forecastType) {
                    getString(R.string.dailyforecast) -> webv.loadUrl(getString(R.string.ydroxoosdaily))
                    getString(R.string.weeklyforecast) -> webv.loadUrl(getString(R.string.ydroxoosweekly))
                    getString(R.string.monthlyforecast) -> webv.loadUrl(getString(R.string.ydroxoosmonthly))
                    getString(R.string.yearlyforecast) -> webv.loadUrl(getString(R.string.ydroxoosyearly))
                }
            }
            getString(R.string.ixthys) -> {
                when (forecastType) {
                    getString(R.string.dailyforecast) -> webv.loadUrl(getString(R.string.ixthysdaily))
                    getString(R.string.weeklyforecast) -> webv.loadUrl(getString(R.string.ixthysweekly))
                    getString(R.string.monthlyforecast) -> webv.loadUrl(getString(R.string.ixthysmonthly))
                    getString(R.string.yearlyforecast) -> webv.loadUrl(getString(R.string.ixthysyearly))
                }
            }
        }*/
    }


    inner class WebViewClient : android.webkit.WebViewClient() {

        // Load the URL
        override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
            view.loadUrl(url)
            return false
        }

        // ProgressBar will disappear once page is loaded
        override fun onPageFinished(view: WebView, url: String) {
            super.onPageFinished(view, url)
            progressBar.visibility = View.GONE
        }
    }

}
