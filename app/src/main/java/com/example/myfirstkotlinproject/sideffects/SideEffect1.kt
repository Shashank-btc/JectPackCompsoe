package com.example.myfirstkotlinproject.sideffects

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myfirstkotlinproject.sideffects.ui.theme.MyFirstKotlinProjectTheme

class SideEffect1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            ListComposable()
        }
    }
}

//@Preview(showSystemUi = true)
@Composable
fun ListComposable() {
    val car = remember {
        mutableStateOf(emptyList<String>())
    }

    // launchedEffect will be executed only once and even when the key got change it will execute
    // and this will launch corotin it help use to run in background therad
    LaunchedEffect(key1 = Unit ){
        car.value = fetchData()
    }

    LazyColumn{
        items(car.value)  {
            item ->
            Text(text = item)
        }
    }
}

fun fetchData(): List<String> {
return listOf("one","two","three","four")
}


//@Preview(showSystemUi = true)
@Composable
fun CountIncrese() {
    var cont = remember { mutableStateOf(0) }
    var key = cont.value %4  == 0
    Log.e("check", "key is : ${key}", )
    LaunchedEffect(key1 = key){
        Log.e("check", "CountIncrese: ${cont.value}", )
    }
    Button(onClick = {cont.value++}) {
        Text(text = "click ${cont.value}")
    }
}