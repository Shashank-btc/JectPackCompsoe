package com.example.myfirstkotlinproject.rememberscope

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myfirstkotlinproject.rememberscope.ui.theme.MyFirstKotlinProjectTheme
import kotlinx.coroutines.delay
import java.lang.Exception

class  RemenberScope : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LanchEffectdata()
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun LanchEffectdata() {
    var count = remember {
        mutableStateOf(0)
    }
    LaunchedEffect(key1 = Unit ){
        try {
            for( i in 1..10){
                count.value++
                delay(1000)
            }
        } catch (e: Exception) {
            Log.e("check", "execption is ${e.message.toString()}")
        }
    }
    var text = "counter ${count.value}"
    if(count.value ==10){
        text ="counter Stop"
    }
    Text(text = text)
}
