package com.example.love5_2

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.geektech.lovecalculator.Repository
import java.io.Serializable

class   LoveViewModel:ViewModel(), Serializable {

    val repository = Repository()

    fun liveModel(firstName:String,secondName:String):LiveData<LoveViewModel>{
        return repository.getLiveLoveModel(firstName,secondName)
    }

}