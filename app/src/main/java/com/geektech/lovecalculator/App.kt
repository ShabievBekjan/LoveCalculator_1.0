package com.geektech.lovecalculator
import android.app.Application
import com.geektech.lovecalculator.Love.LoveAPI


    class App:Application() {
        companion object{
            lateinit var api: LoveAPI
        }
        override fun onCreate() {
            super.onCreate()
            api = Retrofit().api
        }
    }
