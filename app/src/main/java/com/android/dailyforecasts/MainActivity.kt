package com.android.dailyforecasts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.databinding.DataBindingUtil
import com.android.dailyforecasts.databinding.ActivityMainBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {
    lateinit var btnShowBottomSheet: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onDialogShow(zwdioTitle: String){
        // on below line we are creating a new bottom sheet dialog.
        val dialog = BottomSheetDialog(this)

        // on below line we are inflating a layout file which we have created.
        val view = layoutInflater.inflate(R.layout.activity_bottom_sheet, null)

        val zwdioname2 = view.findViewById<TextView>(R.id.zwdioname)
        zwdioname2.setText(zwdioTitle)

        val dailyForecast = view.findViewById<TextView>(R.id.dailyForecast)
        val weeklyForecast = view.findViewById<TextView>(R.id.weeklyForecast)
        val monthlyForecast = view.findViewById<TextView>(R.id.monthlyForecast)
        val yearlyForecast = view.findViewById<TextView>(R.id.yearlyForecast)
        // on below line we are creating a variable for our button
        // which we are using to dismiss our dialog.
        val btnClose = view.findViewById<Button>(R.id.idBtnDismiss)

        // on below line we are adding on click listener
        // for our dismissing the dialog button.
        btnClose.setOnClickListener {
            // on below line we are calling a dismiss
            // method to close our dialog.
            dialog.dismiss()
        }
        // below line is use to set cancelable to avoid
        // closing of dialog box when clicking on the screen.
        dialog.setCancelable(false)

        // on below line we are setting
        // content view to our view.
        dialog.setContentView(view)

        // on below line we are calling
        // a show method to display a dialog.
        dialog.show()
        dailyForecast.setOnClickListener {
            val intent = Intent(this@MainActivity, WebViewActivity::class.java)
            intent.putExtra("zwdioSelected", zwdioname2.text)
            intent.putExtra("forecastType", "Daily Forecast")
            startActivity(intent)
        }

        weeklyForecast.setOnClickListener {
            val intent = Intent(this@MainActivity, WebViewActivity::class.java)
            intent.putExtra("zwdioSelected", zwdioname2.text)
            intent.putExtra("forecastType", "Weekly Forecast")
            startActivity(intent)
        }

        monthlyForecast.setOnClickListener {
            val intent = Intent(this@MainActivity, WebViewActivity::class.java)
            intent.putExtra("zwdioSelected", zwdioname2.text)
            intent.putExtra("forecastType", "Monthly Forecast")
            startActivity(intent)
        }

        yearlyForecast.setOnClickListener {
            val intent = Intent(this@MainActivity, WebViewActivity::class.java)
            intent.putExtra("zwdioSelected", zwdioname2.text)
            intent.putExtra("forecastType", "Yearly Forecast")
            startActivity(intent)
        }
    }



    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)

        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)


       /* val title = findViewById<TextView>(R.id.title)
        val kriosTitle = findViewById<TextView>(R.id.kriosTitle)
        val krios = findViewById<ImageView>(R.id.krios)
        val tavros = findViewById<ImageView>(R.id.tavros)
        val tavrosTitle = findViewById<TextView>(R.id.tavrosTitle)
        val didymosTitle = findViewById<TextView>(R.id.didymosTitle)
        val didymos = findViewById<ImageView>(R.id.didymoi)
        val karkinosTitle = findViewById<TextView>(R.id.karkinosTitle)
        val karkinos = findViewById<ImageView>(R.id.karkinos)
        val leonTitle = findViewById<TextView>(R.id.leonTitle)
        val leon = findViewById<ImageView>(R.id.leon)
        val parthenosTitle = findViewById<TextView>(R.id.parthenosTitle)
        val parthenos = findViewById<ImageView>(R.id.parthenos)
        val zygosTitle = findViewById<TextView>(R.id.zygosTitle)
        val zygos = findViewById<ImageView>(R.id.zygos)
        val skorpiosTitle = findViewById<TextView>(R.id.skorpiosTitle)
        val skorpios = findViewById<ImageView>(R.id.skorpios)
        val toxotisTitle = findViewById<TextView>(R.id.toxotisTitle)
        val toxotis = findViewById<ImageView>(R.id.toxotis)
        val aigokerwsTitle = findViewById<TextView>(R.id.aigokerwsTitle)
        val aigokerws = findViewById<ImageView>(R.id.aigokerws)
        val ydroxoosTitle = findViewById<TextView>(R.id.ydroxoosTitle)
        val ydroxoos = findViewById<ImageView>(R.id.ydroxoos)
        val ixthysTitle = findViewById<TextView>(R.id.ixthysTitle)
        val ixthys = findViewById<ImageView>(R.id.ixthyes)*/



        binding.krios.setOnClickListener {
            //onDialogShow(getString(R.string.krios))
            ForecastMenuFragment.newInstance(getString(R.string.krios)).show(supportFragmentManager, ForecastMenuFragment.TAG)

            /* val intent = Intent(this@MainActivity, BottomSheetActivity::class.java)
             intent.putExtra("zwdioSelected", kriosTitle.text)
             startActivity(intent)*/
        }

        binding.kriosTitle.setOnClickListener {
           // onDialogShow(getString(R.string.krios))
            ForecastMenuFragment.newInstance(getString(R.string.krios)).show(supportFragmentManager, ForecastMenuFragment.TAG)

            /*val intent = Intent(this@MainActivity, BottomSheetActivity::class.java)
            intent.putExtra("zwdioSelected", kriosTitle.text)
            startActivity(intent)*/
        }

        binding.tavros.setOnClickListener {
           // onDialogShow(getString(R.string.tavros))
            ForecastMenuFragment.newInstance(getString(R.string.tavros)).show(supportFragmentManager, ForecastMenuFragment.TAG)

            /*val intent = Intent(this@MainActivity, BottomSheetActivity::class.java)
            intent.putExtra("zwdioSelected", tavrosTitle.text)
            startActivity(intent)*/
        }

        binding.tavrosTitle.setOnClickListener {
          //  onDialogShow(getString(R.string.tavros))
            ForecastMenuFragment.newInstance(getString(R.string.tavros)).show(supportFragmentManager, ForecastMenuFragment.TAG)

            /*val intent = Intent(this@MainActivity, BottomSheetActivity::class.java)
            intent.putExtra("zwdioSelected", tavrosTitle.text)
            startActivity(intent)*/
        }

        binding.didymosTitle.setOnClickListener {
           // onDialogShow(getString(R.string.didymoi))
            ForecastMenuFragment.newInstance(getString(R.string.didymoi)).show(supportFragmentManager, ForecastMenuFragment.TAG)

            /*val intent = Intent(this@MainActivity, BottomSheetActivity::class.java)
            intent.putExtra("zwdioSelected", didymosTitle.text)
            startActivity(intent)*/
        }

        binding.didymoi.setOnClickListener {
           // onDialogShow(getString(R.string.didymoi))
            ForecastMenuFragment.newInstance(getString(R.string.didymoi)).show(supportFragmentManager, ForecastMenuFragment.TAG)

            /* val intent = Intent(this@MainActivity, BottomSheetActivity::class.java)
             intent.putExtra("zwdioSelected", didymosTitle.text)
             startActivity(intent)*/
        }

        binding.karkinosTitle.setOnClickListener {
           // onDialogShow(getString(R.string.karkinos))
            ForecastMenuFragment.newInstance(getString(R.string.karkinos)).show(supportFragmentManager, ForecastMenuFragment.TAG)

            /*val intent = Intent(this@MainActivity, BottomSheetActivity::class.java)
            intent.putExtra("zwdioSelected", karkinosTitle.text)
            startActivity(intent)*/
        }

        binding.karkinos.setOnClickListener {
           // onDialogShow(getString(R.string.karkinos))
            ForecastMenuFragment.newInstance(getString(R.string.karkinos)).show(supportFragmentManager, ForecastMenuFragment.TAG)

            /* val intent = Intent(this@MainActivity, BottomSheetActivity::class.java)
             intent.putExtra("zwdioSelected", karkinosTitle.text)
             startActivity(intent)*/
        }

        binding.leonTitle.setOnClickListener {
          //  onDialogShow(getString(R.string.leon))
            ForecastMenuFragment.newInstance(getString(R.string.leon)).show(supportFragmentManager, ForecastMenuFragment.TAG)

            /*  val intent = Intent(this@MainActivity, BottomSheetActivity::class.java)
              intent.putExtra("zwdioSelected", leonTitle.text)
              startActivity(intent)*/
        }

        binding.leon.setOnClickListener {
          //  onDialogShow(getString(R.string.leon))
            ForecastMenuFragment.newInstance(getString(R.string.leon)).show(supportFragmentManager, ForecastMenuFragment.TAG)

            /*val intent = Intent(this@MainActivity, BottomSheetActivity::class.java)
            intent.putExtra("zwdioSelected", leonTitle.text)
            startActivity(intent)*/
        }

        binding.parthenosTitle.setOnClickListener {
            //onDialogShow(getString(R.string.parthenos))
            ForecastMenuFragment.newInstance(getString(R.string.parthenos)).show(supportFragmentManager, ForecastMenuFragment.TAG)

            /*val intent = Intent(this@MainActivity, BottomSheetActivity::class.java)
            intent.putExtra("zwdioSelected", parthenosTitle.text)
            startActivity(intent)*/
        }

        binding.parthenos.setOnClickListener {
          //  onDialogShow(getString(R.string.parthenos))
            ForecastMenuFragment.newInstance(getString(R.string.parthenos)).show(supportFragmentManager, ForecastMenuFragment.TAG)

            /* val intent = Intent(this@MainActivity, BottomSheetActivity::class.java)
             intent.putExtra("zwdioSelected", parthenosTitle.text)
             startActivity(intent)*/
        }

        binding.zygosTitle.setOnClickListener {
            //onDialogShow(getString(R.string.zygos))
            ForecastMenuFragment.newInstance(getString(R.string.zygos)).show(supportFragmentManager, ForecastMenuFragment.TAG)

            /*val intent = Intent(this@MainActivity, BottomSheetActivity::class.java)
            intent.putExtra("zwdioSelected", zygosTitle.text)
            startActivity(intent)*/
        }

        binding.zygos.setOnClickListener {
           // onDialogShow(getString(R.string.zygos))
            ForecastMenuFragment.newInstance(getString(R.string.zygos)).show(supportFragmentManager, ForecastMenuFragment.TAG)

            /*val intent = Intent(this@MainActivity, BottomSheetActivity::class.java)
            intent.putExtra("zwdioSelected", zygosTitle.text)
            startActivity(intent)*/
        }

        binding.skorpiosTitle.setOnClickListener {
           // onDialogShow(getString(R.string.skorpios))
            ForecastMenuFragment.newInstance(getString(R.string.skorpios)).show(supportFragmentManager, ForecastMenuFragment.TAG)

            /*val intent = Intent(this@MainActivity, BottomSheetActivity::class.java)
            intent.putExtra("zwdioSelected", skorpiosTitle.text)
            startActivity(intent)*/
        }

        binding.skorpios.setOnClickListener {
           // onDialogShow(getString(R.string.skorpios))
            ForecastMenuFragment.newInstance(getString(R.string.skorpios)).show(supportFragmentManager, ForecastMenuFragment.TAG)

            /*val intent = Intent(this@MainActivity, BottomSheetActivity::class.java)
            intent.putExtra("zwdioSelected", skorpiosTitle.text)
            startActivity(intent)*/
        }

        binding.toxotisTitle.setOnClickListener {
           // onDialogShow(getString(R.string.toxotis))
            ForecastMenuFragment.newInstance(getString(R.string.toxotis)).show(supportFragmentManager, ForecastMenuFragment.TAG)

            /*val intent = Intent(this@MainActivity, BottomSheetActivity::class.java)
            intent.putExtra("zwdioSelected", toxotisTitle.text)
            startActivity(intent)*/
        }

        binding.toxotis.setOnClickListener {
           // onDialogShow(getString(R.string.toxotis))
            ForecastMenuFragment.newInstance(getString(R.string.toxotis)).show(supportFragmentManager, ForecastMenuFragment.TAG)

            /*val intent = Intent(this@MainActivity, BottomSheetActivity::class.java)
            intent.putExtra("zwdioSelected", toxotisTitle.text)
            startActivity(intent)*/
        }

        binding.aigokerws.setOnClickListener {
          //  onDialogShow(getString(R.string.aigokerws))
            ForecastMenuFragment.newInstance(getString(R.string.aigokerws)).show(supportFragmentManager, ForecastMenuFragment.TAG)

            /* val intent = Intent(this@MainActivity, BottomSheetActivity::class.java)
             intent.putExtra("zwdioSelected", aigokerwsTitle.text)
             startActivity(intent)*/
        }

        binding.aigokerwsTitle.setOnClickListener {
          //  onDialogShow(getString(R.string.aigokerws))
            ForecastMenuFragment.newInstance(getString(R.string.aigokerws)).show(supportFragmentManager, ForecastMenuFragment.TAG)
            /*val intent = Intent(this@MainActivity, BottomSheetActivity::class.java)
            intent.putExtra("zwdioSelected", "Kotlin")
            startActivity(intent)*/
        }

        binding.ydroxoos.setOnClickListener {
          //  onDialogShow(getString(R.string.ydroxoos))
            ForecastMenuFragment.newInstance(getString(R.string.ydroxoos)).show(supportFragmentManager, ForecastMenuFragment.TAG)
            /*val intent = Intent(this@MainActivity, BottomSheetActivity::class.java)
            intent.putExtra("zwdioSelected", ydroxoosTitle.text)
            startActivity(intent)*/
        }

        binding.ydroxoosTitle.setOnClickListener {
         //   onDialogShow(getString(R.string.ydroxoos))
            ForecastMenuFragment.newInstance(getString(R.string.ydroxoos)).show(supportFragmentManager, ForecastMenuFragment.TAG)
            /*val intent = Intent(this@MainActivity, BottomSheetActivity::class.java)
            intent.putExtra("zwdioSelected", ydroxoosTitle.text)
            startActivity(intent)*/
        }

        binding.ixthyes.setOnClickListener {
          //  onDialogShow(getString(R.string.ixthys))
            ForecastMenuFragment.newInstance(getString(R.string.ixthys)).show(supportFragmentManager, ForecastMenuFragment.TAG)
           /* val intent = Intent(this@MainActivity, BottomSheetActivity::class.java)
            intent.putExtra("zwdioSelected", ixthysTitle.text)
            startActivity(intent)*/
        }

        binding.ixthysTitle.setOnClickListener {
          //  onDialogShow(getString(R.string.ixthys))
            ForecastMenuFragment.newInstance(getString(R.string.ixthys)).show(supportFragmentManager, ForecastMenuFragment.TAG)
           /* val intent = Intent(this@MainActivity, BottomSheetActivity::class.java)
            intent.putExtra("zwdioSelected", ixthysTitle.text)
            startActivity(intent)*/
        }
/*
        // initializing our variable for button with its id.
        btnShowBottomSheet = findViewById(R.id.idBtnShowBottomSheet);

        // adding on click listener for our button.
        btnShowBottomSheet.setOnClickListener {

            onDialogShow(R.string.ixthys.toString())

        }*/

    }

}
