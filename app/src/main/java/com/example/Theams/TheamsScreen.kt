package com.example.Theams

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.Theams.ui.theme.MyFirstKotlinProjectTheme

class TheamsScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            changeTheam()
        }
    }
}

@Composable
fun changeTheam() {
    var theam = remember {
        mutableStateOf(false)
    }
    MyFirstKotlinProjectTheme(theam.value) {
        Button(onClick = {
            theam.value = !theam.value
        }) {
            Text(text = "change theam")
        }
    }

}


