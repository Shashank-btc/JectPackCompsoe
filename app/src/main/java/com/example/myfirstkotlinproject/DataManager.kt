package com.example.myfirstkotlinproject

import android.content.Context
import android.util.Log
import androidx.compose.runtime.mutableStateOf
import com.example.myfirstkotlinproject.Modles.Book
import com.google.gson.Gson

object DataManager {
var data = emptyArray<Book>()
    var state = mutableStateOf(false)
    var clicked = mutableStateOf(false)
    var bookData : Book ?= null;

    fun loadAssets(context :Context) {
        val inputStrem = context.assets.open("books.json")
        var size : Int =inputStrem.available()
        val buffer = ByteArray(size)
        inputStrem.read(buffer)
        inputStrem.close()
        val json = String(buffer, Charsets.UTF_8)
        val gson = Gson()
        data = gson.fromJson(json, Array<Book> :: class.java)
        state.value = true;
    }

    fun setBook(book : Book) {
        Log.e("check", "setBook: $book")
        bookData = book
    }
}