package com.example.myfirstkotlinproject

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class FackViewModel :ViewModel() {

    val state : MutableState<ResultType.idle> = mutableStateOf(ResultType.idle)

}
