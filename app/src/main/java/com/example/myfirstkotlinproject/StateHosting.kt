package com.example.myfirstkotlinproject

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class  StateHosting : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            fun NotifcationScreen2() {
                var count by rememberSaveable { mutableStateOf(0) };
                Column(
                    verticalArrangement= Arrangement.Center,
                    horizontalAlignment =Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxSize(1f)
                ) {
                    NotifcationCounter1(count) { count++ }
                    MessageBar(count)
                }
//            }
        }
    }
}

@Preview
@Composable
fun NotifcationScreen1() {
    var count by rememberSaveable { mutableStateOf(0) };
    Column(
        verticalArrangement= Arrangement.Center,
        horizontalAlignment =Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(1f)
    ) {
        NotifcationCounter1(count) { count++ }
        MessageBar(count)
    }
}

@Composable
fun NotifcationCounter1(count: Int, increment: () -> Unit) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier= Modifier.background(Color.White)
    ) {
        Text(text = "you have sent $count notification", )  }
    Button(onClick = {
       increment()
        Log.e("check","counter is $count")
    }) {
        Text(text = "Send Notifcation")
    }
}

@Composable
fun MessageBar(count: Int) {
    Card(
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Row(Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically) {
            Image(painter = painterResource(id = R.drawable.snowman),contentDescription = "",
                Modifier.padding(4.dp).size(40.dp))
            Text(text = "message set so for -$count")
        }

    }
}