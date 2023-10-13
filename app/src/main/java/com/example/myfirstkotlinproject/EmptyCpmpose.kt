package com.example.myfirstkotlinproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class EmptyCpmpose : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fontFamily = FontFamily(
            Font(R.font.youngserif_begular, FontWeight.Thin)
        )
        // Row and colums
//        setContent {
//            Column(Modifier
//                .fillMaxWidth()
//                .fillMaxHeight(0.5f)) {
//                Column(
//                    Modifier
//                        .fillMaxWidth()
//                        .fillMaxHeight(0.5f)
//                        .background(Color.Red),
//                    horizontalAlignment = Alignment.CenterHorizontally,
//                    verticalArrangement = Arrangement.SpaceEvenly
//                ) {
//                    Text("helle")
//                    Text("world")
//                    Text("world")
//                }
//                Row(
//                    Modifier
//                        .background(Color.Green)
//                        .fillMaxWidth(0.5f)
//                        .fillMaxHeight(0.5f),
//                    verticalAlignment = Alignment.CenterVertically,
//                    horizontalArrangement = Arrangement.SpaceEvenly
//                ) {
//                    Text("helle")
//                    Text("world")
//                    Text("world")
//                }
//                Row(
//                    Modifier
//                        .background(Color.Gray)
//                        .fillMaxWidth()
//                        .fillMaxHeight(),
//                    verticalAlignment = Alignment.CenterVertically,
//                    horizontalArrangement = Arrangement.SpaceEvenly
//                ) {
//                    Text("helle")
//                    Text("world")
//                    Text("world")
//                }
//            }
//        }

        /// " modofiers "
//        setContent {
//            Column(Modifier
//                .width(300.dp)
//                .fillMaxHeight(0.5f)
//                .background(Color.Gray)
//                .padding(10.dp)
//                .border(5.dp,Color.Green)
//                .padding(20.dp)
//                .border(5.dp, Color.DarkGray)
//                .padding(10.dp)
//            ) {
//                Text("hello", modifier = Modifier.offset(0.dp,0.dp)
//                    .clickable {  })
//                Text("world")
//            }
//        }

        // create UI

//        setContent {
//            val painter = painterResource(id = R.drawable.snowman)
//            val desc = "snow india image here"
//            val title = "india snow"
//            Box(
//                modifier = Modifier
//                    .fillMaxWidth(0.5f)
//                    .padding(16.dp)
//            ) {
//                ImageCard(painter = painter, contentDesc = desc, title = title)
//            }
//        }
//        Text(
//            "Jectpack Compose",
//            color = Color.White,
//            fontSize = 30.dp,
//            fontFamily = fontFamily)

        // font styles and style text
        setContent {
            Box(modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xFF101010))
                ) {
                Text(
                    buildAnnotatedString {
                                         withStyle(
                                             style = SpanStyle(
                                                 color = Color.Blue,
                                                 fontSize = 40.sp,
                                             )
                                         ){
                                             append("J")
                                         }
                        append("ectpack ")
                        withStyle(
                            style = SpanStyle(
                                color = Color.Blue,
                                fontSize = 40.sp,
                            )
                        ){
                            append("C")
                        }
                        append("ompose")
                    },
                    color = Color.White,
                    fontSize = 30.sp,
                    fontStyle = FontStyle.Italic,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.End,
                    fontFamily = fontFamily,
                textDecoration = TextDecoration.Underline)
            }
        }
    }
}

//@Composable
//fun ImageCard(
//    painter: Painter,
//    contentDesc: String,
//    title: String,
//    modifier: Modifier = Modifier
//) {
//    Card(
//        modifier = modifier.fillMaxWidth(),
//        shape = RoundedCornerShape(15.dp),
//        elevation = CardDefaults.cardElevation(
//            defaultElevation = 5.dp
//        )
//    ) {
//        Box(
//            modifier = Modifier
//                .height(200.dp)
//                .fillMaxWidth()
//        ) {
//            Image(
//                painter = painter,
//                contentDescription = contentDesc,
//                contentScale = ContentScale.FillBounds
//            )
//            Box(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .background(
//                        brush = Brush.verticalGradient(
//                            colors = listOf(
//                                Color.Transparent,
//                                Color.Black,
//                            ),
//                            startY = 450f
//                        )
//                    )
//            )
//            Box(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .padding(12.dp),
//                contentAlignment = Alignment.BottomStart
//            ) {
//                Text(title, style = TextStyle(color = Color.White, fontSize = 16.sp))
//            }
//        }
//    }
//}



