package com.example.myfirstkotlinproject.rememberscope

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.delay

class RemenberUpdateState : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App1()
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun App1() {
    var counter by remember { mutableStateOf(0) }
    LaunchedEffect(key1 = Unit ){
        delay(2000)
        counter =10
    }
    counter(counter)

}
@Composable
fun counter(counter: Int) {
    var value = rememberUpdatedState(newValue =counter)
    LaunchedEffect(key1 = value ){
        delay(5000)
        Log.e("check", "counter: ${value.value}", )
    }
Text(text = counter.toString())

}
