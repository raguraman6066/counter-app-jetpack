package com.example.counterappjetpack

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

//drive ui from model
class MyViewModel():ViewModel() {

    var count by mutableStateOf(0)

    fun increaseCount(){
        count++
    }


}