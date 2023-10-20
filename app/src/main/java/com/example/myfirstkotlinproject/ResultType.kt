package com.example.myfirstkotlinproject

sealed class ResultType{
    object Sucesses : ResultType();
    object Loding : ResultType();
    object idle : ResultType();
}
