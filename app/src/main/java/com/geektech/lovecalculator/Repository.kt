package com.geektech.lovecalculator

import android.util.Log
import androidx.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Repository {

    fun getLiveLoveModel(firstName:String,secondName:String):MutableLiveData<LoveViewModel>{
        var liveModel = MutableLiveData<LoveViewModel>()
        Retrofit().api.calculateLove(firstName,secondName).enqueue(object :Callback<LoveViewModel>{
            override fun onResponse(call: Call<LoveViewModel>, response: Response<LoveViewModel>) {
                if(response.isSuccessful){
                    liveModel.postValue(response.body())
                }
            }

            override fun onFailure(call: Call<LoveViewModel>, t: Throwable) {
                Log.e("ololo", "onFailure: ${t.message}", )
            }

        })
        return  liveModel
    }
}