package com.example.myfirstkotlinproject

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myfirstkotlinproject.ui.theme.MyFirstKotlinProjectTheme
import java.util.Random

class Recomposables : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Recompose()
        }
    }
}

@Composable
fun Recompose() {
    var number by  remember {
        mutableStateOf(0.0)
    }
    Log.e("check","intial ")

    Button(onClick ={ number = Math.random()}
    ) {
       Text(text = number.toString())
        Log.e("check","recompse")
    }
}