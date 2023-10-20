package com.example.myfirstkotlinproject.SimpleScreens

import android.telecom.Call.Details
import android.util.Log
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.example.myfirstkotlinproject.DataManager
import com.example.myfirstkotlinproject.Modles.Book
import com.example.myfirstkotlinproject.R


@Composable
fun QuteListItem(book: Book) {
//
//    BackHandler() {
//        if(DataManager.clicked.value)  DetailScreen(book = book)
//    }
    val fontFamily = FontFamily(
            Font(R.font.youngserif_begular, FontWeight.Thin)
            )
    Card(elevation = CardDefaults.cardElevation(8.dp), modifier = Modifier
        .padding(8.dp)
        .clickable {
            DataManager.setBook(book)
            DataManager.clicked.value = true
            Log.e("check", "$book")
        }
    ){
        Row(modifier = Modifier.padding(10.dp)) {
            Image(painter = rememberAsyncImagePainter(book.imageLink),
                contentDescription ="",
            modifier = Modifier
                .size(20.dp)
                .padding(2.dp))
        Column (modifier = Modifier
            .padding(5.dp, 0.dp, 0.dp, 0.dp)
            .weight(1f)){
            Text(book.author, color = Color.Black, fontSize = 8.sp,
                modifier = Modifier.padding(2.dp,0.dp,5.dp,0.dp),
                maxLines = 3)
            Divider(modifier = Modifier.fillMaxWidth(0.4f))
            Text(text = book.title,color = Color.Black, fontSize = 10.sp, fontWeight = FontWeight.ExtraLight,
            fontFamily = fontFamily,
            )
            }
        }
    }
}


@Composable
fun click(book: Book) {
    DetailScreen(book =book)
}


