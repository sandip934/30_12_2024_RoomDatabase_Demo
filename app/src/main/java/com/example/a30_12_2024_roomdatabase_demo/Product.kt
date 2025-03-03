package com.example.a30_12_2024_roomdatabase_demo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products")
data class Product(
    @PrimaryKey
    var id : Int,

    @ColumnInfo(name = "product_title")
    var title : String,

    var price : Int
)
