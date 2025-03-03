package com.example.a30_12_2024_roomdatabase_demo

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Product::class], version = 1)
abstract class ProductDatabase : RoomDatabase() {
    abstract fun getProductDao(): ProductDao
}