package com.android.dailyforecasts

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData


class ForecastViewModel(application: Application) : AndroidViewModel(application) {
    private val urlMutableLiveData = MutableLiveData<String?>()
    val url: LiveData<String?>
        get() = urlMutableLiveData
    
    fun getString(stringName:Int) = getApplication<Application>().getString(stringName)

    fun loadUrl(zwdio: String?, forecastType: String) {

        when (zwdio) {
            getString(R.string.krios) -> {
                urlMutableLiveData.value = when (forecastType) {
                    getString(R.string.dailyforecast) -> getString(R.string.kriosdaily)
                    getString(R.string.weeklyforecast) -> getString(R.string.kriosweekly)
                    getString(R.string.monthlyforecast) -> getString(R.string.kriosmonthly)
                    getString(R.string.yearlyforecast) -> getString(R.string.kriosyearly)
                    else -> null
                }
            }
            getString(R.string.tavros) -> {
                urlMutableLiveData.value = when (forecastType) {
                    getString(R.string.dailyforecast) -> getString(R.string.tavrosdaily)
                    getString(R.string.weeklyforecast) -> getString(R.string.tavrosweekly)
                    getString(R.string.monthlyforecast) -> getString(R.string.tavrosmonthly)
                    getString(R.string.yearlyforecast) -> getString(R.string.tavrosyearly)
                    else -> null
                }
            }
            getString(R.string.didymoi) -> {
                urlMutableLiveData.value = when (forecastType) {
                    getString(R.string.dailyforecast) -> getString(R.string.didymoidaily)
                    getString(R.string.weeklyforecast) -> getString(R.string.didymosweekly)
                    getString(R.string.monthlyforecast) -> getString(R.string.didymosmonthly)
                    getString(R.string.yearlyforecast) -> getString(R.string.didymosyearly)
                    else -> null
                }
            }
            getString(R.string.karkinos) -> {
                urlMutableLiveData.value = when (forecastType) {
                    getString(R.string.dailyforecast) -> getString(R.string.karkinosdaily)
                    getString(R.string.weeklyforecast) -> getString(R.string.karkinosweekly)
                    getString(R.string.monthlyforecast) -> getString(R.string.karkinosmonthly)
                    getString(R.string.yearlyforecast) -> getString(R.string.karkinosyearly)
                    else -> null
                }
            }
            getString(R.string.leon) -> {
                urlMutableLiveData.value = when (forecastType) {
                    getString(R.string.dailyforecast) -> getString(R.string.leondaily)
                    getString(R.string.weeklyforecast) -> getString(R.string.leonweekly)
                    getString(R.string.monthlyforecast) -> getString(R.string.leonmonthly)
                    getString(R.string.yearlyforecast) -> getString(R.string.leonyearly)
                    else -> null
                }
            }
            getString(R.string.parthenos) -> {
                urlMutableLiveData.value = when (forecastType) {
                    getString(R.string.dailyforecast) -> getString(R.string.parthenosdaily)
                    getString(R.string.weeklyforecast) -> getString(R.string.parthenosweekly)
                    getString(R.string.monthlyforecast) -> getString(R.string.parthenosmonthly)
                    getString(R.string.yearlyforecast) -> getString(R.string.parthenosyearly)
                    else -> null
                }
            }
            getString(R.string.zygos) -> {
                urlMutableLiveData.value = when (forecastType) {
                    getString(R.string.dailyforecast) -> getString(R.string.zygosdaily)
                    getString(R.string.weeklyforecast) -> getString(R.string.zygosweekly)
                    getString(R.string.monthlyforecast) -> getString(R.string.zygosmonthly)
                    getString(R.string.yearlyforecast) -> getString(R.string.zygosyearly)
                    else -> null
                }
            }
            getString(R.string.skorpios) -> {
                urlMutableLiveData.value = when (forecastType) {
                    getString(R.string.dailyforecast) -> getString(R.string.skorpiosdaily)
                    getString(R.string.weeklyforecast) -> getString(R.string.skorpiosweekly)
                    getString(R.string.monthlyforecast) -> getString(R.string.skorpiosmonthly)
                    getString(R.string.yearlyforecast) -> getString(R.string.skorpiosyearly)
                    else -> null
                }
            }
            getString(R.string.toxotis) -> {
                urlMutableLiveData.value = when (forecastType) {
                    getString(R.string.dailyforecast) -> getString(R.string.toxotisdaily)
                    getString(R.string.weeklyforecast) -> getString(R.string.toxotisweekly)
                    getString(R.string.monthlyforecast) -> getString(R.string.toxotismonthly)
                    getString(R.string.yearlyforecast) -> getString(R.string.toxotisyearly)
                    else -> null
                }
            }
            getString(R.string.aigokerws) -> {
                urlMutableLiveData.value = when (forecastType) {
                    getString(R.string.dailyforecast) -> getString(R.string.aigokerwsdaily)
                    getString(R.string.weeklyforecast) -> getString(R.string.aigokerwsweekly)
                    getString(R.string.monthlyforecast) -> getString(R.string.aigokerwsmonthly)
                    getString(R.string.yearlyforecast) -> getString(R.string.aigokerwsyearly)
                    else -> null
                }
            }
            getString(R.string.ydroxoos) -> {
                urlMutableLiveData.value = when (forecastType) {
                    getString(R.string.dailyforecast) -> getString(R.string.ydroxoosdaily)
                    getString(R.string.weeklyforecast) -> getString(R.string.ydroxoosweekly)
                    getString(R.string.monthlyforecast) -> getString(R.string.ydroxoosmonthly)
                    getString(R.string.yearlyforecast) -> getString(R.string.ydroxoosyearly)
                    else -> null
                }
            }
            getString(R.string.ixthys) -> {
                urlMutableLiveData.value = when (forecastType) {
                    getString(R.string.dailyforecast) -> getString(R.string.ixthysdaily)
                    getString(R.string.weeklyforecast) -> getString(R.string.ixthysweekly)
                    getString(R.string.monthlyforecast) -> getString(R.string.ixthysmonthly)
                    getString(R.string.yearlyforecast) -> getString(R.string.ixthysyearly)
                    else -> null
                }
            }
        }
    }
}