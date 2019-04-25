package com.example.haris.eventlisting

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.util.DisplayMetrics
import java.text.NumberFormat
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*


fun dpToPx(dp: Float, context: Context): Float {
    return dp * (context.resources.displayMetrics.densityDpi.toFloat() / DisplayMetrics.DENSITY_DEFAULT)
}

fun dateFormat(strDate: String): String {
    val readFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val writeFormat = SimpleDateFormat("dd\nMMM")

    var date: Date? = null
    try {
        date = readFormat.parse(strDate)
    } catch (e: ParseException) {
        e.printStackTrace()
    }
    var formattedDate = ""
    if (date != null) {
        formattedDate = writeFormat.format(date)
    }

    return formattedDate

}

fun timeFormat(strStartDate:String, strFinishDate: String): String {
    val readFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val writeFormat = SimpleDateFormat("HH:mm")

    var startDate: Date? = null
    var finishDate: Date? = null
    try {
        startDate = readFormat.parse(strStartDate)
        finishDate = readFormat.parse(strFinishDate)
    } catch (e: ParseException) {
        e.printStackTrace()
    }
    var formattedStartDate = ""
    var formattedFinishDate =""
    if (startDate != null && finishDate != null) {
        formattedStartDate = writeFormat.format(startDate)
        formattedFinishDate = writeFormat.format(finishDate)
    }

    return "$formattedStartDate - $formattedFinishDate"
}
fun toMoney(startPrice:Int, endPrice:Int): String {
    val localeID = Locale("in", "ID")
    val formatRupiah = NumberFormat.getCurrencyInstance(localeID)
    return formatRupiah.format(startPrice)+" - "+formatRupiah.format(endPrice)
}

fun isNetworkAvailable(context: Context): Boolean {
    val connectivity = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    if (connectivity != null) {
        val info = connectivity.allNetworkInfo
        if (info != null) {
            for (i in info.indices) {
                if (info[i].state == NetworkInfo.State.CONNECTED) {
                    return true
                }
            }
        }
    }
    return false
}
