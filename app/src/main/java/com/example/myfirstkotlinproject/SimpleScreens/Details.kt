package com.example.myfirstkotlinproject.SimpleScreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.example.myfirstkotlinproject.Modles.Book
import com.example.myfirstkotlinproject.R

@Composable
fun DetailScreen(book :Book){
    val colorStops = arrayOf(
        0.1f to Color.White,
        0.5f to Color.Gray,
        0.8f to Color.DarkGray
    )
    Box(contentAlignment = Alignment.BottomCenter,
        modifier = Modifier.fillMaxWidth().height(370.dp)) {
        Card(
            elevation = CardDefaults.cardElevation(8.dp), modifier = Modifier
                .padding(10.dp)
                .fillMaxSize()
                .background(Color.Transparent)
        ) {
            Box(
                modifier = Modifier
                    .background(Brush.verticalGradient(colorStops = colorStops))
            ) {
                Column(modifier = Modifier.background(Color.Transparent)) {
                    Image(
                        painter = rememberAsyncImagePainter(book.imageLink),
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(200.dp)
                            .padding(3.dp)
                            .background(Color.Transparent)
                    )
                    Column(modifier = Modifier.padding(50.dp, 0.dp, 0.dp, 0.dp)) {
                        Text(
                            "author : ${book.author}",
                            modifier = Modifier
                                .padding(2.dp)
                                .fillMaxWidth(),
                            fontWeight = FontWeight.Bold,
                            color = Color.White, fontSize = 25.sp
                        )
                        Text(
                            "country : ${book.country}",
                            modifier = Modifier.padding(2.dp),
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontSize = 25.sp
                        )
                        Text(
                            "language : ${book.language}",
                            modifier = Modifier.padding(2.dp),
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontSize = 25.sp
                        )
                        Text(
                            "Year : ${book.year}",
                            modifier = Modifier.padding(2.dp),
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontSize = 25.sp
                        )

                    }
                }
            }
        }
    }
}