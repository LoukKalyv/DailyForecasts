package com.android.dailyforecasts

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.DialogFragment
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class ForecastMenuFragment : BottomSheetDialogFragment() {

    companion object {

        const val TAG = "SimpleDialog"

        private const val ZWDIO_NAME = "zwdio"

        fun newInstance(zwdio: String): ForecastMenuFragment {
            val args = Bundle()
            args.putString(ZWDIO_NAME, zwdio)

            val fragment = ForecastMenuFragment()
            fragment.arguments = args
            return fragment
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_simple_dialog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView(view)

    }


    private fun setupView(view: View) {
        val forecastType = view.findViewById<AppCompatTextView>(R.id.chooseForecast)
        forecastType.text = getString(R.string.choose_forecast)
        val zwdioName = view.findViewById<AppCompatTextView>(R.id.zwdioname)
        val zwdio = arguments?.getString(ZWDIO_NAME)
        zwdioName.text = zwdio
        val dailyForecast = view.findViewById<AppCompatTextView>(R.id.dailyForecast)
        dailyForecast.text = getString(R.string.dailyforecast)
        val weeklyForecast = view.findViewById<AppCompatTextView>(R.id.weeklyForecast)
        weeklyForecast.text = getString(R.string.weeklyforecast)
        val monthlyForecast = view.findViewById<AppCompatTextView>(R.id.monthlyForecast)
        monthlyForecast.text = getString(R.string.monthlyforecast)
        val yearlyForecast = view.findViewById<AppCompatTextView>(R.id.yearlyForecast)
        yearlyForecast.text = getString(R.string.yearlyforecast)
        dailyForecast.setOnClickListener {
            val intent = Intent(activity, WebViewActivity::class.java)
            intent.putExtra("zwdioSelected", zwdio)
            intent.putExtra("forecastType", "Daily Forecast")
            startActivity(intent)
        }

        weeklyForecast.setOnClickListener {
            val intent = Intent(activity, WebViewActivity::class.java)
            intent.putExtra("zwdioSelected", zwdio)
            intent.putExtra("forecastType", "Weekly Forecast")
            startActivity(intent)
        }

        monthlyForecast.setOnClickListener {
            val intent = Intent(activity, WebViewActivity::class.java)
            intent.putExtra("zwdioSelected", zwdio)
            intent.putExtra("forecastType", "Monthly Forecast")
            startActivity(intent)
        }

        yearlyForecast.setOnClickListener {
            val intent = Intent(activity, WebViewActivity::class.java)
            intent.putExtra("zwdioSelected", zwdio)
            intent.putExtra("forecastType", "Yearly Forecast")
            startActivity(intent)
        }

        val btnClose = view.findViewById<Button>(R.id.idBtnDismiss)

        // on below line we are adding on click listener
        // for our dismissing the dialog button.
        btnClose.setOnClickListener {
            // on below line we are calling a dismiss
            // method to close our dialog.
            dismiss()
        }
    }


}

