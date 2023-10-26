package com.example.myfirstkotlinproject.rememberscope

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myfirstkotlinproject.rememberscope.ui.theme.MyFirstKotlinProjectTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.lang.Exception

class RemeberStateCorotinScope : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ScopeCorotin() {
var count by rememberSaveable { mutableStateOf(0) }

    var scope = rememberCoroutineScope()

    Column() {
        var text = "counter runnging $count"
        if(count == 10){
            text = "stop counter"
        }
        Text(text = text)
        Button(onClick = { scope.launch {
            try {
                for (i in 1..10) {
                    count++
                    delay(1000)
                }
            } catch (e: Exception) {
                Log.e("check","data to lanch is ${e.message.toString()}")
            }
        } }) {
          Text(text = "start")
        }
    }

}