package com.example.myfirstkotlinproject.SimpleScreens

import android.telecom.Call.Details
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.myfirstkotlinproject.DataManager
import com.example.myfirstkotlinproject.Modles.Book

@Composable
fun BookList(data : Array<Book>, onClick :(book :Book)-> Unit) {

    LazyColumn(content = {
        items(data){
            QuteListItem(it)
                onClick(it)
        }
    })
}