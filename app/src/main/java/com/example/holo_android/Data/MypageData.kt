package com.example.holo_android.Data

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Mart(
    val name: String,
    val location: String
)

data class MartData(
    @SerializedName("mart")
    val mart: Mart
)

data class MenuHistoryData(
    @SerializedName("history_date")
    val date: String,

    @SerializedName("image")
    var imageUrl: String,

    @SerializedName("menu")
    val name: String
)