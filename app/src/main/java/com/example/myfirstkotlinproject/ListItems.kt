package com.example.myfirstkotlinproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfirstkotlinproject.ui.theme.MyFirstKotlinProjectTheme
import java.nio.file.WatchEvent

class ListItems : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var scrollState = rememberScrollState()
//            Column(modifier = Modifier.verticalScroll(scrollState)) {
//                for(i in 1..50) {
//                    Text(text = "Item $i",
//                    fontSize = 24.sp,
//                        textAlign = TextAlign.Center,
//                    fontWeight = FontWeight.Bold,
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(vertical = 20.dp)
//                    )
//            }
//            }
            LazyColumn(){
                itemsIndexed(
                    listOf("hi","hello","how","ARE","YOU")
                ){ index, item -> 
                    Text(text = "$item : $index",
                        fontSize = 24.sp,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 20.dp))
                }
//                items(500) {
//                    Text(text = "Item $it",
//                        fontSize = 24.sp,
//                        textAlign = TextAlign.Center,
//                        fontWeight = FontWeight.Bold,
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(vertical = 20.dp)
//                    )
//                }
            }

        }
    }
}
