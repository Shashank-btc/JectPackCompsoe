package com.example.myfirstkotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Data
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.myfirstkotlinproject.Modles.Book
import com.example.myfirstkotlinproject.SimpleScreens.BookList
import com.example.myfirstkotlinproject.SimpleScreens.DetailScreen
import com.example.myfirstkotlinproject.SimpleScreens.QuteListItem
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        CoroutineScope(Dispatchers.IO).launch {
            DataManager.loadAssets(applicationContext)
        }
        setContent{
            App()
        }
    }
}

@Composable
fun App() {
    if(DataManager.state.value) {
        if(DataManager.clicked.value){
            DetailScreen(book = DataManager.bookData!!)
        } else {
        BookList(DataManager.data){
           book ->
        }
        }
    }
}
