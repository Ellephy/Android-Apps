package com.ap2.criminalintent

import android.text.format.DateFormat
import java.util.*

class Helpers {
    companion object {
        fun changeDateFormat(date: Date): String {
            val dateFormat = DateFormat.format("EEEE, MMM d, yyyy", date)
            return dateFormat.toString()
        }
    }
}