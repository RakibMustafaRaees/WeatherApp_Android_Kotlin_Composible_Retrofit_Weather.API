package com.example.weatherapp.api


// T refers to weather model
sealed class NetworkResponse<out T> {
    data class Success<out T>(val data : T) : NetworkResponse<T>()
    data class Error(val message : String) : NetworkResponse<Nothing>()
    object  Loading : NetworkResponse<Nothing>()
}