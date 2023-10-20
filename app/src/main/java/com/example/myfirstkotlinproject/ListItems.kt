package com.example.myfirstkotlinproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
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
//            LazyColumn(){
//                itemsIndexed(
//                    listOf("hi","hello","how","ARE","YOU")
//                ){ index, item ->
//                    Text(text = "$item : $index",
//                        fontSize = 24.sp,
//                        textAlign = TextAlign.Center,
//                        fontWeight = FontWeight.Bold,
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(vertical = 20.dp))
//                }
////                items(500) {
////                    Text(text = "Item $it",
////                        fontSize = 24.sp,
////                        textAlign = TextAlign.Center,
////                        fontWeight = FontWeight.Bold,
////                        modifier = Modifier
////                            .fillMaxWidth()
////                            .padding(vertical = 20.dp)
////                    )
////                }
//            }
            LazyColumn(content = {
                items(ListOfDatas()){
                    ListViewData(img = it.img, name = it.name, des =it.des )
                }
            })
        }
    }
}

    @Composable
    @Preview(showBackground = true)
    fun ListView() {
//    Box(){
//        Row() {
////            Card(shape = RoundedCornerShape(50f)) {
//
//                Image(painter = painterResource(id = R.drawable.snowman), contentDescription ="",
//                    modifier = Modifier
//                        .padding(0.dp, 0.dp, 10.dp, 0.dp)
//                        .clip(CircleShape)
//                        .border(2.dp, Color.LightGray, CircleShape)
//                        .size(50.dp),
//                    contentScale = ContentScale.FillBounds)
////            }
//            Column() {
//                Text(text = "Shashank")
//                Text(text = "Android dev")
//            }
//        }
//    }
    }

    @Composable
    fun ListViewData(img: Int, name: String, des: String) {
        Card(
            elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
            modifier = Modifier.padding(10.dp)
        ) {

            Box() {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(8.dp)
                ) {
//            Card(shape = RoundedCornerShape(50f)) {

                    Image(
                        painter = painterResource(id = img), contentDescription = "",
                        modifier = Modifier
                            .clip(CircleShape)
                            .border(2.dp, Color.LightGray, CircleShape)
                            .size(50.dp),
                        contentScale = ContentScale.FillBounds
                    )
//            }
                    Column(modifier = Modifier.weight(.8f).padding(8.dp)) {
                        Text(text = name)
                        Text(text = des)
                    }
                }
            }
        }
    }

data class Catogery(val img: Int, val name: String, val des: String)

    fun ListOfDatas(): MutableList<Catogery> {
        val list = mutableListOf<Catogery>()
        list.add((Catogery(R.drawable.snowman, "sai", "it")))
        list.add(Catogery(R.drawable.snowman, "sai2", "it"))
        list.add(Catogery(R.drawable.snowman, "sai3", "it"))
        list.add(Catogery(R.drawable.snowman, "sai4", "it"))
        list.add(Catogery(R.drawable.snowman, "sai5", "it"))
        list.add(Catogery(R.drawable.snowman, "sai6", "it"))
        list.add(Catogery(R.drawable.snowman, "sai7", "it"))
        list.add(Catogery(R.drawable.snowman, "sai8", "it"))
        list.add(Catogery(R.drawable.snowman, "sai9", "it"))
        list.add(Catogery(R.drawable.snowman, "sai10", "it"))
        list.add(Catogery(R.drawable.snowman, "sai11", "it"))
        list.add(Catogery(R.drawable.snowman, "sai12", "it"))
        list.add(Catogery(R.drawable.snowman, "sai13", "it"))
        list.add(Catogery(R.drawable.snowman, "sai14", "it"))
        list.add(Catogery(R.drawable.snowman, "sai15", "it"))
        list.add(Catogery(R.drawable.snowman, "sai16", "it"))
        list.add(Catogery(R.drawable.snowman, "sai17", "it"))
        list.add(Catogery(R.drawable.snowman, "sai18", "it"))
        return list
    }
